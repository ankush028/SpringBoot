package com.bridgelabz.mongodb.model;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection ="book")
public class Book {
	
	private int id;
	private String name;
	private String authorname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authorname=" + authorname + "]";
	}

	
	
}
