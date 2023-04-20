package org.example;

class A extends RuntimeException{	}
class B extends RuntimeException{	}
class C extends RuntimeException{	}
class D extends RuntimeException{	}


class X{
	public void print( ) throws A,B,C{
		System.out.println("X.print");
	}
}
class Y extends X{
	@Override
	public void print( )throws A, B, C, D {
		System.out.println("Y.print");
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			X x = new Y();
			x.print();
		} catch (A | B | C e) {
			e.printStackTrace();
		}
	}
}
