package com.airindia;
import java.util.Scanner;

import com.operations.airindia.FlightOperation;
import com.operations.airindia.User;

enum Menu {
	EXIT, ADDUSER, FLIGHTLIST, ADDFLIGHT, UPDATEFLIGHT, VIEWRESERVATION, CANCELFLIGHT 
}

public class Fight {

	static Scanner sc = new Scanner(System.in);
	private static int flightArray[] = new int[]{10,55,74,65,41,11,25};
	
	private static void userRegistration(User user) {
		System.out.print("Name : ");
		sc.nextLine();
		user.setName(sc.nextLine());
		System.out.print("Email : ");
		user.setEmail(sc.nextLine());
		System.out.print("Contact Number : ");
		long num = sc.nextLong();
		user.setNumber(num);

		String numberString = Long.toString(num);
		String firstThreeDigits = numberString.substring(0, 3);
		String s = "09"+firstThreeDigits+"4";
		int result = Integer.parseInt(s);
		user.setId(result);
		System.out.println("Registered Successfully Save Account ID for future use **Account ID** :  " + user.getId());
	}
	
	public static int[] getFlightArray() {
		return flightArray;
	}
	
	private static void displayFlightDetails() {
		for(int i=0;i<flightArray.length;i++) {
			System.out.println("Flight Number : " + i + "	Available Seats : " + flightArray[i]);
		}
	}
	
	private static Menu menuList() {
		System.out.println("\n1. User Registration");
		System.out.println("2. Check Available Flights");
		System.out.println("3. Book Your Flight");
		System.out.println("4. Update Your Bookings");
		System.out.println("5. View Your Reservation");
		System.out.println("6. Cancel Reservation");
		System.out.println("0. Exit");
		System.out.print("Enter Choice :	");
		int choice = sc.nextInt();
		return Menu.values()[choice];
	}
	
	public static void main(String[] args) {
		
		Menu choice;
		FlightOperation fo = new FlightOperation(10);
		while((choice = Fight.menuList()) != Menu.EXIT) {
			switch(choice) {
				case ADDUSER:
					User user = new User();
					System.out.println("Enter Following Details");
					Fight.userRegistration(user);
					fo.addUserDetails(user);
					break;
					
				case VIEWRESERVATION:
					System.out.print("\nEnter Account ID to display your information : ");
					fo.displayDetails(sc.nextInt());
					break;
				
				case FLIGHTLIST:
					Fight.displayFlightDetails();
					break;
					
				case ADDFLIGHT:
					System.out.println("\nEnter Account ID : ");
					fo.addFlight(sc.nextInt());
					break;
					
				case UPDATEFLIGHT:
					System.out.println("\nEnter Account ID : ");
					fo.updateFlight(sc.nextInt());
					break;
					
				case CANCELFLIGHT:
					System.out.println("\nEnter Account ID : ");
					fo.cancelFlight(sc.nextInt());
					break;
			}
		}
	}
}

