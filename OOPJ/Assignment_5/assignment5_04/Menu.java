package assignment5_04;

public class Menu implements Comparable<Menu>{

	private String name;
	private int calories;
	private double price;
	
	Menu() {
		
	}

	public Menu(String name, int calories, double price) {
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-10d%-10.2f", this.name,this.calories,this.price);
	}

	@Override
	public int compareTo(Menu o) {
		return this.name.compareTo(o.name);
	}
	
}