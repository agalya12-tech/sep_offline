package com.excelR.spring_boot1.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.excelR.spring_boot1.dto.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

//	select * from employee where email=?   -- SQL Query
	 @Query("select e from Employee e where email=?1")//---JPQL Query
	 Optional<Employee>findByEmail(String email);
}
