package com.bridgelabz.mongodb.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.mongodb.model.Book;
	
public interface BookRepo extends MongoRepository<Book,Integer>{


	

}
