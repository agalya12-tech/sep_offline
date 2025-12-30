package com.excelRspring_security.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelRspring_security.dao.UserDao;
import com.excelRspring_security.dto.ResponseStructure;
import com.excelRspring_security.entity.User;
import com.excelRspring_security.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {


	@Autowired
	AuthenticationManager manager;
	
	@Autowired
	JwtUtil util;
	
	@Autowired
	UserDao dao;
	@Autowired
	ResponseStructure<User>structure;
	
//	 http://localhost:8080/auth/register
	@PostMapping("/register")
	public ResponseEntity<ResponseStructure<User>>registerUser(@RequestBody User user){
		
		structure.setData(dao.saveUser(user));
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage(user.getName()+" data saved successfully");
		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
	}
	
//	http://localhost:8080/auth/login
	@PostMapping("/login")
	public ResponseEntity<ResponseStructure<Map<String, String>>>
	  login(@RequestBody Map<String , String>user){
		
		return null;
	}
	
	
}


