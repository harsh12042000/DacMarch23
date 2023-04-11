package com.pay;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public class PartTimeEmployee extends Employee {

	private int hoursWorked;
	private double hourlyRate;
	
	@Override
	public void calculatePay() {
		if(this.getHoursWorked() >= 40) {
			this.bonus = (20 * this.getSalary()) / 100;
		}
	}
}
