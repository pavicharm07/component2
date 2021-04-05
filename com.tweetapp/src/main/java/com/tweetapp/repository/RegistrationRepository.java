package com.tweetapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import com.tweetapp.model.User;

public interface RegistrationRepository extends MongoRepository<User, Integer>{

	public User findByEmailId(String email);

	public User findByEmailIdandPassword(String emailId , String password);

}
