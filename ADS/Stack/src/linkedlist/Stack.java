package linkedlist;

import java.util.EmptyStackException;

class List {
	
	private Node top;
	private int size;

	static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty() {
		return size == -1;
	}
	
	public void push(int data) {
		
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public int pop() {
		if(isEmpty())
			throw new EmptyStackException();
		
		int result = top.data;
		top = top.next;
		size--;
		return result;
	}
	
	public int peek() {
		if(isEmpty())
			throw new EmptyStackException();
		return top.data;
	}
	
	public void displayStack() {
		Node trav = top;
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public int size() {
		return size;
	}
	
}


public class Stack {

	public static void main(String[] args) {
		List list = new List();
		System.out.println("Stack size : " + list.size());
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		list.push(50);
		list.push(60);
		list.push(70);
		list.push(80);
		list.push(90);
		list.push(100);
		list.displayStack();
		System.out.println("Stack size : " + list.size());
		
		System.out.println();
		System.out.println("Popped : " + list.pop());
		System.out.println("Popped : " + list.pop());
		list.displayStack();
		System.out.println("Stack size : " + list.size());
		
		System.out.println();
		System.out.println("Peek : " + list.peek());
	}

}
