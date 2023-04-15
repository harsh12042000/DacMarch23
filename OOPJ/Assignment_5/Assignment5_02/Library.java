package assignment5_02;

import java.util.Arrays;

public class Library {

	private static Book[] b = new Book[10];
	
	public static void setRecord() {
		b[0] = new Book("Abc" , "Tejal" , 2014);
		b[1] = new Book("def" , "Nikita" , 2021);
		b[2] = new Book("kjh" , "Ravindra" , 2017);
		b[3] = new Book("ppu" , "Vishal" , 1985);
		b[4] = new Book("habj" , "Deepak" , 2001);
		b[5] = new Book("mkhabv" , "Suhasini" , 1914);
		b[6] = new Book("landt f" , "Pragati" , 2004);
		b[7] = new Book("makel uhd" , "Himanshu" , 1999);
		b[8] = new Book("zzya" , "Falguni" , 2020);
		b[9] = new Book("k" , "Akshada" , 2020);
	}

	public static void printRecord() {
		for(Book arr : b) 
			System.out.println(arr.toString());
	}
	
	public static void sort() {
		Arrays.sort(b);
		System.out.println();
		for(Book arr : b) 
			System.out.println(arr.toString());
	}
}

public class Main {

	public static void main(String[] args) {

		Library.setRecord();
		Library.printRecord();
		Library.sort();
	}

}