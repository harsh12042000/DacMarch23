import java.util.Scanner;

/*
You are required to write a Java program to calculate the telephone bill for a given
customer based on their usage. The program should take the following inputs from
the user:
a. Customer name
b. Phone number
c. Number of calls made
d. Duration of calls (in minutes)
The program should then calculate the bill for the customerbased on the following
criteria:
a. The first 100 calls are charged at a rate of 50 cents per call.
b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
c. All calls are subject to a minimum duration of 1 minute.
d. Calls with a duration less than 1 minute are rounded up to 1 minute.
e. There is a flat rate of $10 per month for all customers.
 */
class TelephoneBill {

	private String customerName;
	private long phoneNumber;
	private int numberofCalls;
	private double callDuration;

	TelephoneBill(String customerName, long phoneNumber, int numberofCalls, double callDuration) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.numberofCalls = numberofCalls;
		this.callDuration = callDuration;
	}

	double calculateBill() {

		double totalBill = 0.0;

		if(this.numberofCalls <= 100) {
			totalBill = (50*this.numberofCalls)/100;
		} else if(this.numberofCalls > 100) {
			totalBill = (50*this.numberofCalls)/100 + (25*(this.numberofCalls-100))/100;
		}

		return totalBill+10;
	}

}
class Assignment2_05 {
    public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Customer Name: ");
			String customerName = sc.nextLine();
			System.out.print("Enter Customer Phone Number(10 digit) : ");
			long phoneNumber = sc.nextLong();
			System.out.print("Enter Number of Total Calls : ");
			int numberofCalls = sc.nextInt();
			System.out.print("Enter Call Duration (in minutes) : ");
			double callDuration = sc.nextDouble();

			TelephoneBill ebill = new TelephoneBill(customerName, phoneNumber, numberofCalls, callDuration); 
			System.out.println("Total Bill : " + ebill.calculateBill());;
		}
}
