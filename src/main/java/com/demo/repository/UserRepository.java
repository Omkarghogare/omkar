package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.demo.entity.User;

public interface UserRepository extends CrudRepository<User, Serializable> {
	

}
