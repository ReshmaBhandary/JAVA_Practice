package com.immutable;

import java.util.Date;

import com.serializable.Address;

public class TempAccount  extends Account{
	private String city;
	

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public TempAccount(Date dob, Address address, String accountName, int accountNumber,String city) {
		super(dob, address, accountName, accountNumber);
		this.city=city;
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "TempAccount [city=" + city + ", getAccountName()=" + getAccountName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getDob()=" + getDob() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
