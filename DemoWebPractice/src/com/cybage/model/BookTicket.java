package com.cybage.model;

import java.sql.Date;

public class BookTicket {
//	id      | schedule_date | no_of_passengers | user_id | flight_id
	private int id;
	private Date scheduleDate;
	private int noOfPassengers;
	private int userId;
	private int flightId;

	public BookTicket(int id, Date scheduleDate, int noOfPassengers, int userId, int flightId) {
		super();
		this.id = id;
		this.scheduleDate = scheduleDate;
		this.noOfPassengers = noOfPassengers;
		this.userId = userId;
		this.flightId = flightId;
	}

	public BookTicket(Date scheduleDate, int noOfPassengers, int userId, int flightId) {
		super();
		this.scheduleDate = scheduleDate;
		this.noOfPassengers = noOfPassengers;
		this.userId = userId;
		this.flightId = flightId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	@Override
	public String toString() {
		return "BookTicket [id=" + id + ", scheduleDate=" + scheduleDate + ", noOfPassengers=" + noOfPassengers
				+ ", userId=" + userId + ", flightId=" + flightId + "]";
	}

}
