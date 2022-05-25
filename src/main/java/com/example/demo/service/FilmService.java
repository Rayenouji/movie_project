package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;

public interface FilmService {
	Film saveFilm(Film p);
	Film updateFilm(Film p);
	void deleteFilm(Film p);
	void deleteFilmById(Long id);
	Film getFilm(Long id);
	List<Film> getAllFilms();
	Page<Film> getAllFilmsParPage(int page, int size);
	List<Film> findByNomFilm(String nom); 
	List<Film> findByNomFilmContains(String nom); 
	List<Film> findByNomgenre (String nom, String genre); 
	List<Film> findByDirector (Director Director); 
	List<Film> findByDirectorName(String nom); 
	List<Film> findByOrderByNomFilmAsc(); 
	List<Film> trierFilmsNomsgenre();
	List<Director> getAllDirectors();
    
}
