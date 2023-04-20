package com;

import java.util.Date;

interface Map<K, V> {
	K getkey();
	V getValue();
}

class Hash<K, V> implements Map {
	
	private K key;
	private V value;
	
	public Hash(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public Object getkey() {
		return this.key;
	}

	@Override
	public Object getValue() {
		return this.value;
	}
	
}

public class Hashmap {
	public static void main(String args[]) {
		
		Hash<Date, String> map = new Hash<>(new Date(), "100");
		System.out.println(map.getkey() + " " + map.getValue());
		
	}
}
