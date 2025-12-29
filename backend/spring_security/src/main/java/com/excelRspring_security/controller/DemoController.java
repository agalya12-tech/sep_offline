package com.excelRspring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
//  http://localhost:8080/m1
	@GetMapping("/m1")
	public String m1() {
		 return "m1 method from spring security";
	}
	
}
