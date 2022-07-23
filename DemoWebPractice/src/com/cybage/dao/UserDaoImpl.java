package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.User;
import com.cybage.utility.JDBCUtility;

public class UserDaoImpl implements IUserDAO {

	@Override
	public User addUser(User user) {
		
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList=new ArrayList<User>();
		User user= null;
		String url = "select * from user where role='user'";
		try (Connection cn = JDBCUtility.getConnection(); PreparedStatement pst = cn.prepareStatement(url);) {
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int id=rs.getInt(1);
				String firstName=rs.getString(2);
				String lastName=rs.getString(3);
				String email=rs.getString(4);
				user= new User(id, firstName, lastName, email);
				System.out.println(user);
				userList.add(user);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return userList;
	}

}
