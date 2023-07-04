package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.User;
import com.demo.repository.UserRepository;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserRepository  userRepository;
	
	@Override
	public User saveUser(User user) { 

	 User  use  =	userRepository.save(user);

		return use;
	}
	

}
