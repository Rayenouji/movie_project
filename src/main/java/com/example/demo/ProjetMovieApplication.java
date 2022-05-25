package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.demo.entities.Film;
import com.example.demo.service.FilmService;

@SpringBootApplication
public class ProjetMovieApplication  implements CommandLineRunner {
@Autowired
FilmService FilmService;
@Autowired
private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ProjetMovieApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Film.class);
	}
}
