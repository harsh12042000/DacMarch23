package org.example.main;

import java.util.Iterator;

class Node{
	int data;
	Node next = null;
	public Node( int data ) {
		this.data = data;
	}
}
class LinkedList implements Iterable<Integer>{
	private Node head = null;
	private Node tail = null;
	
	public boolean empty( ) {
		return this.head == null;
	}
	public void addLast( int element ) {
		Node newNode = new Node( element );
		if( this.empty() ) 
			this.head = newNode;
		else
			this.tail.next = newNode;
		this.tail = newNode;
	}
	@Override
	public Iterator<Integer> iterator() {
		Iterator<Integer> itr = new LinkedListIterator( this.head );	//Upcasting
		return itr;
	}
	
}
class LinkedListIterator implements Iterator<Integer>{
	private Node trav;
	
	public LinkedListIterator(Node head) {
		this.trav = head;
	}
	@Override
	public boolean hasNext() {
		return this.trav != null;
	}
	@Override
	public Integer next() {
		int data = trav.data;
		trav = trav.next;
		return data;
	}
}
public class Program {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast( 10 );
		list.addLast( 20 );
		list.addLast( 30 );
		
		for( int element : list )
			System.out.println( element );
	}
}
