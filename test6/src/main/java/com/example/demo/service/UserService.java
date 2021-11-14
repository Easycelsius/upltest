package com.example.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;

import lombok.extern.log4j.Log4j2;

@Service("UserService")
@Log4j2
public class UserService {
	
	// log
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserRepo userRepo;
	
	public void saveUser(User user) {
		log.info("UserService.saveUser 실행");
        userRepo.save(user);
	}

	public List<User> getUsers() {
		return userRepo.findAll();
	}
}
