package com.cybage.service;

import java.util.List;

import com.cybage.dao.IUserDAO;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.User;

public class UserServiceImpl implements UserService {

	private IUserDAO userDao = new UserDaoImpl();

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

}
