package com.bridgelabz.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.app.dao.EmployeeDao;
import com.bridgelabz.app.model.Employee;
@Service
public class EmployeeServiceImpli implements EmployeeService{
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public void deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		employeeDao.deleteById(empId);
	}

	public Object getEmployee(String empId) {
		return employeeDao.findById(empId);
	}

}
