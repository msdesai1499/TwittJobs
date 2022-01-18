package com.twitt.jobs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitt.jobs.dao.UserDao;
import com.twitt.jobs.entities.UserRegistrationAndLogin;

@Service
public class ServicesImplementation implements Services {
	
	@Autowired
	private UserDao userDao;
	@Override
	public String registerUser(UserRegistrationAndLogin user) {
		
		userDao.save(user);
		return "Registration Successful";
	}
	@Override
	public List<UserRegistrationAndLogin> getUsers() {
		
		return userDao.findAll();
	}
	@Override
	public String loginUser(UserRegistrationAndLogin user) {
		
		UserRegistrationAndLogin u=userDao.findByEmailId(user.getEmailId());
		if(u==null)
		{
			return "Please check login details";
		}
		else if(u.getEmailId().equals(user.getEmailId()) && u.getPassword().equals(user.getPassword()))
		{
			return "Login Successful";
		}
		return "Please check login details";
	}

}
