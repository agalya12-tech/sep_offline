package com.excelRspring_security.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.excelRspring_security.entity.User;
import com.excelRspring_security.repository.UserRepo;

@Repository
public class UserDao {
	@Autowired
    UserRepo repo;
	@Autowired
	PasswordEncoder encoder;
	
	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return repo.save(user);
	}
	public Optional<User>fetchByEmail(String email){
		return repo.findByEmail(email);
	}
}
