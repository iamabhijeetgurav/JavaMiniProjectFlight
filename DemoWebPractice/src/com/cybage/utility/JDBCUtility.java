package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {
	private static Connection cn = null;

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/miniprojectjava";
		if (cn == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				cn = DriverManager.getConnection(url, "root", "root");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return cn;
	}

}
