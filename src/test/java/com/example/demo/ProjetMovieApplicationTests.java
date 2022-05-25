package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;
import com.example.demo.repos.FilmRepository;
import com.example.demo.service.FilmService;

@SpringBootTest
class ProjetMovieApplicationTests {
	@Autowired
	private FilmService FilmService;
	@Autowired
	private FilmRepository filmRepository;
	// @Test
	// public void testCreateFilm() {
	// Film prod = new Film("Titanic","Romantic",new Date());
	// filmRepository.save(prod);
	// }
	// @Test
	// public void testFindFilm()
	// {
	// Film p = filmRepository.findById(1L).get();

	// System.out.println(p);
	// }
	// @Test
	// public void testUpdateFilm()
	// {
	// Film p = filmRepository.findById(1L).get();
	// p.setGenreFilm("rayen");
	// filmRepository.save(p);
	// }
	// @Test
	// public void testDeleteFilm()
	// {
	// filmRepository.deleteById(1L);;
	// }
	// @Test
	// public void testListerTousFilms()
	// {
	// List<Film> prods = filmRepository.findAll();
	// for (Film p : prods)
	// {
	// System.out.println(p);
	// }

	// }
	
	// @Test
	// public void testFindByNomFilm()
	// {
	// List<Film> prods = filmRepository.findByNomFilm("titanics");

	// for (Film p : prods)
	// {
	// System.out.println(p);
	// }

	// }
	// @Test
	// public void testFindByNomFilmContains ()
	// {
	// List<Film> prods=filmRepository.findByNomFilmContains("tit");

	// for (Film p : prods)
	// {
	// System.out.println(p);
	// } }@Test 
	// public void testfindByNomgenre() 
	// { 
	// List<Film> prods = filmRepository.findByNomgenre("titanics", "historique"); for (Film p : prods) 
	// { 
	// System.out.println(p); 
	// } 
	// }@Test 
	// public void testfindByDirector() 
	// { 
	// Director cat = new Director(); 
	// cat.setIdDir(1L);
	
	// List<Film> prods = filmRepository.findByDirector(cat); 
	// for (Film p : prods) 
	// { 
	// System.out.println(p); 
	// } 
	// } 
	// @Test 
	// public void findByDirectorIdCat() 
	// { 
	// List<Film> prods = filmRepository.findByDirectorIdDir(1L); for (Film p : prods) 
	// { 
	// System.out.println(p); 
	// } 
	//  }
	// @Test 
	// public void testfindByOrderByNomFilmAsc() 
	// { 
	// List<Film> prods =  filmRepository.findByOrderByNomFilmAsc(); 
	// for (Film p : prods) 
	// { 
	// System.out.println(p); 
	// } 
	// }
	// @Test 
	// public void testTrierProduitsNomsgenre() 
	// { 
	// List<Film> prods = filmRepository.trierFilmsNomsgenre(); 
	// for (Film p : prods) 
	// { 
	// System.out.println(p); 
	// } 
	// }





}
