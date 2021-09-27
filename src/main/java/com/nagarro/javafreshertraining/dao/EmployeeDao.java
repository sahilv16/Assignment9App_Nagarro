package com.nagarro.javafreshertraining.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.javafreshertraining.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	/**
	 * @param EmployeeCode
	 * @param EmployeeName
	 * @param Location
	 * @param Email
	 * @param DateOfBirth
	 */
	@Transactional
	@Modifying
	@Query("update Employee set EmployeeName= :EmployeeName, Location = :Location, Email = :Email, DateOfBirth = :DateOfBirth where EmployeeCode= :EmployeeCode")
	void update(@RequestParam("EmployeeCode") int EmployeeCode, @RequestParam("EmployeeName") String EmployeeName,
			@RequestParam("Location") String Location, @RequestParam("Email") String Email,
			@RequestParam("DateOfBirth") String DateOfBirth);

}
