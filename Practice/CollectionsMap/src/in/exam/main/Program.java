package in.exam.main;
import in.exam.domain.*;
import in.exam.operations.BankOperations;
import in.exam.utils.Validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

enum Menu {
	EXIT, ADDACOUNT, DISPLAYALL, REMOVE, WITHDRAW, DEPOSIT, TRANSFER, SEARCH;
}


public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	private static void addTestRecords(ArrayList<Customer> customer, ArrayList<Account> account, BankOperations opr) {
		Customer cust[] = new Customer[2];
		cust[0] = new Customer("Harshada", 883071170, 5000.60, "harshadas2000@gmail.com");
		customer.add(cust[0]);
		cust[1] = new Customer("Sayli", 995214170, 400.60, "sayli12@gmail.com");
		customer.add(cust[1]);
		
		Account act[] = new Account[2];
		act[0] = new Account("12345", 4210, "8852144113");
		account.add(act[0]);
		act[1] = new Account("76890", 1420, "5521033301");
		account.add(act[1]);
		
		opr.addAccount(customer, account);
	}
	
	//Accept Record from user and validate input fields
	private static ArrayList<Customer> acceptCustomerRecord(ArrayList<Customer> customerList) {

		Customer customer = new Customer();
		System.out.print("Enter Name : 	");
		sc.nextLine();
		customer.setName(sc.nextLine());
		
		while(true) {
			System.out.print("Enter Email : 	");
			String email = sc.nextLine();
			
			if(Validator.validateEmail(email)) {
				customer.setEmail(email);
				break;
			} else {
				System.out.println("Invalid Email !");
			}
		}
		
		while(true) {
			System.out.print("Enter Mobile Number : 	");
			long mobileNumber = sc.nextLong();
			
			if(Validator.validatePhoneNumber(Long.toString(mobileNumber))) {
				customer.setMobileNumber(mobileNumber);
				break;
			} else {
				System.out.println("Invalid Mobile Number !");
			}
		}
		
		customerList.add(customer);
		return customerList;
	}
	
	private static ArrayList<Account> acceptAccountRecord(ArrayList<Account> accountList) {
		Account account = new Account();
		System.out.print("Enter IFSC : 	");
		account.setiFSC(sc.nextInt());
		System.out.print("Enter Aadhar Number : 	");
		sc.nextLine();
		String aadhar = sc.nextLine().trim();
		account.setAadharNumber(aadhar);
		account.setAccountNumber(aadhar.substring(aadhar.length() - 6));
		System.out.println("\nAccount Successfully Created ! Account Number is : " + account.getAccountNumber() + "\n"); 
		accountList.add(account);
		return accountList;
	}
	
	private static void printRecord(boolean status) {
		if(status)
			System.out.println("\nRecord Removed !\n");
		else
			System.out.println("\nRecord Not Found !\n");
	}
	
	private static void printRecord(Customer value) {
		if(value == null)
			System.out.println("Not Found !");
		else 
			System.out.println(value);
	}

	private static Menu menuList() {
		System.out.println("\n0. Exit");
		System.out.println("1. Add Account");
		System.out.println("2. Display");
		System.out.println("3. Remove");
		System.out.println("4. Withdraw");
		System.out.println("5. Deposit");
		System.out.println("6. Transfer");
		System.out.println("7. Search");
		System.out.print("Enter Choice  :	");
		int choice = sc.nextInt();
		return Menu.values()[choice];
	}

	public static void main(String[] args) {
		
		Menu menu;
		ArrayList<Customer> customer = new ArrayList<>();
		ArrayList<Account> account = new ArrayList<>();
//		BankOperations operations = new BankOperations(new TreeMap<>());
//		BankOperations operations = new BankOperations(new HashMap<>());
		BankOperations operations = new BankOperations(new LinkedHashMap<>());
		Program.addTestRecords(customer, account, operations);
		
		String actNum = null;

		while((menu = Program.menuList()) != Menu.EXIT) {
			switch(menu) {
				case ADDACOUNT:
					operations.addAccount(Program.acceptCustomerRecord(customer), Program.acceptAccountRecord(account));
					break;
				
				case DISPLAYALL:
					operations.displayAccount();
					break;
					
				case REMOVE:
					System.out.print("Enter Account Number : ");
					sc.nextLine();
					actNum = sc.nextLine();
					boolean status = operations.removeAccount(actNum);
					Program.printRecord(status);
					break;
					
				case WITHDRAW:
					System.out.print("Enter Account Number : ");
					sc.nextLine();
					actNum = sc.nextLine();
					System.out.print("Enter Amount to Withdraw : ");
					double price = sc.nextDouble();
					operations.withdrawMoney(actNum, price);
					break;
					
				case SEARCH:
					System.out.print("Enter Account Number : ");
					sc.nextLine();
					actNum = sc.nextLine();
					Customer value = operations.findRecord(actNum);
					Program.printRecord(value);
					break;
					
			}
		}
	}
}
