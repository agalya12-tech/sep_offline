package com.excelRspring_security.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excelRspring_security.dao.UserDao;
import com.excelRspring_security.entity.User;

@RestController("/student")
public class StudentController {
    @Autowired
	UserDao dao;
    @GetMapping("/profile")
	public ResponseEntity<User>fetchProfile( @RequestBody UserDetails details){
		 String email=details.getUsername();
		 Optional<User> user = dao.fetchByEmail(email);
		 System.out.println(user);
		 if(user.isPresent()) {
			 User data=user.get();
			 return ResponseEntity.ok(data);
		 }
		 return null;
	}
}
