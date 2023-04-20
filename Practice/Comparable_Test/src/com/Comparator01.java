package com;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Comparator01 {
	
	static Scanner sc = new Scanner(System.in);

	private static Employee[] getArray() {
		Employee[] arr = new Employee[14];	//Array of references
		//Array of instances
		arr[0] = new Employee(7369, "SMITH", "CLERK", 7902, LocalDate.parse("1980-12-17"), 800.00f, 0, 20);
		arr[1] = new Employee(7499, "ALLEN", "SALESMAN", 7698, LocalDate.parse("1981-02-20"), 1600.00f, 300.00f, 30);
		arr[2] = new Employee(7521, "WARD", "SALESMAN", 7698, LocalDate.parse("1981-02-22"), 1250.00f, 500.00f, 30);
		arr[3] = new Employee(7566, "JONES", "MANAGER", 7839, LocalDate.parse("1981-04-02"), 2975.00f, 0, 20);
		arr[4] = new Employee(7654, "MARTIN", "SALESMAN", 7698, LocalDate.parse("1981-09-28"), 1250.00f, 1400.00f, 30);
		arr[5] = new Employee(7698, "BLAKE", "MANAGER", 7839, LocalDate.parse("1981-05-01"), 2850.00f, 0, 30);
		arr[6] = new Employee(7782, "CLARK", "MANAGER", 7839, LocalDate.parse("1981-06-09"), 2450.00f, 0, 10);
		arr[7] = new Employee(7788, "SCOTT", "ANALYST", 7566, LocalDate.parse("1982-12-09"), 3000.00f, 0, 20);
		arr[8] = new Employee(7839, "KING", "PRESIDENT", 0, LocalDate.parse("1981-11-17"), 5000.00f, 0, 10);
		arr[9] = new Employee(7844, "TURNER", "SALESMAN", 7698, LocalDate.parse("1981-09-08"), 1500.00f, 0.00f, 30);
		arr[10] = new Employee(7876, "ADAMS", "CLERK", 7788, LocalDate.parse("1983-01-12"), 1100.00f, 0, 20);
		arr[11] = new Employee(7900, "JAMES", "CLERK", 7698, LocalDate.parse("1981-12-03"), 950.00f, 0, 30);
		arr[12] = new Employee(7902, "FORD", "ANALYST", 7566, LocalDate.parse("1981-12-03"), 3000.00f, 0, 20);
		arr[13] = new Employee(7934, "MILLER", "CLERK", 7782, LocalDate.parse("1982-01-23"), 1300.00f, 0, 10);
		return arr;
	}
	
	private static void printRecord(Employee[] arr) {
		if(arr != null) {
			for(Employee emp : arr)
				System.out.println(emp);
		}
	}
	
	private static int menuList() {
		System.out.println("0.//Exit");
		System.out.println("1.Name.");
		System.out.println("2.Job.");
		System.out.println("3.HireDate.");
		System.out.println("4.Salary.");
		System.out.println("5.Dept No.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		Employee[] arr = Comparator01.getArray();
		
		while((choice = Comparator01.menuList()) != 0) {
			Comparator<Employee> comp = null;
			
			switch(choice) {
				
				case 1:
					comp = new NameComparator();
					break;
			}
			
			Arrays.sort(arr, comp);
			Comparator01.printRecord(arr);
		}
	}
}
