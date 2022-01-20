package com.twitt.jobs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class Institute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long instituteId;
	
	private String instituteName;
	
	private String instituteCategory;
	
	private String instituteemail;
	
	private String instituteMobno;
		
	private String institutePassword;
	
	private String instituteconPassword;
	
	private String instituteAddress;
	
	private String instituteCity;
	
	private String institutePincode;

	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Institute(long instituteId, String instituteName, String instituteCategory, String instituteemail,
			String instituteMobno, String institutePassword, String instituteconPassword, String instituteAddress,
			String instituteCity, String institutePincode) {
		super();
		this.instituteId = instituteId;
		this.instituteName = instituteName;
		this.instituteCategory = instituteCategory;
		this.instituteemail = instituteemail;
		this.instituteMobno = instituteMobno;
		this.institutePassword = institutePassword;
		this.instituteconPassword = instituteconPassword;
		this.instituteAddress = instituteAddress;
		this.instituteCity = instituteCity;
		this.institutePincode = institutePincode;
	}

	@Override
	public String toString() {
		return "Institute [instituteId=" + instituteId + ", instituteName=" + instituteName + ", instituteCategory="
				+ instituteCategory + ", instituteemail=" + instituteemail + ", instituteMobno=" + instituteMobno
				+ ", institutePassword=" + institutePassword + ", instituteconPassword=" + instituteconPassword
				+ ", instituteAddress=" + instituteAddress + ", instituteCity=" + instituteCity + ", institutePincode="
				+ institutePincode + "]";
	}

	public long getInstituteId() {
		return instituteId;
	}

	public void setInstituteId(long instituteId) {
		this.instituteId = instituteId;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteCategory() {
		return instituteCategory;
	}

	public void setInstituteCategory(String instituteCategory) {
		this.instituteCategory = instituteCategory;
	}

	public String getInstituteemail() {
		return instituteemail;
	}

	public void setInstituteemail(String instituteemail) {
		this.instituteemail = instituteemail;
	}

	public String getInstituteMobno() {
		return instituteMobno;
	}

	public void setInstituteMobno(String instituteMobno) {
		this.instituteMobno = instituteMobno;
	}

	public String getInstitutePassword() {
		return institutePassword;
	}

	public void setInstitutePassword(String institutePassword) {
		this.institutePassword = institutePassword;
	}

	public String getInstituteconPassword() {
		return instituteconPassword;
	}

	public void setInstituteconPassword(String instituteconPassword) {
		this.instituteconPassword = instituteconPassword;
	}

	public String getInstituteAddress() {
		return instituteAddress;
	}

	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}

	public String getInstituteCity() {
		return instituteCity;
	}

	public void setInstituteCity(String instituteCity) {
		this.instituteCity = instituteCity;
	}

	public String getInstitutePincode() {
		return institutePincode;
	}

	public void setInstitutePincode(String institutePincode) {
		this.institutePincode = institutePincode;
	}
	
	


}
