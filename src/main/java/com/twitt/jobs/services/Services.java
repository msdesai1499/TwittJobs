package com.twitt.jobs.services;

import java.util.List;


import com.twitt.jobs.entities.UserRegistrationAndLogin;

public interface Services {
	
	public String registerUser(UserRegistrationAndLogin user);
	
	public List<UserRegistrationAndLogin> getUsers();
	
	public String loginUser(UserRegistrationAndLogin user);
}
