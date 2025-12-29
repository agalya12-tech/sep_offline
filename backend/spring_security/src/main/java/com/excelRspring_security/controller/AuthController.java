package com.excelRspring_security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelRspring_security.dao.UserDao;
import com.excelRspring_security.entity.User;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	UserDao dao;
//	 http://localhost:8080/auth/register
	@PostMapping("/register")
	public ResponseEntity<User>registerUser(@RequestBody User user){
		return new ResponseEntity<User>(dao.saveUser(user), HttpStatus.CREATED);
	}
}


