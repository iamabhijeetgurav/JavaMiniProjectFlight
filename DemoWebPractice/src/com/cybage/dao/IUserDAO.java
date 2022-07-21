package com.cybage.dao;

import java.util.List;

import com.cybage.model.User;

public interface IUserDAO {
	List<User> getAllUsers();
	boolean addUser(User user);
}
