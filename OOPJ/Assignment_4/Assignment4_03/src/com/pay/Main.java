package com.pay;
import java.util.Scanner;

public class Main {
	
	private Employee[] arr = new Employee[2];
	static Scanner sc = new Scanner(System.in);
	
	public Main() {
		arr[0] = new FullTimeEmployee();
		arr[1] = new PartTimeEmployee();
	}
	
	public void acceptFullTime() {
		if(arr[0] != null && arr[0] instanceof FullTimeEmployee ) {
			FullTimeEmployee fte = (FullTimeEmployee) arr[0];
			System.out.print("Enter ID : ");
			fte.setId(sc.nextInt());
			System.out.print("Enter Name : ");
			sc.nextLine();
			fte.setName(sc.nextLine());
			System.out.print("Enter Salary : ");
			fte.setSalary(sc.nextDouble());
		}
		arr[0].calculatePay();
	}
	
	public void acceptPartTime() {
		if(arr[1] != null && arr[1] instanceof PartTimeEmployee ) {
			PartTimeEmployee pte = (PartTimeEmployee) arr[1];
			System.out.print("Enter ID : ");
			pte.setId(sc.nextInt());
			System.out.print("Enter Name : ");
			sc.nextLine();
			pte.setName(sc.nextLine());
			System.out.print("Enter Salary : ");
			pte.setSalary(sc.nextDouble());
			System.out.print("Enter Hours Worked : ");
			pte.setHoursWorked(sc.nextInt());
			System.out.print("Enter Hourly Rate :");
			pte.setHourlyRate(sc.nextDouble());
		}
		arr[1].calculatePay();
	}
	
	private void displayPayRoll() {
		System.out.println(" \ntotal payroll of the company : " + (arr[0].getBonus() + arr[0].getSalary() + arr[1].getBonus() + arr[1].getSalary()));
	}
	
//	private void displayFullTime() {
//		if(arr != null) {
//			System.out.println("Bonus : Full Time Employee : " + (arr[0].getBonus() + arr[0].getSalary()));
//		}
//	}
	
//	private void displayPartTime() {
//		if(arr != null) {
//			System.out.println("Bonus : Part Time Employee : " + (arr[1].getBonus() + arr[1].getSalary()));
//		}
//	}
	
	public static int menuList() {
		System.out.println("1. Enter Full Time Employee Details");
		System.out.println("2. Enter Part Time Employee Details");
//		System.out.println("3. Get Full Time Employee Bonus");
//		System.out.println("4. Get Part Time Employee Bonus");
		System.out.println("5. Total payroll of the company");
		System.out.println("0. Exit");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int choice = 0;
		Main m = new Main();
		while((choice = Main.menuList()) != 0) {
			
			switch(choice) {
			
				case 1:
					m.acceptFullTime();
					break;
					
				case 2:
					m.acceptPartTime();
					break;
					
//				case 3:
//					m.displayFullTime();
//					break;
//					
//				case 4:
//					m.displayPartTime();
//					break;
					
				case 5:
					m.displayPayRoll();
					break;
			}
			
		}
		
	}
}
