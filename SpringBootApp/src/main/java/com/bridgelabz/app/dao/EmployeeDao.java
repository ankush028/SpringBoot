package com.bridgelabz.app.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.app.model.Employee;

@Repository
public interface EmployeeDao extends MongoRepository<Employee,String>{



}
