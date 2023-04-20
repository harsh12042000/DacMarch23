package com;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();	
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
//		System.out.println(al);
		
		Iterator<Integer> i = al.iterator();
		while(i.hasNext()) {
//			System.out.println(i.next());
			if(i.next() == 30) 
				i.remove();
		}
		
		System.out.println(al);
		
	}
}
