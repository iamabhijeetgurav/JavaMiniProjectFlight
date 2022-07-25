package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.BookTicket;
import com.cybage.model.Credential;
import com.cybage.model.Feedback;
import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.queries.Query;
import com.cybage.utility.JDBCUtility;

public class UserDaoImpl implements IUserDAO {
	private Connection cn;
	PreparedStatement pst1;
	PreparedStatement pst2;
	PreparedStatement pst3;
	PreparedStatement pst4;
	PreparedStatement pst5;
	PreparedStatement pst6;
	
	public UserDaoImpl() {
		try {
			cn=JDBCUtility.getConnection();
			pst1=cn.prepareStatement(Query.getFlightBySourceAndDestination);
			pst2=cn.prepareStatement(Query.BookTicket);
			pst3=cn.prepareStatement(Query.AddUser);
			pst4=cn.prepareStatement(Query.getUserByEmailAndPassword);
			pst5=cn.prepareStatement(Query.getUserByUserRole);
			pst6=cn.prepareStatement(Query.AddFeedback);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@Override
	public Feedback addFeedback(Feedback feedback) throws SQLException{
		pst6.setInt(1, feedback.getUserId());
		pst6.setInt(2, feedback.getBookingId());
		pst6.setInt(3, feedback.getRating());
		pst6.setString(4, feedback.getDescription());
		try{
			int result = pst6.executeUpdate();
			if (result > 0) {
				System.out.println("Feedback added successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return feedback;
	}



	@Override
	public List<Flight> getAllFlightsBySourceAndDestination(String source, String destination) throws SQLException {
		List<Flight> flightList = new ArrayList<Flight>();
		Flight flight = null;
		pst1.setString(1, source);
		pst1.setString(2, destination);
		try (ResultSet rs = pst1.executeQuery();) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String flightName = rs.getString(2);
				Time arrivalTime = rs.getTime(3);
				Time departureTime = rs.getTime(4);
				String sourceDb = rs.getString(5);
				String destinationDb = rs.getString(6);
				String flightType = rs.getString(7);
				double flightFare = rs.getDouble(8);
				int noOfSeats = rs.getInt(9);
				boolean isAvailable = rs.getBoolean(10);
				flight = new Flight(id, flightName, arrivalTime, departureTime, sourceDb, destinationDb, flightType,
						flightFare, noOfSeats, isAvailable);
				System.out.println(flight);
				flightList.add(flight);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return flightList;
	}

	@Override
	public boolean bookATicket(BookTicket booking) throws SQLException {
		boolean flag = false;
		System.out.println(booking);
		pst2.setDate(1, booking.getScheduleDate());
		pst2.setInt(2, booking.getNoOfPassengers());
		pst2.setInt(3, booking.getUserId());
		pst2.setInt(4, booking.getFlightId());
		try{
			int result = pst2.executeUpdate();
			if (result > 0) {
				flag = true;
				System.out.println("Data added succesfully");
				return flag;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public boolean addUser(User user) throws SQLException{
		
		String role = "user";
		boolean flag = false;
		System.out.println(user);
		pst3.setString(1, user.getFirstName());
		pst3.setString(2, user.getLastName());
		pst3.setString(3, user.getEmail());
		pst3.setString(4, user.getPassword());
		pst3.setString(5, user.getMobile());
		pst3.setString(6, role);
		try {
			int result = pst3.executeUpdate();
			if (result > 0) {
				flag = true;
				System.out.println("Data added succesfully");
				return flag;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public User checkUser(Credential cred) throws SQLException {
		int idDb = 0;
		String firstNameDb = "";
		String lastNameDb = "";
		String roleDb = "";
		pst4.setString(1, cred.getEmail());
		pst4.setString(2, cred.getPassword());
		try (ResultSet rs = pst4.executeQuery();) {
			while (rs.next()) {
				idDb = rs.getInt("id");
				firstNameDb = rs.getString("first_name");
				lastNameDb = rs.getString("last_name");
				roleDb = rs.getString("role");
				System.out.println(roleDb);
			}
			User user = new User(idDb, firstNameDb, lastNameDb, roleDb);
			System.out.println(user);
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> getAllUsers() throws SQLException {
		List<User> userList = new ArrayList<User>();
		User user = null;
		try (ResultSet rs = pst5.executeQuery();) {
			while (rs.next()) {
				int id = rs.getInt(1);
				String firstName = rs.getString(2);
				String lastName = rs.getString(3);
				String email = rs.getString(4);
				user = new User(id, firstName, lastName, email);
				System.out.println(user);
				userList.add(user);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return userList;
	}
 public void cleanUp() throws SQLException {
	 if(pst1!=null)
		 pst1.close();
	 if(pst2!=null)
		 pst2.close();
	 if(pst3!=null)
		 pst3.close();
	 if(pst4!=null)
		 pst4.close();
	 if(pst5!=null)
		 pst5.close();
 }
}
