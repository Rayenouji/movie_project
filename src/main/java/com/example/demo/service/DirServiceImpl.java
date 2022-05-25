package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Director;
import com.example.demo.repos.DirRepository;

@Service
public class DirServiceImpl implements DirService {
	
	@Autowired
	DirRepository dirRepository;
	public List<Director> findAll() {
		return dirRepository.findAll();
	}

	public Director saveDirector(Director director) {
		return dirRepository.save(director);
	}

	
	public Director updateDirector(Director director) {
		return dirRepository.save(director);
	}

	public void deleteDirector(Director director) {
		// TODO Auto-generated method stub
		dirRepository.delete(director);
	}

	
	public void deleteDirectorById(Long id) {
		// TODO Auto-generated method stub
		dirRepository.deleteById(id);
	}

	
	public Director getDirector(Long idDir) {
		// TODO Auto-generated method stub
		return dirRepository.getById(idDir);
	}
	
}
