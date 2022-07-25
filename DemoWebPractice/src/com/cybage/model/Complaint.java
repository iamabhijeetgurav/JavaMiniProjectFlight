package com.cybage.model;

public class Complaint {
	private int id;
	private int userId;
	private int bookingId;
	private String issue;

	public Complaint(int id, int userId, int bookingId, String issue) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookingId = bookingId;
		this.issue = issue;
	}
	
	public Complaint(int userId, int bookingId, String issue) {
		super();
		this.userId = userId;
		this.bookingId = bookingId;
		this.issue = issue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	@Override
	public String toString() {
		return "Complaint [id=" + id + ", userId=" + userId + ", bookingId=" + bookingId + ", issue=" + issue + "]";
	}

}
