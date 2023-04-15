package assignment5_04;

import java.util.Arrays;
import java.util.Comparator;

public class Restaurant {

	private static Menu menu = new Menu();
	private static Menu[] m = new Menu[10];
	
	public static void acceptRecord() {
		
		m[0] = new Menu("xyz", 20, 225.2);
		m[1] = new Menu("vvd", 11, 10.01);
		m[2] = new Menu("llnbv", 22, 220.222);
		m[3] = new Menu("zmknnh", 100, 85);
		m[4] = new Menu("xllonamz", 96, 102);
		m[5] = new Menu("xyz mmcy", 100, 88);
		m[6] = new Menu("Abv A", 120, 125);
		m[7] = new Menu("ayz", 020, 110);
		m[8] = new Menu("ZNM", 0001, 99);
		m[9] = new Menu("ABc ab mm", 88, 199.6);
	}

	public static void printRecord() {
		for(Menu arr : m)
			System.out.println(arr.toString());
	}

	public static void sort() {
		System.out.println("\n------------Sorted List by Name using Comparable-------------\n");
		Arrays.sort(m);
		Restaurant.printRecord();
		System.out.println("\n------------Sorted List by Price using Comparator-------------\n");
		Comparator<Menu> comparator = new PriceComparator();
		Arrays.sort(m, comparator);
		Restaurant.printRecord();
	}
}