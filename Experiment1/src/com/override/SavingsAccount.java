package com.override;

public class SavingsAccount extends Account{
	private String accountName;
	

	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public SavingsAccount(String accountName, String accountId, String accountName2) {
		super(accountName, accountId);
		accountName = accountName2;
	}


	

}
