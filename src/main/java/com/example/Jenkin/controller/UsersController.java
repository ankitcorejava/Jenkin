package com.example.Jenkin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Jenkin.model.User;
import com.example.Jenkin.service.UserService;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	UserService userService;

	@PostMapping("/")
	public ResponseEntity<User> createNewUser(User user) {
		return new ResponseEntity<User>(userService.createUser(user), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) {
		return new ResponseEntity<User>(userService.getUserById(id), HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
	}

}
