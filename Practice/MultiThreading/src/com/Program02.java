package com;

//By Runnable

class X implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Harshada");
		}
	}
}


public class Program02 {

	public static void main(String[] args) {
	
		X x = new X();
		Thread t = new Thread(x); //for start()
		t.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("Sayli");
		}
	}
}
