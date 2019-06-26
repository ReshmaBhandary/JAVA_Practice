package com.sort.object;

import java.util.Comparator;

public class AccountComparator implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {

		
		return o1.getAccountName().compareTo(o2.getAccountName());
	}
	

}
