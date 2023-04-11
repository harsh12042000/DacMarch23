package com.pay;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public abstract class Employee {
	
	private int id;
	private String name;
	private double salary;
	protected double bonus;
	
	public abstract void calculatePay();
}                   