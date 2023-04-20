package com;

// By extending thread class

class A extends Thread {
	
//	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Harshada");
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class program01 {

	public static void main(String[] args) {
		
		A th = new A();
		th.start();
		
		for(int i=0;i<5;i++) {
			try {
				System.out.println("Suhasini");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
