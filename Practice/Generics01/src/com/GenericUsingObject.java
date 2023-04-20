package com;

import java.util.Date;

class Obj {
	private Object reference;

	public Object getReference() {
		return reference;
	}

	public void setReference(Object reference) {
		this.reference = reference;
	}
}

public class GenericUsingObject {

	public static void main(String[] args) {
		
		Obj o1 = new Obj();
		o1.setReference(new Date());
		System.out.println(o1.getReference());
		
		o1.setReference(15);
		System.out.println(o1.getReference());
		
//		class java.lang.Integer cannot be cast to class java.util.Date (java.lang.Integer and java.util.Date are in module java.base of loader 'bootstrap')
//		at Generics01/com.GenericUsingObject.main
//		Date date = (Date)o1.getReference();
//		System.out.println(date);
		
		
//		class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
//		at Generics01/com.GenericUsingObject.main
//		String s = (String)o1.getReference();
//		System.out.println(s);
	}
}
