package com.cybage.model;

import java.sql.Time;

// id  | flight_name | arrival_time | departure_time | source | destination | flight_type | flight_fare | no_of_seats | is_available |
public class Flight {
	private int id;
	private String flightName;
	private Time arrivalTime;
	private Time departureTime;
	private String source;
	private String destination;
	private String flightType;
	private double flightFare;
	private int noOfSeats;
	private boolean isAvailable;

	public Flight() {
		
	}
	
	public Flight(int id, String flightName, Time arrivalTime, Time departureTime, String source, String destination,
			String flightType, double flightFare, int noOfSeats, boolean isAvailable) {
		super();
		this.id = id;
		this.flightName = flightName;
		this.arrivalTime = arrivalTime;
		this.departureTime = departureTime;
		this.source = source;
		this.destination = destination;
		this.flightType = flightType;
		this.flightFare = flightFare;
		this.noOfSeats = noOfSeats;
		this.isAvailable = isAvailable;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

	public double getFlightFare() {
		return flightFare;
	}

	public void setFlightFare(double flightFare) {
		this.flightFare = flightFare;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightName=" + flightName + ", arrivalTime=" + arrivalTime + ", departureTime="
				+ departureTime + ", source=" + source + ", destination=" + destination + ", flightType=" + flightType
				+ ", flightFare=" + flightFare + ", noOfSeats=" + noOfSeats + ", isAvailable=" + isAvailable + "]";
	}
	
}
