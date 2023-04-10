package com.lib;

public class Book {
	private String title;
	private String author;
	private int ISBN;
	private String publisher;
	private int noOfCopies;
	
	public Book() {
	}

	public Book(String title, String author, int iSBN, String publisher) {
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setnoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public int getnoOfCopies() {
		return noOfCopies;
	}

	@Override
	public String toString() {
		return "\nBook [title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", publisher=" + publisher
				+ ", noOfCopies=" + noOfCopies + "]";
	}

}
