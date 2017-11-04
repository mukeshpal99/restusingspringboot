package com.learning.rest.learningrest.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static int userCount = 4;
	private static List<User> users = new ArrayList<User>();
	static 
	{
		users.add(new User(1, "User1", new Date()));
		users.add(new User(2, "User2", new Date()));
		users.add(new User(3, "User3", new Date()));
		users.add(new User(4, "User4", new Date()));
	}
	
	public List<User> getAllUsers(){
		return users;
	}
	
	
	public User addUser(User user){
	
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
	
	public User getUser(int id){
		for (User user : users) {
			if(user.getId() == id) return user;
		}
		return null;
	}
	
	
	public User deleteUser(int id){
		User tempUser=null;
		for (User user : users) {
			if(user.getId() == id) 
			{
				tempUser=user;
				users.remove(user);
			}
		}
		
		return tempUser;
	}
	
}
