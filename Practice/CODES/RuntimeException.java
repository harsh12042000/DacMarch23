package org.example.main;
interface Printable{
	void print( );
}
class Test implements Printable{
	@Override
	public void print() throws RuntimeException {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				Thread.sleep(250);
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause );	//Exception chaining
		}
	}
}
public class Program {
	public static void main(String[] args) {
		Printable p = new Test();
		p.print();
	}
}

