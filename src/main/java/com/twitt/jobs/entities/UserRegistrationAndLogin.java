package com.twitt.jobs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "user_details")
public class UserRegistrationAndLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid",updatable = false, nullable = false)
	private long userId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "mob_no")
	private String mobNo;
	
	@Column(name = "password")
	private String password;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRegistrationAndLogin(long userId, String firstName, String lastName, String emailId, String mobileNo,
			String password) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobNo = mobNo;
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserRegistration [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", mobileNo=" + mobNo + ", password=" + password + "]";
	}
	public UserRegistrationAndLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
