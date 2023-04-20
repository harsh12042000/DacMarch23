package com;

class Node {
	int data;
	Node next = null;

	public Node(int data) {
		this.data = data;
	}
}

class LinkedList1 {
	private Node head = null;
	private Node tail = null;

	public boolean empty() {
		return this.head == null;
	}

	public void addLast(int element) {
		Node newNode = new Node(element);
		if (this.empty()) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
	}

	public void removeFirst() {
		if (!this.empty()) {
			if (this.head == this.tail)
				this.head = this.tail = null;
			else
				this.head = this.head.next;
		}
	}

	public void printList() {
		Node trav = this.head;
		while (trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}
}

class LinkedList {
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.printList();
	}
}