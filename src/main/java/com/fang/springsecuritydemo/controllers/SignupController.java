package com.fang.springsecuritydemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fang.springsecuritydemo.auth.AuthService;

@RestController
@RequestMapping("/signup")
public class SignupController {
	@Autowired
	private AuthService authService;

	@PostMapping
	public String signup(@RequestParam String email, @RequestParam String username, @RequestParam String password) {
		authService.signup(email, username, password);
		return "OK";
	}
}
