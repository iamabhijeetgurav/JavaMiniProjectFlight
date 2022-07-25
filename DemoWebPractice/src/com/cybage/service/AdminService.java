package com.cybage.service;

import java.util.List;

import com.cybage.model.Flight;

public interface AdminService {
	List<Flight> getAllFlights();
	boolean addFlight(Flight flight);
}
