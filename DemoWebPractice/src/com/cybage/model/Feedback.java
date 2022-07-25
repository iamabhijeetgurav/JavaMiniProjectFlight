package com.cybage.model;

public class Feedback {
	private int id;
	private int userId;
	private int bookingId;
	private int rating;
	private String description;

	public Feedback() {

	}

	public Feedback(int id, int userId, int bookingId, int rating, String description) {
		super();
		this.id = id;
		this.userId = userId;
		this.bookingId = bookingId;
		this.rating = rating;
		this.description = description;
	}

	public Feedback(int userId, int bookingId, int rating, String description) {
		super();
		this.userId = userId;
		this.bookingId = bookingId;
		this.rating = rating;
		this.description = description;
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Feedback [userId=" + userId + ", bookingId=" + bookingId + ", rating=" + rating + ", description="
				+ description + "]";
	}

}
