import java.util.Scanner;
import java.util.UUID;
/*
You are required to write a Java program to manage bank accounts. The program
should be able to perform the following operations:
a. Create a new account
b. Deposit money into an account
c. Withdraw money from an account
d. Display the account balance
e. Display the account holder's information
Each account should have the following information:
a. Account holder's name (String)
b. Account number (int)
c. Account balance (double)
The program should be able to perform the following operations:
a. Create a new account: The program should prompt the user to enter the
account holder's name, and generate a unique account number for the new
account. The initial account balance should be zero.
b. Deposit money into an account: The program should prompt the user to enter
the account number and the amount to be deposited. If the account number is
valid, the program should add the amount to the account balance. If the
account number is not valid, the program should display an error message.
c. Withdraw money from an account: The program should prompt the user to
enter the account number and the amount to be withdrawn. If the account
number is valid and the account balance is sufficient, the program should
deduct the amount from the account balance. If the account number is not
valid or the account balance is insufficient, the program should display an
error message.
d. Display the account balance: The program should prompt the user to enter
the account number and display the current balance for that account. If the
account number is not valid, the program should display an error message.
e. Display the account holder's information: The program should prompt the
user to enter the account number and display the account holder's name and
current balance for that account. If the account number is not valid, the
program should display an error message.
 */
class Account {
	private String name;
	private long aadharNumber;
	private String address;
	private int age;
	private String accountNumber;
	private int amount;

	void setName(String name) {
		this.name = name;
	}

	void setAmount(int amount) {
		this.amount = amount;
	}

	void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return this.age;
	}

	String getName() {
		return this.name;
	}

	String getAddress() {
		return this.address;
	}

	long getAadharNumber() {
		return this.aadharNumber;
	}

	int getAmount() {
		return this.amount;
	}

	void setAccountNumber() {
		this.accountNumber = UUID.randomUUID().toString().substring(0, 6);
	}

	String getAccountNumber() {
		return this.accountNumber;
	}

	int depositAmount(int increaseAmount) {
		return increaseAmount + this.amount;
	}

	int withdrawAmount(int decreaseAmount) {
		return this.amount - decreaseAmount;
	}
}

class Assignment2_06 {

	static Scanner sc = new Scanner(System.in);
	
	static int operations() {

		System.out.println("\n1. Create a new Account");
		System.out.println("2. Deposit money into Acoount");
		System.out.println("3. Withdraw money from Account");
		System.out.println("4. Display the Account Balance");
		System.out.println("5. Display the account holder's information");
		System.out.println("0. Exit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	public static void main(String[] args) {

		int choice = 0;
		String act;
		Account ac = new Account();
		while((choice = Assignment2_06.operations()) != 0){
			switch(choice) {
				case 1:
							System.out.print("Enter Your Name: ");
							ac.setName(sc.nextLine());
							System.out.print("Enter Your Address: ");
							ac.setAddress(sc.nextLine());
							System.out.print("Enter Your Aadhar Number: ");
							ac.setAadharNumber(sc.nextLong());
							System.out.print("Enter Your Age: ");
							ac.setAge(sc.nextInt());
							ac.setAccountNumber();
							System.out.println("***Your Account Number is: " + ac.getAccountNumber());
							break;

				case 2:
							System.out.print("First Enter Account Number : ");
							act = sc.next();
							if((act.equals(ac.getAccountNumber()))) {
								System.out.print("Enter Amount to deposit: ");
								int depositAmount = sc.nextInt();
								int TotalAmount = ac.depositAmount(depositAmount);
								ac.setAmount(TotalAmount);
								System.out.println("Bank Balance after deposit: " + ac.getAmount());
							} else {
								System.out.println("***Invalid Account Number***");
							}
							break;

				case 3:
							System.out.print("First Enter Account Number : ");
							act = sc.next();
							if((act.equals(ac.getAccountNumber()))) {
								System.out.print("Enter Amount to withdraw: ");
								int withdrawAmount = sc.nextInt();
								int newAmount = ac.withdrawAmount(withdrawAmount);
								ac.setAmount(newAmount);
								System.out.println("Bank Balance before deposit: " + ac.getAmount());
							} else {
								System.out.println("***Invalid Account Number***");
							}
							break;

				case 4:
							System.out.print("First Enter Account Number : ");
							act = sc.next();
							if((act.equals(ac.getAccountNumber()))) {
								System.out.println("Account Balance : " + ac.getAmount());
							} else {
								System.out.println("***Invalid Account Number***");
							}
							break;

				case 5:
							System.out.print("First Enter Account Number : ");
							act = sc.next();
							if((act.equals(ac.getAccountNumber()))) {
								System.out.println("Account holder's information :");
								System.out.println("Name :" + ac.getName());
								System.out.println("Aadhar Number :" + ac.getAadharNumber());
								System.out.println("Age :" + ac.getAge());
								System.out.println("Address :" + ac.getAddress());
							} else {
								System.out.println("***Invalid Account Number***");
							}
							break;
			}
		}
	}
}