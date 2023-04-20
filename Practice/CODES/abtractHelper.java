package org.example.main;

abstract class A{
	public abstract void f1( );
	public abstract void f2( );
	public abstract void f3( );
}
abstract class B extends A{
	@Override
	public void f1() {	}
	@Override
	public void f2() {	}
	@Override
	public void f3() {	}
}
class C extends B {
	@Override
	public void f1() {
		System.out.println("C.f1");
	}
}
class D extends B {
	@Override
	public void f2() {
		System.out.println("D.f2");
	}
}
class E extends B{
	@Override
	public void f3() {
		System.out.println("E.f3");
	}
}
public class Program {
	public static void main(String[] args) {
		A a = null;
		
		a = new C();
		a.f1();
		
		a = new D();
		a.f2();
		
		a = new E();
		a.f3();
	}
}
