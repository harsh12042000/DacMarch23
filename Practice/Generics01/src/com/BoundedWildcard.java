package com;
import java.util.ArrayList;

//Upper Bounded
public class BoundedWildcard {
	
	private void print(ArrayList<? extends Number> list) {
		System.out.println(list.toString());
	}

	public static void main(String[] args) {
		
		BoundedWildcard b  = new BoundedWildcard();
		ArrayList<Integer> list1 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		b.print(list1);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("A");
		list2.add("B");
//		b.print(list2);
	}
}