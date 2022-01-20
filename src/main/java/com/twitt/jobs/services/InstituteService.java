package com.twitt.jobs.services;

import com.twitt.jobs.entities.Institute;

import java.util.List;

public interface InstituteService {

	
	public String registerInstitute(Institute institute);
	
	public List<Institute> getInstitutes();
	
	public String loginInstitute(Institute institute);
}
