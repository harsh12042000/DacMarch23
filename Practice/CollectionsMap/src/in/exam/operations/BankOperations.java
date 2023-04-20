package in.exam.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import in.exam.domain.Account;
import in.exam.domain.Customer;

interface Operations {
	public void addAccount(ArrayList<Customer> customer, ArrayList<Account> account);
	public void displayAccount();
	public boolean removeAccount(String accountNumber);
}

public class BankOperations implements Operations{
	
	private Map<Account, Customer> map;

	public BankOperations(Map hashMap) {
		this.map = hashMap;
	}

	@Override
	public void addAccount(ArrayList<Customer> customer, ArrayList<Account> account) {
		Object[] cust = customer.toArray();
		Object[] act = account.toArray();
		
		if(this.map != null) {
			for(int i=0;i<act.length;i++) {
				Account key = (Account) act[i];
				Customer value = (Customer) cust[i];
				
				this.map.put(key, value);
			}
		}
	}

	@Override
	public void displayAccount() {
		if(this.map != null) {
		   Set<Entry<Account, Customer>> entries = this.map.entrySet();
		   for(Entry<Account, Customer> entry : entries) {
			   Account key = entry.getKey();
			   Customer value = entry.getValue();
			   System.out.println(key + "    " + value);
		   }
		}
	}

	@Override
	public boolean removeAccount(String accountNumber) {
		if(this.map != null) {
			Account key = new Account();
			key.setAccountNumber(accountNumber);
			if(this.map.containsKey(key)) {
				this.map.remove(key);
				return true;
			}
		}
		return false;
	}

	public void withdrawMoney(String actNumber, double price) {
	    Account actNum = new Account();
	    actNum.setAccountNumber(actNumber);

	    if (this.map.containsKey(actNum)) {
	        Iterator<Map.Entry<Account, Customer>> iterator = this.map.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<Account, Customer> entry = iterator.next();
	            if (entry.getKey().equals(actNum)) {
	                Customer updatedBalance = entry.getValue();
	                updatedBalance.setBalance(updatedBalance.getBalance() - price);

	                iterator.remove(); // Remove the old key-value pair

	                this.map.put(actNum, updatedBalance); // Add the new key-value pair with the updated value
	                return; // Exit the loop once the key has been found and updated
	            }
	        }
	    }
	}

	public Customer findRecord(String actNum) {
		if(this.map != null) {
			Account key = new Account();
			key.setAccountNumber(actNum);
			if(this.map.containsKey(key)) {
				Customer value = this.map.get(key);
				return value;
			}
		}
		return null;
	}
}
