package com.aaslin.springSecurity.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RoleController {

	@GetMapping("/admin/dashboard")
	public String adminDashboard(Principal principal) {
		return "Hello admin.." +principal.getName();
	}
	
	@GetMapping("/user/profile")
	public String userProfile(Principal principal) {
		return "Hello user...." +principal.getName();
	}
}
