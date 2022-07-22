package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Feedback;
import com.cybage.model.User;
import com.cybage.utility.DBConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User user) {
		String url = "insert into user(first_name, last_name, email, password, mobile, role) values(?,?,?,?,?,?)";
		String role = "user";
		boolean flag = false;
		System.out.println(user);
		try (Connection cn = DBConnection.getConncetion(); PreparedStatement pst = cn.prepareStatement(url);) {
			pst.setString(1, user.getFirstName());
			pst.setString(2, user.getLastName());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getPassword());
			pst.setString(5, user.getMobile());
			pst.setString(6, user.getRole());
			int result = pst.executeUpdate();
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
	public List<User> getAllUsers() {
		List<User> userList = new ArrayList<User>();
		User user = null;
		String url = "select * from user where role='user';";
		try (Connection cn = DBConnection.getConncetion(); PreparedStatement pst = cn.prepareStatement(url);) {
			ResultSet rs = pst.executeQuery();
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

	@Override
	public User findUser() {
		User user = null;
		String url = "select * from user where email = ? and password = ?;";
		try (Connection cn = DBConnection.getConncetion(); PreparedStatement pst = cn.prepareStatement(url);) {
			ResultSet rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public Feedback addFeedback(Feedback feedback) {
		String url = "insert into feedback(user_id,booking_id,rating, description) values(?,?,?, ?);";
		try (Connection cn = DBConnection.getConncetion(); PreparedStatement pst = cn.prepareStatement(url);) {
			pst.setInt(1, feedback.getUserId());
			pst.setInt(2, feedback.getBookingId());
			pst.setInt(3, feedback.getRating());
			pst.setString(4, feedback.getDescription());
			int result = pst.executeUpdate();
			if (result > 0) {
				System.out.println("Feedback added successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return feedback;
	}

}
