package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.model.BookTicket;
import com.cybage.model.Credential;
import com.cybage.model.Feedback;
import com.cybage.model.Flight;
import com.cybage.model.User;

public interface UserService {
	List<User> getAllUsers() throws SQLException;
	boolean addUser(User user) throws SQLException;
	User checkUser(Credential cred) throws SQLException;
	boolean bookATicket(BookTicket booking) throws SQLException;
	List<Flight> getAllFlightsBySourceAndDestination(String source, String destination) throws SQLException;
	public Feedback addFeedback(Feedback feedback) throws SQLException;
}
