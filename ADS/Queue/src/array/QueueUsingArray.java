package array;
import java.util.Scanner;

class LinearQueue {
	private int[] arr;
	private int rear, front;
	
	public LinearQueue(int size) {
		arr = new int[size];
		rear = -1;
		front = -1;
	}
	
	public boolean isFull() {
		return rear == arr.length - 1;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
	
	public void push(int data) {
		if(isFull()) 
			throw new RuntimeException("Queue is full");
		rear++;
		arr[rear] = data;
	}
	
	public void pop() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
		front++;
	}
	
	public int peek() {
		if(isEmpty())
			throw new RuntimeException("Queue is Empty");
		return arr[front+1];
	}
}


public class QueueUsingArray {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int menuList() {
		System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\nEnter choice: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		
		int choice, val;
		
		LinearQueue q = new LinearQueue(6);
		
		while((choice = menuList()) != 0) {
			switch(choice) {
			case 1:
				try {
					System.out.print("Enter value to push: ");
					val = sc.nextInt();
					q.push(val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			
			case 2:
				try {
					val = q.peek();
					q.pop();
					System.out.println("Popped: " + val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 3:
				try {
					val = q.peek();
					System.out.println("Peek : " + val);
				} catch(Exception  e) {
					System.out.println(e.getMessage());
				}
				
			}
		}
	}

}
