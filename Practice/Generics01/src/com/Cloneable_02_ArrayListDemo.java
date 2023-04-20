package com;

import java.util.ArrayList;

class Date implements Cloneable{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public Date clone( )  {
		try {
			Date other = (Date) super.clone();
			return other;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public String toString() {
		return this.day+" / "+this.month+" / "+this.year;
	}
}
public class Cloneable_02_ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		
		ArrayList<Integer> list2 = (ArrayList<Integer>)list1.clone();
		list1.clear();
		System.out.println(list1);
		System.out.println(list2);
	}
	public static void main2(String[] args) {
		
			Date dt1 = new Date(13, 4,2023);
			Date dt2 = dt1.clone();
			dt2.setDay(23);
			dt2.setMonth(7);
			dt2.setYear(1983);
			
			System.out.println(dt1);
			System.out.println(dt2);
	}
	public static void main1(String[] args) {
		Date dt1 = new Date(13, 4,2023);
		Date dt2 = dt1;	//Shallow copy of references
		//System.out.println( dt1 == dt2 );	//true
	}
}
