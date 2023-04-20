package com;
import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
	
		ArrayList<Number> list = new ArrayList<>();
		list.add(10);
		list.add(25.5f);
		list.add(25555d);
		list.add(1);
		
//		System.out.println(list.toString());
		
		for(Number num : list) {
			System.out.println(num);
		}
	}
}
