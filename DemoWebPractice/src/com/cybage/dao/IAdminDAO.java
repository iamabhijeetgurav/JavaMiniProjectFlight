package com.cybage.dao;

import java.util.List;

import com.cybage.model.Complaint;
import com.cybage.model.Feedback;
import com.cybage.model.Flight;

public interface IAdminDAO {
	List<Feedback> getAllFeedback();
	List<Complaint> getAllComplaints();
	public Flight addFlight(Flight flight);
	
}
