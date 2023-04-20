package com;

class Abc {
	protected int a = 10;
//	private int b = 50;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
}

public class Test {

	public static void main(String[] args) {
		Abc abc = new Abc();
//		System.out.println(abc.getA());
//		abc.a = 50;
//		abc.setA(100);
		System.out.println(abc.a);
	}

}
