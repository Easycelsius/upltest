package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id;
	
	@Column(length = 30*3, nullable = false)
	private String password;
	
	@Column(length = 30*3, nullable = false)
	private String gender;
	
	@Column(length = 30*3, nullable = false)
	private String email;
	
	@Column(length = 30*3, nullable = true)
	private String phone;
	
	@Column(nullable = true)
	private int auth;
}
