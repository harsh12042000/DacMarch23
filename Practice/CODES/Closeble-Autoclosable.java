package org.example.main;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

//class Test implements Closeable{
class Test implements AutoCloseable{
	private Scanner sc;
	public Test() {
		this.sc = new Scanner(System.in);
	}
	
	@Override
	public void close() throws Exception {
		this.sc.close();
	}
	
}
public class Program {
	public static void main(String[] args) {
		try {
			Test t = new Test();
			
			t.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
