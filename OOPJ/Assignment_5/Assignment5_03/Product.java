package assignment5_02;

import java.util.Comparator;

public class Product implements Comparator<Product>{

	private double price;
	private String name;
	private String category;

	public Product(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "product [price=" + price + ", name=" + name + ", category=" + category + "]";
	}
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.price > o2.price)
			return -1;
		else if(o1.price < o2.price)
			return 1;
		return 0;
	}
	
}
