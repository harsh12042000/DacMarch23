package org.example.main;

class A extends Exception{	}
class B extends Exception{	}
class C extends Exception{	}
public class Program {
	//public static void print( int number ) throws A, B, C {
	public static void print( int number ) throws Exception {
		if( number == 10 )
			throw new A();
		if( number == 20 )
			throw new B();
		if( number == 30 )
			throw new C();
		System.out.println("Number	:	"+number);
	}
	public static void main(String[] args) {
		try {
			Program.print(50);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

