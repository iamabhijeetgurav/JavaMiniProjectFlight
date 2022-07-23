package com.cybage.service;

import java.util.List;

import com.cybage.model.User;

public interface UserService {
	List<User> getAllUsers();
	User addUser(User user);
}
