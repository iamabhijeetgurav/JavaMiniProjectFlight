package com.cybage.services;

import java.util.List;

import com.cybage.model.Feedback;
import com.cybage.model.User;

public interface UserService {
	List<User> getAllUsers();
	boolean addUser(User user);
	public User findUser();
	public Feedback addFeedback(Feedback feedback); 
}
