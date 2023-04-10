package com.lib;

public class Librarian {
	private int index;
	private Book[] arr;
	
	public Librarian() {
		this(10);
	}
	
	public Librarian(int count) {
		this.arr = new Book[count];
	}
	
	public void addBook(Book b) {
		if(index < arr.length) {
			this.arr[index] = b;
			index++;
		} else {
			System.out.println("You cannot add more Books !");
		}
	}
	
	public void removeBook(int ISBN, int noOfCopies) {
		for(int i=0; i<this.arr.length ;i++) {
			if(this.arr[i] != null && this.arr[i].getISBN() == ISBN) {
				noOfCopies = this.arr[i].getnoOfCopies() - noOfCopies;
				this.arr[i].setnoOfCopies(noOfCopies);
			}
		}
	}
	
	public int getTotalBooks() {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null) {
				count = count + arr[i].getnoOfCopies();
			}
		}
		return count;
	}
	
	public void addOldBook(int ISBN, int noOfCopies) {
		int count = 0;
		for(int i=0; i<this.arr.length ;i++) {
			if(arr[i] != null && this.arr[i].getISBN() == ISBN) {
				count++;
				noOfCopies = this.arr[i].getnoOfCopies() + noOfCopies;
				this.arr[i].setnoOfCopies(noOfCopies);
			}
		}
		if(count == 0) {
			System.out.println("Sorry ! this Book is not already Available");
		}
	}
	
	public void allBooks() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != null) {
				System.out.println(arr[i].toString());
			}
		}
	}
}