package com.lib;
import java.util.Scanner;

public class Library {
	
	private int contactNumber;
	private String name;
	Librarian l = new Librarian(5);
	static Scanner sc = new Scanner(System.in);
	
	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Librarian [contactNumber=" + contactNumber + ", name=" + name + "]";
	}

	public void addBook(Book b) {
		l.addBook(b);
	}
	
	public void removeBook(int ISBN, int noOfCopies) {
		l.removeBook(ISBN, noOfCopies);
	}
	
	public void getTotalBooks() {
		System.out.println("Total Books : "  + l.getTotalBooks());
	}
	
	public void addOldBook(int ISBN , int noOfCopies) {
		l.addOldBook(ISBN, noOfCopies);
	}
	
	public void displayBooks() {
		l.allBooks();
	}
	
	public void librarianDetails() {
		System.out.println("Name : " + this.name);
		System.out.println("Contact Number : " + this.contactNumber);
	}
}
