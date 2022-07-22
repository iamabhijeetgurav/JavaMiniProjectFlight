package com.cybage.model;

public class Feedback {
//	 user_id     | int(11)      | YES  | MUL | NULL              |                   |
//	 | booking_id  | int(11)      | YES  | MUL | NULL              |                   |
//	 | rating      | int(11)      | YES  |     | 1                 |                   |
//	 | description
	private int userId;
	private int bookingId;
	private int rating;
	private String description;
	public Feedback() {
		
	}
	
	public Feedback(int userId, int bookingId, int rating, String description) {
		super();
		this.userId = userId;
		this.bookingId = bookingId;
		this.rating = rating;
		this.description = description;
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
