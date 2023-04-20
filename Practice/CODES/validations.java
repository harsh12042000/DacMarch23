package org.example.main;

import java.util.Scanner;

class Validator{
	public static final String NAME_PATTERN= "^[A-Za-z]+(\\s[A-Za-z]+)*$";
	public static boolean validateName( String name ) {
		return name.matches(NAME_PATTERN);
	}
	public static final String EMAIL_PATTERN= "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	public static boolean validateEmail( String email ) {
		return email.matches(EMAIL_PATTERN);
	}
	public static final String PHONE_NUMBER_PATTERN= "^\\d{10}$";
	public static boolean validatePhoneNumber( String phoneNumber ) {
		return phoneNumber.matches(PHONE_NUMBER_PATTERN);
	}
}
public class Program {
	public static void main(String[] args) {
		try( Scanner sc = new Scanner(System.in)){
			System.out.print("Enter email	:	");
			String email = sc.nextLine();
			if( Validator.validateEmail(email))
				System.out.println("Email	:	"+email);
			else
				System.out.println("Invalid email");
		}
	}
}
