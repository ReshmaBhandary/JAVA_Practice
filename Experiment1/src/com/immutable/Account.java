package com.immutable;

import java.util.Date;

import com.serializable.Address;

public  class Account {
	private final Date dob;
//	private final Address address ;
	private final String accountName ;
	private final int accountNumber ;

	public String getAccountName() {
		return accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	/*public Address getAddress() {
		Address addr = new Address();
		addr.setCcity(this.address.getCcity());
		addr.setState(this.address.getState());
		return addr;
	}
*/
	public Date getDob() {
		return new Date(dob.getTime());
	}

	public Account(Date dob, Address address, String accountName, int accountNumber) {

		this.dob = new Date(dob.getTime());
		this.accountName = accountName;
		this.accountNumber = accountNumber;
//		Address addr = new Address();
//		addr.setCcity(address.getCcity());
//		addr.setState(address.getState());
//		this.address=addr;
	
	}

	@Override
	public String toString() {
		return "Account [dob=" + dob + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + "]";
	}
	

}
