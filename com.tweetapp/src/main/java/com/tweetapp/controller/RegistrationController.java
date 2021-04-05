package com.tweetapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tweetapp.model.User;
import com.tweetapp.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService service;
	
	@PostMapping("/api/v1.0/tweets/register")
	@CrossOrigin(origins= "http://localhost:4200")
	public User registerUser(@RequestBody User user) throws Exception{
		String tempemailId=user.getEmailId();
		if(tempemailId!=null && "".equals(tempemailId)){
			User userobj = service.fetchUserByEmailId(tempemailId);
			if(userobj !=null){
				throw new Exception("User with +tempemailId already exists");
			}
		}
		User userobj = null;
		userobj = service.create(user);
		return userobj;
	}
	
	@GetMapping("/api/v1.0/tweets/login")
	@CrossOrigin(origins= "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception{
		String tempemailId = user.getEmailId();
		String temppassword = user.getPassword();
		User userobj = null;
		if(tempemailId!= null && temppassword!=null){
			 userobj = service.fetchUserByEmailIdandPassword(tempemailId, temppassword);
		}
		if(userobj == null){
			throw new Exception("bad credentials");
		}
		return userobj;
	}
}
