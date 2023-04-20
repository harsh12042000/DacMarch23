package in.exam.domain;

import java.util.Objects;

public class Account implements Comparable<Account>{

	private String accountNumber;
	private int iFSC;
	private String aadharNumber;
	public Account() {
		//TODO
	}
	public Account(String accountNumber, int iFSC, String aadharNumber) {
		this.accountNumber = accountNumber;
		this.iFSC = iFSC;
		this.aadharNumber = aadharNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getiFSC() {
		return iFSC;
	}
	public void setiFSC(int iFSC) {
		this.iFSC = iFSC;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", iFSC=" + iFSC + ", aadharNumber=" + aadharNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNumber, other.accountNumber);
	}
	@Override
	public int compareTo(Account o) {
		return this.accountNumber.compareTo(o.accountNumber);
	}
	
}