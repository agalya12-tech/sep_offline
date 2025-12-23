package com.excelR.spring_boot1.exception;

import java.sql.SQLIntegrityConstraintViolationException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//  handles exception globally
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
	public String sqlExceptionHandling(SQLIntegrityConstraintViolationException e) {
		 return e.getMessage();
	}
}
