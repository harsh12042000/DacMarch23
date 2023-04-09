package com.operations.airindia;

public class User {
	private String name;
	private String email;
	private long number;
	private int id;
	private int flightNo;
	private int bookedSeats;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public int getId() {
		return id;
	}
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	public String toString() {
		return String.format("%-25s%-10d%-10.2f", this.name, this.email, this.id);
	}
}
