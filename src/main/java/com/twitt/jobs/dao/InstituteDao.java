package com.twitt.jobs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitt.jobs.entities.Institute;

public interface InstituteDao extends JpaRepository<Institute, Long> {
	
	Institute findByInstituteemail(String instituteemail);
 
}
