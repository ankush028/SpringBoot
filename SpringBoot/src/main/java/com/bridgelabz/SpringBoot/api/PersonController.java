package com.bridgelabz.SpringBoot.api;

import java.util.List;
import java.util.UUID;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.SpringBoot.model.Person;
import com.bridgelabz.SpringBoot.service.PersonService;
@RequestMapping("api/person")
@RestController
public class PersonController {
	private final PersonService personService;
	@Autowired
	public PersonController(PersonService personService){
		super();
		this.personService =personService;
	}
	@PostMapping
	public void addPerson(@Valid @NonNull @RequestBody Person person) {
		personService.addperson(person);
		
	}
	@GetMapping
	public List<Person> getallPeople(){
		return personService.getAllPeople();
	}
	@GetMapping(path= "{id}")
	public Person getPerson(@PathVariable("id")UUID id){
		return personService.getPerson(id).orElse(null);
	}
	@DeleteMapping(path="{id}")
	public int deletePerson(@PathVariable("id")UUID id) {
		return personService.deletePerson(id);
	}
	@PutMapping(path = "{id}")
	public int updateperson(@PathVariable("id")UUID id,@Valid @NonNull @RequestBody Person newperson) {
		return personService.updateperson(id, newperson);
	}
}
