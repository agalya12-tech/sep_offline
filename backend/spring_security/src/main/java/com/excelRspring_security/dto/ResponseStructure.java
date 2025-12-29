package com.excelRspring_security.dto;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class ResponseStructure<T> {
	
	private  T data ;
	private int status;
	private String message;
	private LocalDateTime dateTime=LocalDateTime.now();

}
