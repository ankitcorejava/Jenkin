package com.example.Jenkin.service;

import java.util.List;

import com.example.Jenkin.model.User;

public interface UserService {
	
	public User createUser(User user);
	public User getUserById(int id);
	public List<User> getAllUsers();

}
