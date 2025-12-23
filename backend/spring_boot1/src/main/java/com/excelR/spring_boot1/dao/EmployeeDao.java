package com.excelR.spring_boot1.dao;

import java.util.List;
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
	
	public Employee deleteEmployee(int id) {
		Optional<Employee> op = repo.findById(id);
		if(op.isPresent()) {
			repo.deleteById(id);
			return op.get();
		}else {
			 throw new EmployeeNotFound();
		}
	}
	
	
	public Employee updateEmployee(Employee e) {
		Optional<Employee> op = repo.findById(e.getId());
		if(op.isPresent()) {
			return repo.save(e);
		}else {
			 throw new EmployeeNotFound();
		}
	}
	
	
	public List<Employee>fetchAllEmployee(){
		 List<Employee> list = repo.findAll();
		 if(!list.isEmpty()) {
			return list; 
		 }
		 else {
			 throw new EmployeeNotFound("In Employee database there is not data for employee");
		 }
	}
}

