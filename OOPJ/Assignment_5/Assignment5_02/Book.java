package assignment5_02;

public class Book implements Comparable<Book>{

	private int publishedYear;
	private String title;
	private String author;
	public Book(String title, String author, int publishedYear) {
		this.author = author;
		this.publishedYear = publishedYear;
		this.title = title;
	}
	public Book() {
		
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
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
	@Override
	public String toString() {
		return "Book [publishedYear=" + publishedYear + ", title=" + title + ", author=" + author + "]";
	}
	
	@Override
	public int compareTo(Book o) {
		return this.publishedYear - o.publishedYear;
	}
	
}
