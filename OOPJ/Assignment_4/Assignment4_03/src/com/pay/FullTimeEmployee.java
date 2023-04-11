package com.pay;

public class FullTimeEmployee extends Employee {
	
	@Override
	public void calculatePay() {
		this.bonus = (10 * this.getSalary()) / 100;
	}
}
