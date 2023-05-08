package com.EducationalLoanPortal.demo.Model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class AdminModel {
	@Id

	private String email;
	private String password;
	private String mobileNumber;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "AdminModel [email=" + email + ", password=" + password + ", mobileNumber=" + mobileNumber + "]";
	}
	
}