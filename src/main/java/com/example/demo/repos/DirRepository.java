package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Director;


@Repository
public interface DirRepository extends JpaRepository<Director, Long> {

}
