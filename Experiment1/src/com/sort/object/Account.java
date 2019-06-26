package com.sort.object;

public class Account  implements Comparable<Account>{
	private String accountName;
	private String accountType;
	private int accountMoney;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountMoney() {
		return accountMoney;
	}
	public void setAccountMoney(int accountMoney) {
		this.accountMoney = accountMoney;
	}
	public Account(String accountName, String accountType, int accountMoney) {
		super();
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountMoney = accountMoney;
	}
	@Override
	public int compareTo(Account o) {
		
		return this.accountMoney-o.accountMoney;
	}
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountType=" + accountType + ", accountMoney=" + accountMoney
				+ "] \n" ;
	}
	
	

}
