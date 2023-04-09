package com.matrices;

class ArrayOperations {
	static void printArray(int r, int c, int arr[][]) {
		for(int i=0;i<r;i++) {
			for(int a: arr[i]) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
	static void addition(int r, int c, int arr1[][], int arr2[][]) {
		int arr[][] = new int[r][c];
		System.out.println("Addition is: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		printArray(r, c, arr);
	}
	
	static void subtraction(int r, int c, int arr1[][], int arr2[][]) {
		int arr[][] = new int[r][c];
		System.out.println("Subtraction is: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j] = arr1[i][j] - arr2[i][j];
			}
		}
		printArray(r, c, arr);
	}
	
	static void transpose(int r, int c, int arr1[][], int arr2[][]) {
		int arr[][] = new int[c][r];
		System.out.println("1st matrix after transpose: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[j][i] = arr1[i][j]; 
			}
		}
		printArray(c, r, arr);
		System.out.println("2nd matrix after transpose: ");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[j][i] = arr2[i][j]; 
			}
		}
		printArray(c, r, arr);
	}
}
