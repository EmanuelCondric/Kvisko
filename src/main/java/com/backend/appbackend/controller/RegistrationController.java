package com.backend.appbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.appbackend.model.User;
import com.backend.appbackend.service.RegistrationService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("registration")

public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;
	
	
	@PostMapping("/user-registration")
	
	public User registerUser(@RequestBody User user) throws Exception {
		String userEmail = user.getEmail();
		if(userEmail != null && !"".equals(userEmail)) {
			User userObj = registrationService.getUserbyEmail(userEmail);
			if(userObj != null) {
				throw new Exception ("There is already a user with that e-mail address. Please try with new mail account.");
			}
		}
		User userObj = null;
		userObj = registrationService.saveUser(user);
		
		return userObj;
	}
}
