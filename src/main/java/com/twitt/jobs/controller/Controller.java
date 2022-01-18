package com.twitt.jobs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twitt.jobs.entities.UserRegistrationAndLogin;
import com.twitt.jobs.services.Services;

@RestController
public class Controller {
	@Autowired
	private Services service;
	
	//register candidate
	@PostMapping("/register/candidate")
	public String registerUser(@RequestBody UserRegistrationAndLogin user)
	{
		return this.service.registerUser(user);
	}
	
	//retrieve all users from the database
	@GetMapping("/users")
	public List<UserRegistrationAndLogin> getUsers()
	{
		return this.service.getUsers();
	}
	
	@GetMapping("/login/candidate")
	public String loginUser(@RequestBody UserRegistrationAndLogin user)
	{
		return this.service.loginUser(user);
	}
}
