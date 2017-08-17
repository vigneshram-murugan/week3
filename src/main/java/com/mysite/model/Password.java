package com.mysite.model;

import javax.persistence.Id;

import org.springframework.security.authentication.encoding.PasswordEncoder;

public class Password {
	
	@Id
	private int id;
	
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
