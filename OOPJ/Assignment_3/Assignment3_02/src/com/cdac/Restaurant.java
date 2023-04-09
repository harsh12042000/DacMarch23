package com.cdac;
import com.cdac.dac.MenuOperations;
import com.cdac.dac.Menu;
import java.util.Scanner;

enum MenuList {
	EXIT, ADD, REMOVE, MODIFY, VIEW
}

public class Restaurant {
	
	static Scanner sc = new Scanner(System.in);

	public static MenuList menuList() {
		System.out.println("1. Add Menu");
		System.out.println("2. Remove Menu");
		System.out.println("3. Modify Menu");
		System.out.println("4. Display all Menu");
		System.out.println("0. Exit");
		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();
		return MenuList.values()[choice];
	}
	
	public static void acceptRecord(Menu m) {
		System.out.println("Enter Menu Name : ");
		sc.nextLine();
		m.setName(sc.nextLine());
		System.out.println("Enter Price : ");
		m.setPrice(sc.nextInt());
	}
	
	public static void main(String[] args) {
		MenuList menu;
		MenuOperations mo = new MenuOperations(10);
		while((menu = Restaurant.menuList()) != menu.EXIT) {
			switch(menu) {
				case ADD:
						Menu m = new Menu();
						Restaurant.acceptRecord(m);
						mo.addMenu(m);
						break;
						
				case MODIFY:
						System.out.println("Enter index to modify : ");
						mo.modifyMenu(sc.nextInt());
						break;
						
				case REMOVE:
						System.out.println("Enter index to remove menu : ");
						mo.removeMenu(sc.nextInt());
						break;
						
				case VIEW:
						System.out.println("***Menu***"); 
						mo.printMenu();
						break;
			}
		}
	}
}
