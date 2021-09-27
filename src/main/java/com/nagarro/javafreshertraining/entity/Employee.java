package com.nagarro.javafreshertraining.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int EmployeeCode;
	private String EmployeeName;
	private String Location;
	private String Email;
	private String DateOfBirth;

	public int getEmployeeCode() {
		return EmployeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		EmployeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeCode=" + EmployeeCode + ", EmployeeName=" + EmployeeName + ", Location=" + Location
				+ ", Email=" + Email + ", DateOfBirth=" + DateOfBirth + "]";
	}

}
