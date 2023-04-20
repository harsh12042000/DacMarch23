package com;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Employee implements Comparable<Employee>{
	private int empNumber;
	private String empName;
	private String job;
	private int manager;
	private LocalDate hireDate;
	private float salary;
	private float commision;
	private int deptNumber;
	
	@Override
	public String toString() {
		return String.format("%-5d%-10s%-10s%-5d%-15s%-10.2f%-10.2f%-5d", this.empNumber, this.empName, this.job, this.manager, this.hireDate, this.salary, this.commision, this.deptNumber);
	}

	
	/* @Override
	public int compareTo(Employee other) {	//Natural comparison method
		if( this.manager < other.manager )
			return -1;
		if( this.manager > other.manager )
			return 1;
		return 0;
	} */
	
	/* @Override
	public int compareTo(Employee other) {	//Natural comparison method
		return this.manager - other.manager;
	} */
	
	/* @Override
	public int compareTo(Employee other) {	//Natural comparison method
		return this.empName.compareTo(other.empName);
	} */
	
	@Override
	public int compareTo(Employee other) {	//Natural comparison method
		return this.hireDate.compareTo(other.hireDate);
	}
	
}
