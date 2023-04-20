package org.example.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
	public static void f3( ) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number	:	");
		int number = Integer.parseInt(reader.readLine());	//"abc123"
		System.out.println("Number	:	"+number);
	}
	public static void f2( ) throws IOException {
		Program.f3();	
	}
	public static void f1( ) throws IOException {
			Program.f2();	
	}
	public static void main(String[] args) {
		try {
			Program.f1();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
