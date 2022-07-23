package com.cybage.service;

import java.util.List;

import com.cybage.model.User;

public interface UserService {
	List<User> getAllUsers();
	boolean addUser(User user);
	boolean checkUser(String email, String password);
}
