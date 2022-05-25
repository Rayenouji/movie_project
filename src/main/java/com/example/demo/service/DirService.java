package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Director;


public interface DirService {
	List <Director> findAll();
    Director updateDirector(Director director);
    void deleteDirector(Director director);
     void deleteDirectorById(Long id);
     Director getDirector (Long idDir);
	Director saveDirector(Director director);

}
