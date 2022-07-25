package com.cybage.service;

import java.util.List;

import com.cybage.dao.FlightDaoImpl;
import com.cybage.dao.IFlightDAO;
import com.cybage.model.Flight;

public class AdminServiceImpl implements AdminService {

	private IFlightDAO flightDao= new FlightDaoImpl();
	
	@Override
	public List<Flight> getAllFlights() {	
		return flightDao.getAllFlights();
	}

	@Override
	public boolean addFlight(Flight flight) {
		return flightDao.addFlight(flight);
	}
	
}
