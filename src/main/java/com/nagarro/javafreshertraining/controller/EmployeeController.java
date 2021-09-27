package com.nagarro.javafreshertraining.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.javafreshertraining.entity.Employee;
import com.nagarro.javafreshertraining.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	/**
	 * @param employee
	 * @return
	 */
	@GetMapping("ListEmployee")
	public Employee[] list(Employee employee) {
		List<Employee> empList = service.findAll();
		Employee[] employeeArray = new Employee[empList.size()];
		empList.toArray(employeeArray);
		return employeeArray;

	}

	/**
	 * @param Id
	 * @return
	 */
	@GetMapping("UpdateEmployee")
	public Employee edit(@RequestParam("id") int Id) {
		Employee employee = service.findById(Id);
		return employee;

	}

	/**
	 * @param employee
	 * @return
	 */
	@PostMapping("addEmployee")
	public @ResponseBody Employee[] addData(@RequestBody Employee employee) {
		service.save(employee);
		List<Employee> empList = service.findAll();
		Employee[] employeeArray = new Employee[empList.size()];
		empList.toArray(employeeArray);
		return employeeArray;
	}

	/**
	 * @param employee
	 * @return
	 */
	@PostMapping("updateEmployee")
	public Employee[] updateData(@RequestBody Employee employee) {
		service.update(employee);
		List<Employee> empList = service.findAll();
		Employee[] employeeArray = new Employee[empList.size()];
		empList.toArray(employeeArray);
		return employeeArray;

	}
}
