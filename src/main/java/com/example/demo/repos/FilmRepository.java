package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entities.Director;
import com.example.demo.entities.Film;

@RepositoryRestResource(path = "rest")
public interface FilmRepository extends JpaRepository<Film, Long> {
    
	@Query("Select f from Film f where f.director.nomDir like %:nom%")
	List<Film> findByDirectorName(@Param("nom") String nom); 
}
