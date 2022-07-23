package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.cybage.model.Flight;
import com.cybage.utility.JDBCUtility;

public class FlightDaoImpl  implements IFlightDAO{

	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addFlight(Flight flight) {
		String url="insert into flight(flight_name, arrival_time, departure_time, source, destination, flight_type, flight_fare) values (?,?,?,?,?,?,?)";								
		boolean flag=false;
		System.out.println(flight);
		try(Connection cn= JDBCUtility.getConnection();
				PreparedStatement pst= cn.prepareStatement(url);){
			pst.setString(1, flight.getFlightName());
			pst.setTime(2, flight.getArrivalTime());
			pst.setTime(3, flight.getDepartureTime());
			pst.setString(4, flight.getSource());
			pst.setString(5, flight.getDestination());
			pst.setString(6, flight.getFlightType());
			pst.setDouble(7, flight.getFlightFare());
			int result=pst.executeUpdate();
			if(result>0) {
				flag=true;
				System.out.println("Data added succesfully");
				return flag;
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;

	}
	
	
}
