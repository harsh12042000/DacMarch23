import java.util.Scanner;
/*
You are required to write a Java program to implement a Toll Booth Bill Generator.
The program should be able to calculate the toll fee for each vehicle based on the
number of axles and the distance travelled. The program should also be able to
generate a bill for each vehicle.
Each vehicle should have the following information:
a. Vehicle type (String)
b. Number of axles (int)
c. Distance Information
Each toll booth should have the following information:
a. Distance travelled (double)
b. Toll Fee Calculation
The program should be able to calculate the toll fee for each vehicle based on the
following criteria:
a. Cars, vans, and buses pay a base rate of $0.25 per mile for each axle.
b. Trucks pay a base rate of $0.50 per mile for each axle.
The program should be able to generate a bill for each vehicle based on the following
criteria:
a. The bill should include the vehicle type, number of axles, distance travelled,
toll fee, and total amount due.
b. The total amount due should include a $2.00 processing fee.
c. The toll fee calculation and total amount due should not be accessible outside
of the class.
The program should have the following methods:
a. calculateTollFee(): A method to calculate the toll fee for a given vehicle based
on the number of axles and distance travelled.
b. generateBill(): A method to generate a bill for a given vehicle based on the toll
fee and total amount due.
c. showMenu(): A method to show the menu options for the user to input the
vehicle information.
The program should have the following fields:
a. vehicleType: A string field to store the type of vehicle.
b. numAxles: An integer field to store the number of axles.
c. distanceTraveled: A double field to store the distance traveled.
d. tollFee: A double field to store the calculated toll fee.
e. totalAmountDue: A double field to store the total amount due.
The program should show the following menu options:
a. Enter vehicle type (car, van, bus, or truck)
b. Enter number of axles
c. Enter distance travelled
d. Calculate toll fee
e. Generate bill
f. Exit
*/
class ToolBooth {
	private double distanceTraveled;
	private double tollFee;
	private String vehicleType;
 	private int numAxles;
	private double totalAmountDue;

	void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	void setNumAxles(int numAxles) {
		this.numAxles = numAxles;
	}

	void setDistanceTravelled(double distanceTraveled) {
		this.distanceTraveled = distanceTraveled;
	}

	double calculateTollFee() {

		if(this.vehicleType.equalsIgnoreCase("truck")) {
			this.tollFee = 0.5 * this.numAxles * this.distanceTraveled;
		} else if(this.vehicleType.equalsIgnoreCase("car") || this.vehicleType.equalsIgnoreCase("van") || this.vehicleType.equalsIgnoreCase("bus")) {
			this.tollFee = 0.25 * this.numAxles * this.distanceTraveled;
		}
		return this.tollFee;
	}

	void generateBill() {
		System.out.println("Vehicle Type : " + this.vehicleType);
		System.out.println("Number of Axles : " + this.numAxles);
		System.out.println("Distance Travelled : " + this.distanceTraveled);
		System.out.println("Toll Fee : " + this.tollFee);
		this.totalAmountDue = this.tollFee + 2;
		System.out.println("Total amount due : " + this.totalAmountDue + " (Toll Fee + $2 Processing Fees)");
	}
}

class Assignment2_07 {

	static Scanner sc = new Scanner(System.in);

		static char showMenu() {
			System.out.println("a. Enter Vehicle details");
			System.out.println("b. Calculate toll fee");
			System.out.println("c. Generate bill");
			System.out.println("d. Exit");
			System.out.print("Enter Choice: ");
			char choice = sc.next().charAt(0);
			sc.nextLine();
			return choice;
		}
    public static void main(String[] args) {

			char choice = ' ';
			ToolBooth tb = new ToolBooth();
			while((choice = Assignment2_07.showMenu()) != 'd') {
				switch(choice) {
					case 'a':
							System.out.print("Enter Vehicle Type (car, van, bus, truck) : ");
							tb.setVehicleType(sc.nextLine());
							System.out.print("Enter number of axles : ");
							tb.setNumAxles(sc.nextInt());
							System.out.print("Enter distance travelled : ");
							tb.setDistanceTravelled(sc.nextDouble());
							break;
									
					case 'b':
							System.out.println("Toll Fee: " + tb.calculateTollFee());
							break;

					case 'c':
							System.out.println("Generate Bill: ");
							tb.generateBill();
							break;
				}
			}
		}
}
