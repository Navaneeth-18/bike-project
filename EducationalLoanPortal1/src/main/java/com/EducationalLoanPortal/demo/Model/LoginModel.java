package com.EducationalLoanPortal.demo.Model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class LoginModel {
	@Id
	private String email;
	private String password;
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
	@Override
	public String toString() {
		return "LoginModel [email=" + email + ", password=" + password + "]";
	}

}