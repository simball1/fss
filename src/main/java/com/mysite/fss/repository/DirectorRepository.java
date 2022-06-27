package com.mysite.fss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.fss.entity.Director;

public interface DirectorRepository extends JpaRepository<Director, Integer> {

	Director findByName(String name);
	List<Director> findByNameLike(String name);
}
