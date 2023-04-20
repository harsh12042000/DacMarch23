package com;

class Box<T> {
	private T reference;
	
	public Box() {
		super();
	}

	public Box(T reference) {
		super();
		this.reference = reference;
	}

	public T getReference() {
		return reference;
	}

	public void setReference(T reference) {
		this.reference = reference;
	}
	
}


public class Genrics01 {
	
	public static void main(String args[]) {
		Box b1 = new Box();
		System.out.println(b1.getReference());
	}
	
}
