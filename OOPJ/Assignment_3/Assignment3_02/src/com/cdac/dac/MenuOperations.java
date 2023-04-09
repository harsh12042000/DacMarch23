package com.cdac.dac;
import java.util.Scanner;
import com.cdac.dac.Menu;

public class MenuOperations {
	
	private Menu arr[];
	private int index;
	
	static Scanner sc = new Scanner(System.in);
	
	public MenuOperations(int size) {
		this.arr = new Menu[size];
	}

	public void addMenu(Menu m) {
		if(index < this.arr.length) {
			this.arr[index] = m;
			index++;
		} else {
			System.out.println("Sorry ! You Cannot add more menu");
		}
	}

	public void modifyMenu(int id) {
		for(index=0;index<arr.length;index++) {
			if(index == id && arr[index] != null) {
				System.out.print("Enter New Menu Name :  ");
				arr[index].setName(sc.nextLine());
				System.out.print("Enter New Price : ");
				arr[index].setPrice(sc.nextInt());
			} 
		}
	}

	public void removeMenu(int id) {
		for(index=0;index<arr.length;index++) {
			if(index == id && this.arr[index] != null) {
				this.arr[index] = null;
				System.out.println("Menu Removed !");
			} 
		}
	}
	
	public void printMenu() {
	    for (int i = 0; i < this.arr.length; i++) {
	        Menu m = this.arr[i];
	        if (m != null) {
	            System.out.println("index : " + i);
	            System.out.println("Menu : " + m.getName());
	            System.out.println("Price : " + m.getPrice());
	            System.out.println("------------------------------");
	        }
	    }
	}
}
