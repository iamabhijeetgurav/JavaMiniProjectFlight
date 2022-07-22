package com.cybage.dao;

import java.util.List;

import com.cybage.model.Feedback;
import com.cybage.model.User;

public interface UserDao {
	List<User> getAllUsers();
	boolean addUser(User user);
	public User findUser();
	public Feedback addFeedback(Feedback feedback); 
	}
	

