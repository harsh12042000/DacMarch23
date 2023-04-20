package com;

import java.util.ArrayList;

public class LowerBoundedWildcard {

	private void print(ArrayList<? super Integer> list) {
		System.out.println(list.toString());
	}

	public static void main(String[] args) {
		
		LowerBoundedWildcard b  = new LowerBoundedWildcard();
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

//List will contain reference if ArrayList which can contain Integer & its super type of elements.