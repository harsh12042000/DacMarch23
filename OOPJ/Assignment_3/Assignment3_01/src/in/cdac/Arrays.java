package in.cdac;
import java.util.Scanner;
/*
Design a Java program that will accept an array of integers and perform various
operations on it. The program should have the following features:
a. Accept an array of integers of size n from the user.
b. Display the contents of the array on the console.
c. Calculate and display the sum of all the elements in the array.
d. Calculate and display the average of all the elements in the array.
e. Find and display the largest element in the array.
f. Find and display the smallest element in the array.
g. Sort the array in ascending order and display the sorted array on the console.
 */
enum Menu {
	EXIT, DISPLAY, SUM, AVERAGE, BIG, SMALL, SORT;
}

public class Arrays {

	static Scanner sc = new Scanner(System.in);
	
	private static Menu MenuList() {
		System.out.println("\n1. Display Array Contents ");
		System.out.println("2. Sum of Array Elements ");
		System.out.println("3. Average of Array Elements ");
		System.out.println("4. Largest Element in an Array ");
		System.out.println("5. Smallest Element in an Array ");
		System.out.println("6. Sort Array in Ascending order ");
		System.out.println("0. Exit");
		System.out.print("Enter Choice : ");
		int choice = sc.nextInt();
		return Menu.values()[choice];
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter Size of Array : ");
		int arr[] = new int[sc.nextInt()];
		ArrayOperations.acceptRecords(arr);
		
		Menu choice;
		
		while((choice = Arrays.MenuList()) != Menu.EXIT) {
			switch(choice) {
				case DISPLAY:
						ArrayOperations.displayRecords(arr);
						break;
						
				case SUM:
						ArrayOperations.sum(arr);
						break;
						
				case AVERAGE:
						ArrayOperations.average(arr);
						break;
						
				case BIG:
						ArrayOperations.largestElement(arr);
						break;
						
				case SMALL:
						ArrayOperations.smallestElement(arr);
						break;
						
				case SORT:
						ArrayOperations.sort(arr);
						break;
				
			}
		}

	}
}
