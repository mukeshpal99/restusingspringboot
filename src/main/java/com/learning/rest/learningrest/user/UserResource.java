package com.learning.rest.learningrest.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	UserDaoService userDao;
	
	
	//method to retrieve all users
	@GetMapping("/users")
	public List<User> getALlUsers(){
		return userDao.getAllUsers();
	}
	
	// method to retireve user
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id){
		return userDao.getUser(id);
	}

}
