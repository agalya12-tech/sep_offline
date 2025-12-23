package com.excelR.spring_boot1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelR.spring_boot1.dao.EmployeeDao;
import com.excelR.spring_boot1.dto.Employee;

//@Controller
//@ResponseBody

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao dao;

//   http://localhost:8080/save 
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee e) {
		e.setId(0);
		return dao.saveEmployee(e);
	}

//    http://localhost:8080/fetchByID?id=1
	@GetMapping("/fetchByID")
	public Employee fetchEmployee(@RequestParam int id) {
		return dao.fetchEmployee(id);
	}

//  http://localhost:8080/delete/1
	@DeleteMapping("/delete/{id}")
	public Employee deleteEmployee(@PathVariable int id) {
		return dao.deleteEmployee(id);
	}

//  http://localhost:8080/update  
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee e) {
		System.out.println(e);
		return e;
	}

//    http://localhost:8080/fetchAll
	@GetMapping("/fetchAll")
	public List<Employee> fetchAll() {
		return dao.fetchAllEmployee();
	}

}
