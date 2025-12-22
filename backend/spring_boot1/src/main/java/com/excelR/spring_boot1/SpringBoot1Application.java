package com.excelR.spring_boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.excelR.spring_boot1.dto.Employee;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBoot1Application.class, args);
		System.out.println("Hello world");
		System.out.println(ac.getBean(Employee.class));
	}

}
