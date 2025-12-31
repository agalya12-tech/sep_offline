package com.excelRspring_security.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
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
	ResponseStructure<User> structure;

//	 http://localhost:8080/auth/register
	@PostMapping("/register")
	public ResponseEntity<ResponseStructure<User>> registerUser(@RequestBody User user) {

		structure.setData(dao.saveUser(user));
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setMessage(user.getName() + " data saved successfully");
		return new ResponseEntity<ResponseStructure<User>>(structure, HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody Map<String, String> user) {
        try {
		String userName = user.get("email");
		String password = user.get("password");
		
		
		Authentication authentication = manager
				.authenticate(new UsernamePasswordAuthenticationToken(userName, password));
		UserDetails userDetails = (UserDetails) authentication.getPrincipal();
		
		
		String token = util.generateToken(userDetails);
		
		
		
		User userData = dao.fetchByEmail(userName).orElseThrow();
		Map<String, String> map = new HashMap<>();
		map.put("token", token);
		map.put("role", userData.getRole());
		map.put("name", userData.getName());
		map.put("email", userData.getEmail());
		ResponseStructure<Map<String, String>> structure = new ResponseStructure<Map<String, String>>();
		structure.setData(map);
		structure.setStatus(HttpStatus.OK.value());
		structure.setMessage(userData.getName() + " login successfully");
		return ResponseEntity.ok(structure);
        }
        catch (Exception e) {
        	ResponseStructure<String>structure=new  ResponseStructure<String>();
        	structure.setData(e.getMessage());
    		structure.setStatus(HttpStatus.BAD_REQUEST.value());
    		structure.setMessage( " login failed");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST.value()).body(structure);		
		}
	}

}
