package com.example.webDatabase.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.webDatabase.domain.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public User save(User trein){
		return userRepository.save(trein);
	}
	public User findById(long id) {
		return userRepository.findById(id).get();
	}
	public void delete(User user) {
		userRepository.delete(user);
	}
	
	public Iterable <User> findAll(){
		Iterable <User> result = userRepository.findAll();
		return result;
	}
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);	
	}
}
	

