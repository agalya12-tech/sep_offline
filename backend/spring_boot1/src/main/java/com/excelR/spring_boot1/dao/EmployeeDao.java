package com.excelR.spring_boot1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excelR.spring_boot1.dto.Employee;
import com.excelR.spring_boot1.repository.EmployeeRepo;

@Repository
public class EmployeeDao {
      
	@Autowired
	EmployeeRepo repo;
	
	public Employee saveEmployee(Employee e) {
		 return  repo.save(e);
	} 
}

