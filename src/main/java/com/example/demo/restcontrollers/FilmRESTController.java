package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Film;
import com.example.demo.service.FilmService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FilmRESTController {
	@Autowired
	FilmService filmService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Film> getAllFilms() {
	return filmService.getAllFilms();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Film getProduitById(@PathVariable("id") Long id) {
	return filmService.getFilm(id);

	}
	@RequestMapping(method = RequestMethod.POST)
	public Film createProduit(@RequestBody Film produit) {
	return filmService.saveFilm(produit);
	}

}
