package com.cybage.services;

import java.util.List;

import com.cybage.dao.UserDao;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.Feedback;
import com.cybage.model.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User findUser() {
		return userDao.findUser();
	}

	@Override
	public Feedback addFeedback(Feedback feedback) {
		return userDao.addFeedback(feedback);
	}

}
