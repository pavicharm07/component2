package com.tweetapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweetapp.model.User;
import com.tweetapp.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository repo;
	
public User create(User user){
	return repo.save(user);
}

public User fetchUserByEmailId(String emailId){
	return repo.findByEmailId(emailId);
}

public User fetchUserByEmailIdandPassword(String emailId,String password){
	return repo.findByEmailIdandPassword(emailId , password);
}
}

