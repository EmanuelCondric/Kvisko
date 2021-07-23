package com.backend.appbackend.payload.request;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	
	@NotBlank(message = "Korisnicko ime nije upisano.")	
	private String username;
	@NotBlank(message = "Lozinka nije upisana.")	
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