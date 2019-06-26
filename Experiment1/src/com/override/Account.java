package com.override;

public class Account {
	private String accountName;
	private String accountId;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public Account(String accountName, String accountId) {
		super();
		this.accountName = accountName;
		this.accountId = accountId;
	}
	

}
