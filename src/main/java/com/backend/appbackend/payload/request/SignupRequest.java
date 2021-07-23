package com.backend.appbackend.payload.request;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class SignupRequest {
	
	@NotBlank(message = "Korisnicko ime nije upisano.")	
	private String username;
	@Email(message = "Email u neispravnom formatu.")
	@NotBlank(message = "Email nije upisan.")
	private String email;
	@NotBlank(message = "Ime nije upisano.")
	private String firstName;
	@NotBlank(message = "Prezime nije upisano")
	private String lastName;
	
	private String password;
	
	private List<Integer> roleList = new ArrayList<>();
	
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
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

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

	public List<Integer> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Integer> roleList) {
		this.roleList = roleList;
	}
}
