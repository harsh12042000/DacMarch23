import java.util.Scanner;

/*
You are required to write a Java program to implement a Book class that can be
used to manage a book inventory system.
The Book class should have the following fields:
a. title: A string field to store the title of the book.
b. author: A string field to store the name of the author of the book.
c. publisher: A string field to store the name of the publisher of the book.
d. isbn: A string field to store the ISBN number of the book.
e. year: An integer field to store the year in which the book was published.
f. price: A double field to store the price of the book.
g. quantity: An integer field to store the quantity of the book in the inventory.
The Book class should have following methods
a. Constructors,
b. Getter & setter methods
c. Business Logic methods
I. increaseQuantity(int quantity ): A method to increase the quantity of
the book in the inventory by the specified amount.
II. decreaseQuantity(int quantity): A method to decrease the quantity of
the book in the inventory by the specified amount.
III. getInventoryValue(): A method to calculate the total value of the
inventory of the book, which is the product of the price and the
quantity of the book. 
 */
class BookInventory {

	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private int price;
	private int quantity;

	BookInventory() {
		this.title = "The Haunted Dinosaur";
		this.author = "Geronimo Stilton";
		this.publisher = "Creepellavon Cacklefur";
		this.isbn = "ISBN120451";
		this.year = 2017;
		this.price = 750;
		this.quantity = 50;
	}

	int getQuantity() {
		return this.quantity;
	}

	String getBookName() {
		return this.title;
	}

	String getAuthor() {
		return this.author;
	}

	String getPublisher() {
		return this.publisher;
	}

	String getIsbn() {
		return this.isbn;
	}

	int getYear() {
		return this.year;
	}

	int getPrice() {
		return price;
	}

	void increaseQuantity(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	void decreaseQuantity(int quantity) {
		this.quantity = this.quantity - quantity;
	}

	int getInventoryValue() {
		return this.quantity * this.price;
	}
}

class Assignment2_03 {

	static Scanner sc = new Scanner(System.in);

	static int opeartions() {
		System.out.println("\n1. Increase Quantity");
		System.out.println("2. Decrease Quantity");
		System.out.println("3. Get Inventory Value");
		System.out.println("4. Get Book Details");
		System.out.println("0. Exit");
		System.out.print("Enter choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		int choice = 0;
		BookInventory book = new BookInventory();
		while ((choice = Assignment2_03.opeartions()) != 0) {

			switch (choice) {
				case 1:
					System.out.print("How many Quantity you want to increase? : ");
					book.increaseQuantity(sc.nextInt());
					System.out.println("Quantity after incresing: " + book.getQuantity());
					break;

				case 2:
					System.out.print("How many Quantity you want to decrease? : ");
					book.decreaseQuantity(sc.nextInt());
					System.out.println("Quantity after decreasing: " + book.getQuantity());
					break;

				case 3:
					System.out.println("Get Inventory values: ");
					System.out.println("Total value of Inventory: " + book.getInventoryValue());
					break;

				case 4:
					System.out.println("\nDetails of Book : ");
					System.out.println("Name : " + book.getBookName());
					System.out.println("Author : " + book.getAuthor());
					System.out.println("Publisher : " + book.getPublisher());
					System.out.println("ISBN : " + book.getIsbn());
					System.out.println("Year : " + book.getYear());
					System.out.println("Price : " + book.getPrice());
					System.out.println("Quantity : " + book.getQuantity());
					break;
			}
		}
	}
}