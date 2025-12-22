package com.excelR.spring_boot1.dto;

import org.springframework.stereotype.Component;

import lombok.*;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
  
	private int id;
	private String name;
	private String email;
	private long phone;
	private String dept;
	
}
