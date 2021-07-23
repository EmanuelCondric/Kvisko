package com.backend.appbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.appbackend.model.User;
import com.backend.appbackend.repository.UserRepository;

@Service

public class RegistrationService {
	
	@Autowired
	private UserRepository registrationRepository;
	
	public User saveUser(User user) {
		return registrationRepository.save(user);
	}
	
	public User getUserbyEmail(String email) {
		return registrationRepository.findUserIdByEmail(email);
	}
	
	public User getUserbyUsernameandPassword(String username, String password) {
		return registrationRepository.findUserIdByUsernameAndPassword(username, password);
	}
	
}
