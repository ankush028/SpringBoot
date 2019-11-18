package com.bridgelabz.SpringBoot.service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.bridgelabz.SpringBoot.dao.PersonDao;
import com.bridgelabz.SpringBoot.model.Person;
@Service
public class PersonService {
	private final PersonDao personDao;
	@Autowired
	public PersonService(@Qualifier("personcrud")PersonDao personDao) {
		this.personDao = personDao;
	}
	
	public int addperson(Person person) {
		return personDao.addPerson(person);	
	}
	public List<Person> getAllPeople(){
		return personDao.selectAllPerson();
	}
	public Optional<Person> getPerson(UUID id){
		return personDao.selectPersonById(id);
	}
	public int deletePerson(UUID id) {
		return personDao.deletePersonById(id);
	}
	public int updateperson(UUID id,Person newperson) {
		return personDao.updatePersonById(id, newperson);
	}
	
}
