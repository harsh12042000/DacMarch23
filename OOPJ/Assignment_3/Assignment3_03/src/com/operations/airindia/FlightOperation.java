package com.operations.airindia;
import java.util.Scanner;

import com.airindia.Fight;

public class FlightOperation {
	
	private int index;
	private User arr[];
	private static Scanner sc = new Scanner(System.in);
	
	public FlightOperation(int size) {
		this.arr = new User[size];
	}

	public void addUserDetails(User user) {
		if(index < this.arr.length) {
			arr[index] = user;
			index++;
		} else {
			System.out.println("Sorry ! Registration is full");
		}
	}

	public void displayDetails(int id) {
		for(int i=0;i<arr.length;i++) {
			if(this.arr[i] != null && this.arr[i].getId() == id) {
				System.out.println("NAME :  " + this.arr[i].getName());
				System.out.println("EMAIL ID :  " + this.arr[i].getEmail());
				System.out.println("CONTACT NUMBER :  " + this.arr[i].getNumber());
				System.out.println("FLIGHT NUMBER :  " + this.arr[i].getFlightNo());
				System.out.println("BOOLED SEATS :  " + this.arr[i].getBookedSeats());
			}
		}
	}

	public void addFlight(int id) {
		for(int i=0;i<this.arr.length;i++) {
			if(this.arr[i] != null && this.arr[i].getId() == id) {
				int flightArray[] = Fight.getFlightArray();
				System.out.print("\nFlight Number : ");
				int userFlight = sc.nextInt();
				
				for(int j=0;j<flightArray.length;j++) {
					if(userFlight == j) {
						this.arr[i].setFlightNo(userFlight);
						System.out.print("Enter how many seats you want to book : ");
						int seats = sc.nextInt();
						if(seats <= flightArray[j]) {
							this.arr[i].setBookedSeats(seats);
							flightArray[j] = flightArray[j] - seats;
						}
					}
				}
			}
		}
	}

	public void updateFlight(int id) {
		for(int i=0;i<this.arr.length;i++) {
			if(this.arr[i] != null && this.arr[i].getId() == id) {
				int flightArray[] = Fight.getFlightArray();
				System.out.print("\nEnter previously booked Flight Number : ");
				int userFlight = sc.nextInt();
				
				for(int j=0;j<flightArray.length;j++) {
					if(userFlight == j) {
						System.out.print("Your previous bookinfs will be erased. Enter how many seats you want to book now : ");
						int seats = sc.nextInt();

						flightArray[j] = flightArray[j] + this.arr[i].getBookedSeats() ;
						if(seats <= flightArray[j]) {
							this.arr[i].setBookedSeats(seats);
							flightArray[j] = flightArray[j] - seats ;
						}
					}
				}
			}
		}
	}

	public void cancelFlight(int id) {
		for(int i=0;i<this.arr.length;i++) {
			if(this.arr[i] != null && this.arr[i].getId() == id) {
				int flightArray[] = Fight.getFlightArray();
				
				int flightNumber = this.arr[i].getFlightNo();
				int seats = this.arr[i].getBookedSeats();
				
				this.arr[i].setFlightNo(0);
				this.arr[i].setBookedSeats(0);
				
				for(int j=0;j<flightArray.length;j++) {
					if(flightNumber == j) {
						flightArray[j] = flightArray[i] + seats;
					}
				}
			}
		}
	}
}
