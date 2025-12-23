package com.excelR.spring_boot1.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excelR.spring_boot1.dto.Employee;
import com.excelR.spring_boot1.exception.EmployeeNotFound;
import com.excelR.spring_boot1.repository.EmployeeRepo;

@Repository
public class EmployeeDao {
      
	@Autowired
	EmployeeRepo repo;
	
	public Employee saveEmployee(Employee e) {
		 return  repo.save(e);
	} 
	
	public Employee fetchEmployee(int id) {
		Optional<Employee> op = repo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}else {
			 throw new EmployeeNotFound();
		}
	}
}

