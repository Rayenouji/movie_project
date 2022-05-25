package com.example.demo.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomProd", types = { Film.class })
public interface FilmProjection {
	public String getNomFilm();

}
