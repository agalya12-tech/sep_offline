package com.excelR.spring_boot1.exception;
public class EmployeeNotFound  extends RuntimeException{
  String message="Employee Not Found";

  public String getMessage() {
	return message;
  }
  public EmployeeNotFound(String msg) {
	  this.message=msg;
  }
  public EmployeeNotFound() {
	  
  }
}
