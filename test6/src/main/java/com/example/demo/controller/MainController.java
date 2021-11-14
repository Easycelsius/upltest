package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value = "/home")
	public String main() {
		return "next.html";
	}
	
	@RequestMapping(value = "/register")
	public String register() {
		return "register.html";
	}
}
