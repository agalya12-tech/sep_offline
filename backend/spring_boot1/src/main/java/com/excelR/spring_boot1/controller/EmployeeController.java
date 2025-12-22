package com.excelR.spring_boot1.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excelR.spring_boot1.dto.Employee;

//@Controller
//@ResponseBody

@RestController
public class EmployeeController {
//	http://localhost:8080/testCase1
    @RequestMapping("/testCase1")
	public void testCase1() {
    System.out.println("Test Case1 is working ....!!");
	}
    
//	http://localhost:8080/testCase2
    @RequestMapping("/testCase2")
    public String testCase2() {
    	return "Test case2 is working";
    }
    
//   http://localhost:8080/save 
    @PostMapping("/save")
    public Employee saveEmployee( @RequestBody Employee e) {
    	System.out.println(e);
		return e;
    }
    
//    http://localhost:8080/fetchByID?id=1&email=tej@gmail.com
    @GetMapping("/fetchByID")
    public Employee fetchEmployee(@RequestParam int id ,@RequestParam String email) {
    	System.out.println(id+" "+email);
    	return null;
    }
    
//  http://localhost:8080/update  
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee e) {
    	System.out.println(e);
    	return e;
    }
//    http://localhost:8080/delete/1
    @DeleteMapping("/delete/{id}")
    public Employee deleteEmployee(@PathVariable int id) {
    	System.out.println(id);
    	return null;
    }
    
}
