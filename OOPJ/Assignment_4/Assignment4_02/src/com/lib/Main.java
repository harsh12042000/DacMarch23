package com.lib;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void accepLibrarianDetails(Library l) {
		System.out.print("Enter Librarian Name : ");
		sc.nextLine();
		l.setName(sc.nextLine());
		System.out.print("Enter Contact Number : ");
		l.setContactNumber(sc.nextInt());
	}
	
	public static void acceptBookDetails(Book b) {
		System.out.print("Enter Book Name : ");
		sc.nextLine();
		b.setTitle(sc.nextLine());
		System.out.print("Enter Author Name : ");
		b.setAuthor(sc.nextLine());
		System.out.print("Enter Publisher Name : ");
		b.setPublisher(sc.nextLine());
		System.out.print("Enter ISBN : ");
		b.setISBN(sc.nextInt());
		System.out.print("Enter Number of Copies : ");
		b.setnoOfCopies(sc.nextInt());
	}
	
	public static int menuList() {
		System.out.println("\n1. Add New Book  ");
		System.out.println("2. Add New Librarian ");
		System.out.println("3. Add Copies of old Book  ");
		System.out.println("4. Remove Copies of old Book");
		System.out.println("5. Get Total Count of Books");
		System.out.println("6. List of all Books");
		System.out.println("7. Librarian Details");
		System.out.println("0. Exit");
		System.out.print("Enter your choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
	
		Library lib = new Library();
		
		int choice = 0, ISBN = 0, copies = 0;
		
		while((choice = Main.menuList()) != 0) {
			switch(choice) {
				case 1:
					Book b = new Book();
					Main.acceptBookDetails(b);
					lib.addBook(b);
					break;
					
				case 2:
					Main.accepLibrarianDetails(lib);
					break;
					
				case 3:
					System.out.print("\nEnter ISBN of Book : ");
					ISBN = sc.nextInt();
					System.out.print("\nEnter how many copies you want to add : ");
					copies = sc.nextInt();
					lib.addOldBook(ISBN, copies);
					break;
					
				case 4:
					System.out.print("\nEnter ISBN of Book : ");
					ISBN = sc.nextInt();
					System.out.print("\nEnter how many copies you want to remove : ");
					copies = sc.nextInt();
					lib.removeBook(ISBN, copies);
					break;
					
				case 5:
					lib.getTotalBooks();
					break;
					
				case 6:
					lib.displayBooks();
					break;
					
				case 7:
					lib.librarianDetails();
					break;
			}
		}
	}
}
