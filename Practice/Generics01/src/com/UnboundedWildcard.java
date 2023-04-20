package com;
import java.util.ArrayList;

public class UnboundedWildcard {

	public static void print(ArrayList<?> list) {
		System.out.println(list.toString());
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			list1.add(2*i);
		}
		UnboundedWildcard.print(list1);
		
		ArrayList<Character> list2 = new ArrayList<>();
		for(int i=65;i<=76;i++) {
			list2.add((char)i);
		}
		UnboundedWildcard.print(list2);
	}
}
