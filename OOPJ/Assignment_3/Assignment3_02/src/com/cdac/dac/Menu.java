package com.cdac.dac;

public class Menu {
	private int price;
	private String name;
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return String.format("%-25s%-10", this.name, this.price);
	}
}
