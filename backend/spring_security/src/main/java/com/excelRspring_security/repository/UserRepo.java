package com.excelRspring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelRspring_security.entity.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

}
