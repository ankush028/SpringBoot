package com.bridgelabz.mongodb.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.mongodb.Repo.BookRepo;
import com.bridgelabz.mongodb.model.Book;
@RequestMapping("/Book")
@RestController	
public class BookController {
	@Autowired
	private BookRepo bookRepo;
	
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book) {
		 bookRepo.save(book);
		 return "book id Added:"+book.getId();
	}
	@GetMapping("/findAllBooks")
	public List<Book> getAllBook(){
		return bookRepo.findAll();
	}
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getbook(@PathVariable int id){
		return bookRepo.findById(id);
	}
	@DeleteMapping("/deleteById/{id}")
	public void deleteBook(@PathVariable int id) {
		bookRepo.deleteById(id);
	}
}
