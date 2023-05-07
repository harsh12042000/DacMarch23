package array;

import java.util.Scanner;

class Stack {
	private int[] arr;
	private int top;
	
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public void push(int val) {
		if(isFull())
			throw new RuntimeException("Stack is full.");
		top++;
		arr[top] = val;
	}
	
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Stack is empty.");
		top--;
	}
	
	public int peek() {
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == arr.length-1;
	}
}

public class StackUsingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(6);
		int choice;
		
		do {
			System.out.print("\n0.Exit\n1.Push\n2.Pop\n3.Peek\nEnter Choice :");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				try {
					System.out.print("\nEnter Element : ");
					s.push(sc.nextInt());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 2:
				try {
					System.out.println("\nPopped : " + s.peek());
					s.pop();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				try {
					System.out.println("\nPeek : " + s.peek());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			
		} while(choice != 0);
		sc.close();
	}

}
