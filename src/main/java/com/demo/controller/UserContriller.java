package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.User;
import com.demo.service.impl.UserServiceImpl;

@RestController
public class UserContriller {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	@PostMapping("/post")
	public User postUser(@RequestBody User user)
	{
		
		User user2 =  userServiceImpl.saveUser(user);
		
		return user2;
		
	}
	

}
