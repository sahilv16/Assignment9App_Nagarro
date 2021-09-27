package com.nagarro.javafreshertraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.javafreshertraining.dao.EmployeeDao;
import com.nagarro.javafreshertraining.entity.Employee;

@Component
public class EmployeeService {
	@Autowired
	EmployeeDao repo;

	public List<Employee> findAll() {
		return repo.findAll();
	}

	public Employee findById(int Id) {
		return repo.findById(Id).orElse(null);
	}

	public void save(Employee employee) {
		repo.save(employee);
	}

	public void update(Employee employee) {
		repo.update(employee.getEmployeeCode(), employee.getEmployeeName(), employee.getLocation(), employee.getEmail(),
				employee.getDateOfBirth());

	}

}
