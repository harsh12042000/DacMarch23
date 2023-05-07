package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Stack {
	private List<Integer> elements = new ArrayList<>();
	
	public void push(int data) {
		elements.add(data);
	}
	
	public int pop() {
		if(elements.isEmpty())
			return 0;
		
		int top = elements.get(elements.size() - 1);
		elements.remove(elements.size() - 1);
		return top;
	}
	
	public int peek() {
		if(elements.isEmpty())
			return 0;
		
		return elements.get(elements.size() - 1);
	}
	
	public int size() {
		return elements.size();
	}

}

public class Arraylist {

	public static void main(String[] args) {
		Stack list = new Stack();
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
//		list.displayStack();
		System.out.println("Stack size : " + list.size());
		
		System.out.println();
		System.out.println("Popped : " + list.pop());
		System.out.println("Popped : " + list.pop());
//		list.displayStack();
		System.out.println("Stack size : " + list.size());
		
		System.out.println();
		System.out.println("Peek : " + list.peek());
	}

}
