package com;

interface Bound<T> {
	T getRef();
}

class Bounded<T extends Number> implements Bound{
	
	private T ref;
	
	Bounded(T ref) {
		this.ref = ref;
	}

	@Override
	public Object getRef() {
		return this.ref;
	}
	
}

public class BoundedTypeParameter {

	public static void main(String[] args) {
		Bounded<Integer> b = new Bounded<>(10);
//		Bounded<String> s = new String<>("xyz");
		System.out.println(b.getRef());
	}
}
