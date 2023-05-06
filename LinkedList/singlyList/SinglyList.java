package singlyList;

public class SinglyList {
	
	private Node head;
	
	public SinglyList() {
		this.head = null;
	}
	
	//Node is static member class of singly list
	static class Node {
		private int data;
		private Node next;
		
		public Node() {
			this.data = 0;
			this.next = null;
		}
		
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	
	void display() {
		System.out.println("List :");
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	void addLast(int value) {
		Node newNode = new Node(value);
		
		//if list is empty make new node as 1st node of list
		if(head == null)
			head = newNode;
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
		}
	}

	public void addAtPos(int value, int pos) {
		Node newNode = new Node(value);
		int count = 0;
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
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void delFirst() {
		if(head != null)
			head = head.next;
		else
			throw new RuntimeException("List is empty.");
	}

	public void delAll() {
		head = null;	
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
			if(trav == null)
				throw new RuntimeException("Invalid position");
			temp = trav;
			trav = trav.next;
		}
		
		//trav is node to be deleted & temp is node before that
		temp.next = trav.next;
	}

	public void delLast() {
		
		if(head == null) 
			throw new RuntimeException("List is empty");
		
		if(head.next == null)
			head = null;
		else {
			Node trav = head;
			Node temp = trav.next;
			temp = temp.next;
	
			while(trav != null) {
				if(temp == null) {
					trav.next = null;
					break;
				}
				trav = trav.next;
				temp = temp.next;
			}
		}
	}

	public void reverse() {
		Node oldHead = head;
		head = null;
		Node temp;
		while(oldHead != null) {
			temp = oldHead;
			oldHead = oldHead.next;
			temp.next = head;
			head = temp;
		}
		
		display();
	}

	public void recRev() {
		if(head != null) {
			recRev(head);
			display();
		}
	}

	private Node recRev(Node h) {
		
		if(h.next == null) {
			head = h;
			return h;
		}
		
		Node t = recRev(h.next);
		t.next = h;
		h.next = null;
		return h;
	}

	public void revDisplay() {
		revDisplay(head);
	}

	private void revDisplay(Node h) {
		if(h == null)
			return;
		
		revDisplay(h.next);
		System.out.print(h.data + " ");
	}
	
	public void middle() {
		Node trav = head;
		Node temp = head;
		while(trav.next != null) {
			trav = trav.next.next;
			temp = temp.next;
		}
		System.out.println("Middle element : " + temp.data);
	}
}