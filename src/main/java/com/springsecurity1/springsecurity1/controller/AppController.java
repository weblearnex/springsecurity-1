package com.springsecurity1.springsecurity1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@GetMapping("/")
	public String getWelcome(){
		return "<h1>Welcome</h1>";
	}

}
