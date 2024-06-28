package com.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {

	@Id
	private int id;
	private String title;
	private String description;

	public Courses(int id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}

	public Courses() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
