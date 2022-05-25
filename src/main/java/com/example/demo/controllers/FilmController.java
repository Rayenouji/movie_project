package com.example.demo.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;
import com.example.demo.service.DirService;
import com.example.demo.service.FilmService;

@Controller
public class FilmController {
	@Autowired
	FilmService FilmService;
	@Autowired
	DirService dirService;

	@RequestMapping("/showCreate")
	public String showCreate(ModelMap modelMap) {
		List<Director> cats = dirService.findAll();
		Film prod = new Film();
		Director cat = new Director();
		cat = cats.get(0); // prendre la première catégorie de la liste
		prod.setDirector(cat); // affedter une catégorie par défaut au produit pour éviter le pb avec une
								// catégorie null
		modelMap.addAttribute("Directors", cats);
		modelMap.addAttribute("Film", new Film());
		modelMap.addAttribute("mode", "new");
		return "formFilm";
	}

	@RequestMapping("/saveFilm")
	public String saveProduit(@Valid Film film, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "formFilm";
		FilmService.saveFilm(film);

		return "redirect:/ListeFilms";
	}

	@RequestMapping("/ListeFilms")
	public String listeFilms(ModelMap modelMap,

			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "5") int size)

	{
		Page<Film> prods = FilmService.getAllFilmsParPage(page, size);
		modelMap.addAttribute("Films", prods);

		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);

		modelMap.addAttribute("currentPage", page);
		return "listeFilms";
	}

	@RequestMapping("/supprimerFilm")
	public String supprimerFilm(@RequestParam("id") Long id,

			ModelMap modelMap, @RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "2") int size)

	{
		FilmService.deleteFilmById(id);
		Page<Film> prods = FilmService.getAllFilmsParPage(page, size);

		modelMap.addAttribute("Films", prods);
		modelMap.addAttribute("pages", new int[prods.getTotalPages()]);
		modelMap.addAttribute("currentPage", page);
		modelMap.addAttribute("size", size);
		return "listeFilms";
	}

	@RequestMapping("/modifierFilm")
	public String editerFilm(@RequestParam("id") Long id, ModelMap modelMap) {
		Film p = FilmService.getFilm(id);
		List<Director> cats = dirService.findAll();
		modelMap.addAttribute("Directors", cats);
		modelMap.addAttribute("Film", p);
		modelMap.addAttribute("mode", "edit");
		return "formFilm";
	}

	@RequestMapping("/updateFilm")
	public String updateFilm(@ModelAttribute("Film") Film Film, @RequestParam("date") String date,

			ModelMap modelMap) throws ParseException {
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Date dateCreation = dateformat.parse(String.valueOf(date));
		Film.setDateCreation(dateCreation);
		FilmService.updateFilm(Film);
		List<Film> prods = FilmService.getAllFilms();
		modelMap.addAttribute("Films", prods);
		return "listeFilms";
	}
	
	@RequestMapping("/searchFilm")
	public String searchFilm(ModelMap modelMap, @Valid String dirNom) {
		List<Film> prods = FilmService.findByDirectorName(dirNom);
		modelMap.addAttribute("Films", prods);
		return "listesearch";	
	}
	
}