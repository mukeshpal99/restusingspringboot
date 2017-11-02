package com.learning.rest.learningrest.user;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
		User user= userDao.getUser(id);
		
		if(user == null){
			throw new UserNotFoundException("id-"+id);
		}
		
		return user;
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> createUser(@RequestBody User user){
		User createdUser= userDao.addUser(user);
		
		URI location = ServletUriComponentsBuilder
						.fromCurrentRequest()
						.path("/{id})")
						.buildAndExpand(createdUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
								
							
	}

}
