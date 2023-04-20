package in.exam.domain;

public class Customer {

	private String name;
	private long mobileNumber;
	private double balance;
	private String email;
	
	public Customer() {
		//TODO
	}
	public Customer(String name, long mobileNumber, double balance, String email) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.balance = balance;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobileNumber=" + mobileNumber + ", balance=" + balance + ", email=" + email
				+ "]";
	}
}