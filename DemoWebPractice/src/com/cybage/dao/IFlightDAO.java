package com.cybage.dao;

import java.util.List;

import com.cybage.model.Flight;

public interface IFlightDAO {
	List<Flight> getAllFlights();
	boolean addFlight(Flight flight);
}
