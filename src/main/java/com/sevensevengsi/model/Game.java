package com.sevensevengsi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_seq")
	@SequenceGenerator(name = "game_seq", initialValue = 1, allocationSize = 1)
	private Long id;
	
	private String category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
