package com.sort.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAccount {

	public static void main(String[] args) {
		Account account2 = new Account("Reshma2", "Temp2", 623);
		Account account3 = new Account("Reshma3", "Temp3", 7896);
		Account account = new Account("Reshma", "Temp", 1299);
		Account account1 = new Account("Reshma1", "Temp1", 1110);
	
		Account account4 = new Account("Reshma4", "Temp4", 1240);
		List<Account> list=new ArrayList<>();
		list.add(account);
		list.add(account2);
		list.add(account3);
		list.add(account1);
		
		list.add(account4);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("*******************");
		Collections.sort(list, new AccountComparator());
		System.out.println(list);
		
		
	}

}
