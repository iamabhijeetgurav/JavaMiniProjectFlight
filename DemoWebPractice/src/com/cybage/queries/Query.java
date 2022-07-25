package com.cybage.queries;

public class Query {
	public static String getFlightBySourceAndDestination = "select * from flight where source=? and destination=?;";
	public static String BookTicket = "insert into booking(schedule_date, no_of_passengers, user_id, flight_id) values(?,?,?,?);";
	public static String AddUser = "insert into user(first_name, last_name, email, password, mobile, role) values(?,?,?,?,?,?);";
	public static String getUserByEmailAndPassword = "select * from user where email=? and password=?;";
	public static String getUserByUserRole = "select * from user where role='user';";
	public static String AddFeedback = "insert into feedback(user_id,booking_id,rating, description) values(?,?,?, ?);";
}
