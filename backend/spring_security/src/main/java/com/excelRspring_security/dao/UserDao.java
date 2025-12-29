package com.excelRspring_security.dao;

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
		encoder.encode(user.getPassword());
		return repo.save(user);
	}
}
