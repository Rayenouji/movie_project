package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDir;
	private String nomDir;
	private String prenomDir;
	@JsonIgnore
	@OneToMany(mappedBy = "director")
	private List<Film> films;
	
	public Long getIdDir() {
		return idDir;
	}
	public void setIdDir(Long idDir) {
		this.idDir = idDir;
	}
	public String getNomDir() {
		return nomDir;
	}
	public void setNomDir(String nomDir) {
		this.nomDir = nomDir;
	}
	public String getPrenomDir() {
		return prenomDir;
	}
	public void setPrenomDir(String prenomDir) {
		this.prenomDir = prenomDir;
	}
	public List<Film> getFilms() {
		return films;
	}
	public void setFilms(List<Film> films) {
		this.films = films;
	}
}
