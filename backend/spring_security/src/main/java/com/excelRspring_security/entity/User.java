package com.excelRspring_security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	private int id;
	@Column(unique = true)
	private String email;
	private String password;
	private String name;
	private String role;
	private long phone;
}
