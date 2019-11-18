package com.bridgelabz.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.app.model.Employee;
import com.bridgelabz.app.service.EmployeeService;

@RestController
@RequestMapping("Employee")	
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		return empService.save(employee);		
	}
	@PutMapping("/update")
	public Employee update(@RequestBody Employee employee) {
		return empService.update(employee);
	}
	@GetMapping("/all")
	public List<Employee> getAll(){
		return empService.getAllEmployee();
	}
	@GetMapping("/by/{employeeid}")
	public Object getEmployee(@PathVariable(name="empId") String empId) {
		return empService.getEmployee(empId);
	}
	@DeleteMapping("/delete/{empid}")
	public void delete(@PathVariable(name ="empId") String empId) {
		 empService.deleteEmployee(empId);
	}
}
