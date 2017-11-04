package com.learning.rest.learningrest.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

public class User {

	private int id;
	
	@Size(min=3, message="Name should have at least 3 character")
	private String name;
	
	@Past (message="Date should be in past")
	private Date BirthDate;
	
	
	
	public User(int id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		BirthDate = birthDate;
	}
	
	public User(String name, Date birthDate) {
		super();
		this.name = name;
		BirthDate = birthDate;
	}
	

	public User() {	}
	
	public int getId() {
		return id;
	}
	public void setId(int it) {
		this.id = it;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", BirthDate=" + BirthDate + "]";
	}
	
	
}
