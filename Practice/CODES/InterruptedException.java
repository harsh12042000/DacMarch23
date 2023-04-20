package org.example.main;
public class Program {
	public static void showRecord( ) {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void displayRecord( ) throws InterruptedException {
		for( int count = 1; count <= 10; ++ count ) {
			System.out.println("Count	:	"+count);
			Thread.sleep(500);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		//Program.showRecord();
		try {
			Program.displayRecord();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
