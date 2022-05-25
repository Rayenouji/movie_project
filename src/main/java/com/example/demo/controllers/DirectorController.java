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
import com.example.demo.service.DirService;

@Controller
public class DirectorController {
	@Autowired
	DirService dirService;

	@RequestMapping("/showCreateDir")
	public String showCreateBitcoin(ModelMap modelMap) {
		Director bit = new Director();
		modelMap.addAttribute("mode", "new");
		modelMap.addAttribute("Directors", bit);
		return "formDirector";
	}

	@RequestMapping("/saveDirector")
	public String saveProduit(@Valid Director Director, BindingResult bindingResult) {
		if (bindingResult.hasErrors())
			return "formBitcoin";
		dirService.saveDirector(Director);
		return "redirect:/ListeDir";
	}

	@RequestMapping("/ListeDir")
	public String listeOwners(ModelMap modelMap) {
		List<Director> b = dirService.findAll();
		modelMap.addAttribute("Directors", b);

		return "ListeDir";
	}

	@RequestMapping("/supprimerDirector")
	public String supprimerProduit(@RequestParam("id") Long id, ModelMap modelMap) {
		dirService.deleteDirectorById(id);
		List<Director> b = dirService.findAll();
		modelMap.addAttribute("Directors", b);

		return "ListeDir";
	}

	@RequestMapping("/modifierDirector")
	public String editerProduit(@RequestParam("id") Long id, ModelMap modelMap) {
		Director b = dirService.getDirector(id);
		modelMap.addAttribute("Directors", b);
		modelMap.addAttribute("mode", "edit");
		return "formDirector";
	}

}