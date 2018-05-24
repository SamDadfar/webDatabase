package com.example.webDatabase.controller;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import com.example.webDatabase.domain.*;

@Component
public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUserName(String userName);
	
}

