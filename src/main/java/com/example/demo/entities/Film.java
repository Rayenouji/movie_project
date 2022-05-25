package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

@Entity
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFilm;

	@NotNull
	@Size(min = 4, max = 15)
	private String nomFilm;

	@NotNull
	private String genreFilm;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateCreation;
	@ManyToOne
	private Director director;

	public Film() {
		super();
	}

	public Film(String nomFilm, String Film, Date dateCreation, String genreFilm) {
		super();
		this.nomFilm = nomFilm;
		this.genreFilm = genreFilm;
		this.dateCreation = dateCreation;
	}

	public Long getIdFilm() {
		return idFilm;
	}

	public void setIdFilm(Long idFilm) {
		this.idFilm = idFilm;
	}

	public String getNomFilm() {
		return nomFilm;
	}

	public void setNomFilm(String nomFilm) {
		this.nomFilm = nomFilm;
	}

	public String getGenreFilm() {
		return genreFilm;
	}

	public void setGenreFilm(String genreFilm) {
		this.genreFilm = genreFilm;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Film [idFilm=" + idFilm + ", nomFilm=" + nomFilm + ", genreFilm=" + genreFilm + ", dateCreation="
				+ dateCreation + "]";
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
}
