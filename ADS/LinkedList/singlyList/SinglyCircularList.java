package singlyList;
import java.util.Scanner;

import singlyList.SinglyList.Node;

class List {
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	static class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		
		if(isEmpty())
			return;  
		
		Node trav = head;
		
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}while(trav != head);
	}
	
	public void addLast(int data) {
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			Node trav = head;
			
			while(trav.next != head)
				trav = trav.next;
			
			newNode.next = head;
			trav.next = newNode;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);	
		
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			Node trav = head;
			
			while(trav.next != head)
				trav = trav.next;
			
			newNode.next = head;
			trav.next = newNode;
			
			//make head to newNode;
			head = newNode;
		}
	}

	public void addAtPos(int value, int pos) {
		Node newNode = new Node(value);
		int count = 0;
		if(head == null || pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			while(trav.next != head) {
				count++;
				if(count == pos-1) 
					break;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void delFirst() {
		
		if(isEmpty())
			throw new RuntimeException("List is empty.");
		
		if(head.next == head) {
			head = null;
		} else {
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			head = head.next;
			trav.next = head;
		}
	}

	public void delAtPos(int pos) {
			
			//if pos = 1, delete first node
			if(pos == 1)
				delFirst();
			
			//if list is empty or pos < 1 then throw exception
			if(head == null || pos < 1)
				throw new RuntimeException("List is empty or Invalid position");
			
			//take temp pointer traversing behind trav
			Node temp = null, trav = head;
			
			//traverse till pos (trav)
			for(int i=1;i<pos;i++) {
				//if pos id beyond list length throw exception
				if(trav.next == head)
					throw new RuntimeException("Invalid position");
				temp = trav;
				trav = trav.next;
			}
			
			//trav is node to be deleted & temp is node before that
			temp.next = trav.next;
		}
	
	public void delAll() {
		head = null;
	}

	public void delLast() {
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		if(head.next == head)
			head = null;
		else {
			Node trav = head;
			Node temp = null;
			
			while(trav.next != head) {
				temp = trav;
				trav = trav.next;
			}
			temp.next = head;
		}
		
	}
		
}

public class SinglyCircularList {
	
	public static Scanner sc = new Scanner(System.in);

	public static int menuList() {
		System.out.println("\n0.Exit\n1.Display\n2.Add First\n3.Add Last\n4.Add at Pos\n5.Del First\n6.Del Last\n7.Del all\n8.Del at pos");
		System.out.print("Enter Choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int ch = 0, pos = 0;
		List list = new List();
		
		while((ch = SinglyCircularList.menuList()) != 0) {
			switch (ch) {
			case 1:
				list.display();
				break;
			case 2:
				System.out.print("Enter value to add at first : ");
				list.addFirst(sc.nextInt());
				break;
			case 3:
				System.out.print("Enter value to add at last : ");
				list.addLast(sc.nextInt());
				break;
			case 4:
				System.out.print("Enter Position : ");
				pos = sc.nextInt();
				System.out.print("Enter value : ");
				list.addAtPos(sc.nextInt(),pos);
				break;
			case 5:
				try {
					list.delFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				try {
					list.delLast();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 7:
				list.delAll();
				break;
			case 8:
				System.out.print("Enter pos : ");
				try {
					list.delAtPos(sc.nextInt());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
					
			default:
				break;
			}
		}
		
	}
}