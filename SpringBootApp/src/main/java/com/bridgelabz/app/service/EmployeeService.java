package com.bridgelabz.app.service;

import java.util.List;

import com.bridgelabz.app.model.Employee;

public interface EmployeeService {
	Employee save(Employee employee);
	Employee update(Employee employee);
	List<Employee> getAllEmployee();
	void deleteEmployee(String empId);
	Object getEmployee(String empId);
}
