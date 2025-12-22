package com.excelR.spring_boot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
