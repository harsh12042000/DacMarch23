package com;

import java.util.Arrays;
import java.util.Scanner;

interface Collection {
	void accpetRecord();
	void printRecord();

	int[] toArray();
	
	static void swap(int[] arr) {
		int temp = arr[ 0 ];
		arr[ 0 ] = arr[ 1 ];
		arr[ 1 ] = temp;
	}
	
	default void sort() {
		int arr[] = this.toArray();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp[] = new int[] {arr[j] , arr[j+1]};
					Collection.swap(temp);
					arr[j] = temp[0];
					arr[j+1] = temp[1];
				}
				
			}
		}
	}
}

class Array implements Collection {
	
	private int arr[];
	
	public Array(int size) {
		this.arr = new int[size];
	}

	@Override
	public void accpetRecord() {
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<this.arr.length;i++) {
				System.out.print("Enter Element : ");
				this.arr[i] = sc.nextInt();
			}
		}
	}

	@Override
	public void printRecord() {
		System.out.println(Arrays.toString(arr));
	}

	@Override
	public int[] toArray() {
		return this.arr;
	}
	
//	@Override
//	public void sort() {
//		for( int i = 0; i < this.arr.length - 1; ++ i ) {
//			for( int j = i + 1; j < this.arr.length; ++ j ) {
//				if( this.arr[ i ] > this.arr[ j ] ) {
//					int[] temp = new int[ ] { arr[ i ], arr[ j ]};
//					Collection.swap(temp);
//					arr[ i ] = temp[ 0 ];
//					arr[ j ] = temp[ 1 ];
//				}
//			}
//		}
//	}
	
}


public class Sort {

	public static void main(String[] args) {
		Collection c = new Array(6);
		c.accpetRecord();
		c.sort();
		c.printRecord();
	}

}
