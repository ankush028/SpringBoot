package com.bridgelabz.SpringBoot.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
	private UUID id;
	@NotBlank
	private String name;
	
	public Person(@JsonProperty("id")UUID id,@JsonProperty("name")String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public UUID getId() {
		return id;
	}
	public String getName() {
		return name;
	}

	
}
