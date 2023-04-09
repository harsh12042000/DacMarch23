package in.cdac;

import java.util.Scanner;

class ArrayOperations {
	
	static Scanner sc = new Scanner(System.in);

	public static void acceptRecords(int[] arr) {
		System.out.println("Enter Array Elements :");
		for(int i = 0; i < arr.length ; i++ ) {
			arr[i] = sc.nextInt();
		}
	}

	public static void displayRecords(int[] arr) {
		System.out.println("Array Elements are :");
		for(int i = 0; i < arr.length ; i++ ) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length ; i++ ) {
			sum += arr[i];
		}
		System.out.println("Sum : " + sum);
	}

	public static void average(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length ; i++ ) {
			sum += arr[i];
		}
		System.out.println("Average : " + sum/arr.length);
	}

	public static void largestElement(int[] arr) {
		int ele = arr[0];
		for(int i = 0; i < arr.length ; i++ ) {
			if(arr[i] > ele) {
				ele = arr[i];
			}
		}
		System.out.println("Largest Element : " + ele);
	}

	public static void smallestElement(int[] arr) {
		int ele = arr[0];
		for(int i = 0; i < arr.length ; i++ ) {
			if(arr[i] < ele) {
				ele = arr[i];
			}
		}
		System.out.println("Smallest Element : " + ele);
	}

	public static void sort(int[] arr) {
		java.util.Arrays.sort(arr);
		System.out.println(java.util.Arrays.toString(arr));
	}
}

