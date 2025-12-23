package com.excelR.spring_boot1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelR.spring_boot1.dto.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

}
