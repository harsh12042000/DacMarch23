package assignment5_02;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	private static void acceptRecord(Product p[]) {
		for(int i=0;i<p.length;i++) {
			System.out.print("Product Name : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Category : ");
			String category = sc.nextLine();
			System.out.print("Price : ");
			double price = sc.nextDouble();
			System.out.println("----------------------");
			
			p[i] = new Product(name, category, price);
		}
	}
	
	private static void printRecord(Product p[]) {
		for(Product arr : p) 
			System.out.println(arr.toString());
	}
	
	public static void main(String[] args) {	
		
		System.out.println("Enter how many products you want to add ? ");
		int size = sc.nextInt();
		
		Product p[] = new Product[size];
		
		Comparator<Product> comparator = new Product();
		
		Main.acceptRecord(p);
		Main.printRecord(p);
		Arrays.sort(p, comparator);
	}
}