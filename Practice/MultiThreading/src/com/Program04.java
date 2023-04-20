package com;

//Suspend method is to put the thread from runnning state to waiting state
//Resume - resume suspended thread from waiting state to runnable state
//Yield - allow us to run another thread which has same priority to pause its current thread 

class M extends Thread {
	
	@Override
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println(Thread.currentThread().getName());
			Thread.yield();
		}
	}
}

class N extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=3;i++)
			System.out.println(Thread.currentThread().getName());
	}
	
}

public class Program04 {

	public static void main(String[] args) {
	
//		M t1 = new M();
//		M t2 = new M();
//		M t3 = new M();
//		
//		t1.setName("Harshada");
//		t2.setName("Akshada");
//		t3.setName("Arthesh");
//		
//		t1.start();
//		t2.start();
//		t2.suspend();
//		t3.start();
//		t2.resume();
		
		M t1 = new M();
		N t2 = new N();
		
		t1.start();
		t2.start();
	}
}
