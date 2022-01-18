package com.twitt.jobs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitt.jobs.entities.UserRegistrationAndLogin;

public interface UserDao extends JpaRepository<UserRegistrationAndLogin, Long>{
	UserRegistrationAndLogin findByEmailId(String email);
}
