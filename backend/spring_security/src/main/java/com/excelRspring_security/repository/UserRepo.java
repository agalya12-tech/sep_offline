package com.excelRspring_security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelRspring_security.entity.User;

public interface UserRepo  extends JpaRepository<User, Integer>{
 
	Optional<User>findByEmail(String email);
}

