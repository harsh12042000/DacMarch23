import java.util.Scanner;

/*
Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)
Create a constructor that initializes the customerName and unitsConsumed instance
variables.
Define a method named "calculateBillAmount" that calculates the bill amount based
on the number of units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit
Implement the "calculateBillAmount" method in the "ElectricityBill" class.
Define a main method that creates an object of the "ElectricityBill" class and sets the
customerName and unitsConsumed instance variables. Then, call the
"calculateBillAmount" method to calculate the bill amount and display the
customerName, unitsConsumed, and billAmount 
*/
class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    ElectricityBill(String customerName2, long phoneNumber, int numberofCalls) {
        this.customerName = "";
        this.unitsConsumed = 0;
    }

    public ElectricityBill() {
    }

    void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    String getCustomerName() {
        return this.customerName;
    }

    double getUnitsConsumed() {
        return this.unitsConsumed;
    }

    double calculateBillAmount() {
        
        if(this.unitsConsumed <= 100) {
            this.billAmount = 100 * 5;
        } else if(this.unitsConsumed <= 200) {
            this.billAmount = (100 * 5) + ((this.unitsConsumed - 100) * 7);
        } else {
            this.billAmount = (100 * 5) + (200 * 7) + (this.unitsConsumed * 10);
        }
        return this.billAmount;
    }
}
class Assignment2_04 {
    public static void main(String[] args) {

        ElectricityBill eb = new ElectricityBill();
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter Customer Name : ");
        eb.setCustomerName(sc.nextLine());
        System.out.print("Enter Units Consumed : ");
        eb.setUnitsConsumed(sc.nextDouble());

        System.out.println("\nCustomer Name : " + eb.getCustomerName());
        System.out.println("Units Cunsumed : " + eb.getUnitsConsumed());
        System.out.println("Bill Amount : " + eb.calculateBillAmount());
    }    
}
