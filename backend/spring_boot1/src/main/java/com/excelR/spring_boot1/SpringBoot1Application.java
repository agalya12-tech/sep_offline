package com.excelR.spring_boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.excelR.spring_boot1.controller.EmployeeController;
import com.excelR.spring_boot1.dao.EmployeeDao;
import com.excelR.spring_boot1.dto.Employee;
import com.excelR.spring_boot1.service.EmployeeService;

@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBoot1Application.class, args);
		System.out.println("Hello world");
		System.out.println(ac.getBean(Employee.class));
		System.out.println(ac.getBean(EmployeeDao.class));
		System.out.println(ac.getBean(EmployeeService.class));
		System.out.println(ac.getBean(EmployeeController.class));



	}

}
