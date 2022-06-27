package com.mysite.fss.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Director {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; //감독 고유번호
	
	@Column(length = 200)
	private String name; // 감독 이름
	
	@OneToMany(mappedBy = "director", cascade = CascadeType.REMOVE)
	private List<Film> filmList; // 영화 목록
	
}
