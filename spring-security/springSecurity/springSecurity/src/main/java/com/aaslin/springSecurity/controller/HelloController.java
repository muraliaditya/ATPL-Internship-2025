package com.aaslin.springSecurity.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(Principal principal) {
		return "Hello, "+principal.getName();
	}
	
//	@GetMapping("/")
//	public String home() {
//		return "Welcome to Lords Stadium..";
//	}

}
