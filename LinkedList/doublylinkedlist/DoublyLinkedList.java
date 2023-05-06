package doublylinkedlist;

import java.util.Scanner;
import singlyList.SinglyCircularList;

class List {
	
	private Node head;
	
	static class Node {
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	private boolean isEmpty() {
		return head == null;
	}
	
	public void displayForward() {
		System.out.println("Display Forward : ");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
	}
	
	public void displayReversed() {
		System.out.println("\nDisplay Reversed : ");
		
		if(isEmpty())
			return;
		
		Node trav = head;
		while(trav.next != null) {
			trav = trav.next;
		}
		
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.prev;
		}
	}

	public void addLast(int data) {
		Node newNode = new  Node(data);
		
		if(head == null)
			head = newNode;
		else {
			Node trav = head;
			while(trav.next != null) 
				trav = trav.next;
			
			trav.next = newNode;
			newNode.prev = trav;
		}
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty())
			head = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;	
		}
	}

	public void addAtPos(int value, int pos) {
		Node newNode = new Node(value);
		int count = 0;
		Node temp;
		if(head == null || pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			while(trav.next != null) {
				count++;
				if(count == pos-1) 
					break;
				trav = trav.next;
			}
			temp = trav.next;
			newNode.next = temp;
			newNode.prev = trav;
			trav.next = newNode;
			if(temp != null)
				temp.prev = newNode;
		} 
	}

	public void delFirst() {
		if(head == null)
			throw new RuntimeException("List is empty");
		
		if(head.next == null)
			head = null;
		else {
			head = head.next;
			head.prev = null;	
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
		Node trav = head;
		
		//traverse till pos (trav)
		for(int i=1;i<pos;i++) {
			//if pos id beyond list length throw exception
			if(trav == null)
				throw new RuntimeException("Invalid position");

			trav = trav.next;
		}
		
		trav.prev.next = trav.next;
		
		if(trav.next != null)
			trav.next.prev = trav.prev;
	}
}

public class DoublyLinkedList {
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
				list.displayForward();
				list.displayReversed();
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
////			case 6:
////				try {
////					list.delLast();
////				} catch (Exception e) {
////					System.out.println(e.getMessage());
////				}
////				break;
//			case 7:
//				list.delAll();
//				break;
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