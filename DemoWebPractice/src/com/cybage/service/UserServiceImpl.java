package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.dao.IUserDAO;
import com.cybage.dao.UserDaoImpl;
import com.cybage.model.BookTicket;
import com.cybage.model.Credential;
import com.cybage.model.Feedback;
import com.cybage.model.Flight;
import com.cybage.model.User;

public class UserServiceImpl implements UserService {

	private IUserDAO userDao = new UserDaoImpl();
	
	
	
	@Override
	public List<Flight> getAllFlightsBySourceAndDestination(String source, String destination) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.getAllFlightsBySourceAndDestination(source, destination);
	}

	@Override
	public boolean bookATicket(BookTicket booking) throws SQLException {
		// TODO Auto-generated method stub
		return userDao.bookATicket(booking);
	}

	@Override
	public User checkUser(Credential cred) throws SQLException {
		
		return userDao.checkUser(cred);
	}

	@Override
	public boolean addUser(User user) throws SQLException {
		return userDao.addUser(user);
	}

	@Override
	public List<User> getAllUsers() throws SQLException{
		return userDao.getAllUsers();
	}

	@Override
	public Feedback addFeedback(Feedback feedback) throws SQLException {
		return userDao.addFeedback(feedback);
	}

}
