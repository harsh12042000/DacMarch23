package org.example.main;

import java.time.LocalDate;

public class Date {
	private int day;
	private int month;
	private int year;
	public Date() {
		LocalDate ld = LocalDate.now();
		this.day = ld.getDayOfMonth();
		this.month = ld.getMonthValue();
		this.year = ld.getYear();
	}
	@Override
	public String toString() {
		return this.day+" / "+this.month+" / "+this.year;
	}
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
	}
}
