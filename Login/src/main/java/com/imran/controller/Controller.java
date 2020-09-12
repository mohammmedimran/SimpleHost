package com.imran.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping("/Hello")
	public String Home() {
		return "Welcome to Home";
	}
}
