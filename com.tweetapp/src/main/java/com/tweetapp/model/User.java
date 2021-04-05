package com.tweetapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String First_name;
	
	private String Last_name;
	
	private String emailId;
	
	private String password;
	
	private String Contact_Number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact_Number() {
		return Contact_Number;
	}
	public void setContact_Number(String contact_Number) {
		Contact_Number = contact_Number;
	}
	public User(int id, String first_name, String last_name, String email_id, String password, String contact_Number) {
		super();
		this.id = id;
		First_name = first_name;
		Last_name = last_name;
		this.emailId = email_id;
		this.password = password;
		Contact_Number = contact_Number;
	}
	public User() {
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", First_name=" + First_name + ", Last_name=" + Last_name + ", emailId=" + emailId
				+ ", password=" + password + ", Contact_Number=" + Contact_Number + "]";
	}
	
	
}
