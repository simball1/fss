package com.mysite.fss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.fss.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Integer> {

	
}
