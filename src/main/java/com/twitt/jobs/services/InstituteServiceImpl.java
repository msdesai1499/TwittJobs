package com.twitt.jobs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitt.jobs.dao.InstituteDao;
import com.twitt.jobs.entities.Institute;

@Service
public class InstituteServiceImpl implements InstituteService {
	
	@Autowired
	private InstituteDao instituteDao;
	
	@Override
	public String registerInstitute(Institute institute) {
		// TODO Auto-generated method stub
		instituteDao.save(institute);
		return "Institute Registration Successful";
	}

	@Override
	public List<Institute> getInstitutes() {
		// TODO Auto-generated method stub
		return instituteDao.findAll();
	}

	@Override
	public String loginInstitute(Institute institute) {
		// TODO Auto-generated method stub
		Institute i = instituteDao.findByInstituteemail(institute.getInstituteemail());
		if(i==null) {
			return "Please Enter Valid Login Details";
		}
		else if(i.getInstituteemail().equals(institute.getInstituteemail())&& i.getInstitutePassword().equals(institute.getInstitutePassword())) {
			return "Login Successful";
		}
		
			return "Please Enter Valid Login Details";	
		
		
	}

}
