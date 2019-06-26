package com.serializable;

import java.io.Serializable;

public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1833733068552459399L;
	
	private  String accountName ;
	private  int accountNumber ;
	private  int accountNumber1 ;
	private static int id=13;
	private transient String name="reshma";
			
	
	//private Type type;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Account.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}*/
	public int getAccountNumber1() {
		return accountNumber1;
	}
	public void setAccountNumber1(int accountNumber1) {
		this.accountNumber1 = accountNumber1;
	}
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Account(String accountName, int accountNumber,Type type) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		//this.type=type;
	}

	

}
