package com.bridgelabz.SpringBoot.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.stereotype.Repository;
import com.bridgelabz.SpringBoot.model.Person;
@Repository("mongodb")
public class PersonAccess implements PersonDao{

	@Override
	public int insertPerson(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> selectAllPerson() {
		return Arrays.asList(new Person(UUID.randomUUID(),"from MongoDb"));
	}

	@Override
	public int deletePersonById(UUID id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePersonById(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

}
