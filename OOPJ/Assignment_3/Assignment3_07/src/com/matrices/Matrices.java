package com.matrices;

//Array 2D : Matrix, Addition, Substraction, Multiplication, Transpose
import java.util.Scanner;
public class Matrices {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows of array: ");
		int rows = sc.nextInt();
		System.out.print("Enter columns of array: ");
		int cols = sc.nextInt();
		
		int arr1[][] = new int[rows][cols];
		int arr2[][] = new int[rows][cols];
		int choice = 0;
		
		System.out.println("Enter Array Elements for 1st matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Enter Array Elements for 2nd matrix: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		do {
			System.out.println("\n" + "1. Print Array Elements\n" + "2. Matrix Addition\n" + "3. Matrix Subtraction\n" + "4. Transpose of Matrix\n" + "0. Exit\n" + "Enter Choice Number :");
			choice = sc.nextInt();
			
			switch(choice) {
				
				case 1: System.out.println("1st matrix : ");
						ArrayOperations.printArray(rows, cols, arr1);
						System.out.println("2nd matrix : ");
						ArrayOperations.printArray(rows, cols, arr2);
						break;
						 
				case 2: ArrayOperations.addition(rows, cols, arr1, arr2);
						break;
						
				case 3: ArrayOperations.subtraction(rows, cols, arr1, arr2);
						break;
						
				case 4: ArrayOperations.transpose(rows, cols, arr1, arr2);
						break;		 
			}
		} while(choice != 0);
	}
}