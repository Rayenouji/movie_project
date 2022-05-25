package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;
import com.example.demo.repos.DirRepository;
import com.example.demo.repos.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {
	@Autowired
	FilmRepository filmRepository;
	@Autowired
	DirRepository dirRepository;
	@Override
	public Film saveFilm(Film p) {
		return filmRepository.save(p);
	}
	@Override
	public Film updateFilm(Film p) {
	return filmRepository.save(p);
	}
	@Override
	public void deleteFilm(Film p) {
	filmRepository.delete(p);
	}
	@Override
	public void deleteFilmById(Long id) {
	filmRepository.deleteById(id);
	}
	@Override
	public Film getFilm(Long id) {
	return filmRepository.findById(id).get();
	}
	@Override
	public List<Film> getAllFilms() {
	return filmRepository.findAll();
	}
	@Override
	public Page<Film> getAllFilmsParPage(int page, int size) {
	return filmRepository.findAll(PageRequest.of(page, size));
	}
	@Override
	public List<Film> findByNomFilm(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Film> findByNomFilmContains(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Film> findByNomgenre(String nom, String genre) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Film> findByDirector(Director Director) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Film> findByDirectorName(String nom) {
		// TODO Auto-generated method stub
		return filmRepository.findByDirectorName(nom);
	}
	@Override
	public List<Film> findByOrderByNomFilmAsc() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Film> trierFilmsNomsgenre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Director> getAllDirectors() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	}
