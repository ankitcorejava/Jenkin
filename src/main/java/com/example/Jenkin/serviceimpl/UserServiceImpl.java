package com.example.Jenkin.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Jenkin.model.User;
import com.example.Jenkin.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	List<User> usersList = new ArrayList<>();

	@Override
	public User createUser(User user) {
		usersList.add(user);
		return user;
	}

	@Override
	public User getUserById(int id) {
		for (User user : usersList) {
			if (user.getId() == id) {
				return user;
			}
		}
		return new User();
	}

	@Override
	public List<User> getAllUsers() {
		return usersList;
	}

}
