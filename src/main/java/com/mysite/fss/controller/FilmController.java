package com.mysite.fss.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysite.fss.entity.Film;
import com.mysite.fss.repository.FilmRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/film")
@Controller
public class FilmController {

	private final FilmRepository filmRepository;
	
	@RequestMapping("/list")
	public String list(Model model) {
		
		List<Film> filmList = this.filmRepository.findAll();
		model.addAttribute("filmList", filmList);		
		return "film_list";
	}
}
