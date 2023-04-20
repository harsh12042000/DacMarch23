package org.example.main;

class TickTock{
	public void tick() throws InterruptedException {
		synchronized( this ) {
			System.out.print("Tick	");
			this.notify();
			this.wait( 1000 );	//To avoid deadlock pass time
		}
	}
	public void tock() throws InterruptedException {
		synchronized( this ) {
			System.out.println("	Tock");
			this.notify();
			this.wait( 1000 );	//To avoid deadlock pass time
		}
	}
}

class Task implements Runnable{
	Thread thread;
	public Task( String name) {
		this.thread = new Thread(this, name);
		this.thread.start();
	}
	private static TickTock tt = new TickTock();
	@Override
	public void run() {
		try {
			if( Thread.currentThread().getName().equals("TickThread")) {
				for( int count = 1; count <= 5; ++ count ) {
					tt.tick();
					Thread.sleep(250);
				}
			}else {
				for( int count = 1; count <= 5; ++ count ) {
					tt.tock();
					Thread.sleep(250);
				}
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException( cause );
		}
	}
}
public class Program {
	public static void main(String[] args)throws Exception{
		Task t1 = new Task("TickThread");
		
		Task t2 = new Task("TockThread");
		
		while( true ) {
			System.out.println(t1.thread.getName()+"	"+t1.thread.getState().name());
			System.out.println(t2.thread.getName()+"	"+t2.thread.getState().name());
			Thread.sleep(100);
		}
	}
}
