package com.excelR.spring_boot1.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//  handles exception globally
@RestControllerAdvice
public class GlobalExceptionHandler {
    
	@ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public ResponseEntity<String> sqlExceptionHandling(SQLIntegrityConstraintViolationException e) {
		 return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> employeeNotFound(EmployeeNotFound e) {
		 return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
