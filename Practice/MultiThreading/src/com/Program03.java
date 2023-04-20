package com;

class B extends Thread {
	
	@Override
	public void run() {
		
		String n =  Thread.currentThread().getName();
		
		for(int i=0;i<3;i++) {
			System.out.println(n);
		}
	}
	
}

public class Program03 {

	public static void main(String[] args) throws InterruptedException {
		
		B t1 = new B();
		B t2 = new B();
		B t3 = new B();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		
		t1.start();
		t1.join();
		t2.start();
		t3.start();
		
		for(int i=0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
