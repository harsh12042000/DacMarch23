package org.example.collection;

import org.example.exception.StackOverflowException;
import org.example.exception.StackUnderflowException;

public class Stack {
	private int top = -1;
	private int[] arr;
	public Stack() {
		this( 5 );
	}
	public Stack( int size ) {
		this.arr = new int[ size ];
	}
	public boolean empty( ) {
		return this.top == -1;
	}
	public boolean full( ) {
		return this.top == this.arr.length - 1;
	}
	public void push( int element ) throws StackOverflowException {
		if( this.full() )
			throw new StackOverflowException("Stack is full");
		this.top = this.top + 1;
		this.arr[ this.top ] = element;
	}
	public int peek( ) throws StackUnderflowException {
		if( this.empty() )
			throw new StackUnderflowException("Stack is empty");
		return this.arr[ this.top ]; 
	}
	public void pop( ) throws StackUnderflowException {
		if( this.empty() )
			throw new StackUnderflowException("Stack is empty");
		this.top = this.top - 1;
	}
	
}


package org.example.exception;

@SuppressWarnings("serial")
public class StackOverflowException extends Exception{
	public StackOverflowException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
package org.example.exception;

@SuppressWarnings("serial")
public class StackUnderflowException extends Exception {
	public StackUnderflowException(String message) {
		super(message);
	}
}
package org.example.main;

import java.util.Scanner;

import org.example.collection.Stack;
import org.example.exception.StackOverflowException;
import org.example.exception.StackUnderflowException;

public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static void acceptRecord( int[] element ) {
		if( element != null ) {
			System.out.print("Enter element	:	");
			element[ 0 ] = sc.nextInt();
		}
	}
	public static void printRecord( int[] element ) {
		if( element != null ) 
			System.out.println("Popped element is	:	"+element[ 0 ]);
	}
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Push");
		System.out.println("2.Pop");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] element = new int[ 1 ];
		Stack stack = new Stack( 5 );
		while( ( choice = Program.menuList( ) ) != 0 ) {
			try {
				switch( choice ) {
				case 1:
					Program.acceptRecord(element);
					stack.push(element[ 0 ] );
					break;
				case 2:
					element[ 0 ] = stack.peek();
					Program.printRecord(element);
					stack.pop();
					break;
				}
			} catch (StackOverflowException | StackUnderflowException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}
