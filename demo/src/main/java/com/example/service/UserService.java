package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserEntity save(UserEntity user) {

		UserEntity result = this.userRepository.save(user);

		return result;
	}

	public UserEntity update(UserEntity user) {

		UserEntity result = this.userRepository.save(user);

		return result;
	}

	public UserEntity getUserByName(String name) {

		UserEntity result = this.userRepository.getByName(name);

		return result;
	}
	
	public UserEntity getUserById(Long id) {

		UserEntity result = this.userRepository.getOne(id);

		return result;
	}
	
	public List<UserEntity> getAll(){
		
		return this.userRepository.findAll();
	}
	
	public boolean removeUser(Long id) {
		
		this.userRepository.deleteById(id);
		return true;
	}
}
