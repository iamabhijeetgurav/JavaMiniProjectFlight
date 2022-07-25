package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Flight;
import com.cybage.model.User;
import com.cybage.utility.JDBCUtility;

public class FlightDaoImpl implements IFlightDAO {

	@Override
	public List<Flight> getAllFlights() {
		List<Flight> flightList = new ArrayList<Flight>();
		Flight flight = null;
		String url = "select * from flight;";
		try (Connection cn = JDBCUtility.getConnection(); PreparedStatement pst = cn.prepareStatement(url);) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt(1);
				String flightName = rs.getString(2);
				Time arrivalTime = rs.getTime(3);
				Time departureTime = rs.getTime(4);
				String source = rs.getString(5);
				String destination = rs.getString(6);
				String flightType = rs.getString(7);
				double flightFare = rs.getDouble(8);
				int noOfSeats = rs.getInt(9);
				boolean isAvailable = rs.getBoolean(10);
				flight = new Flight(id, flightName, arrivalTime, departureTime, source, destination, flightType,
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
	public boolean addFlight(Flight flight) {
		String url = "insert into flight(flight_name, arrival_time, departure_time, source, destination, flight_type, flight_fare) values (?,?,?,?,?,?,?)";
		boolean flag = false;
		System.out.println(flight);
		try (Connection cn = JDBCUtility.getConnection(); PreparedStatement pst = cn.prepareStatement(url);) {
			pst.setString(1, flight.getFlightName());
			pst.setTime(2, flight.getArrivalTime());
			pst.setTime(3, flight.getDepartureTime());
			pst.setString(4, flight.getSource());
			pst.setString(5, flight.getDestination());
			pst.setString(6, flight.getFlightType());
			pst.setDouble(7, flight.getFlightFare());
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

}
