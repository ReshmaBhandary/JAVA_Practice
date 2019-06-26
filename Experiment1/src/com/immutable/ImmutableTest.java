package com.immutable;

import java.util.*;

import com.serializable.Address;

public class ImmutableTest {

	public static void main(String[] args) {
		
		String s1=new String("String");
		System.out.println(s1);
		
		Address adr=new Address("udu","kar");
//		
//		Account acc=new Account(new Date(), adr, "Reshma", 100);
//		System.out.println(acc);
//		//tryModify(acc.getAccountName(),acc.getAccountNumber());
//		System.out.println(acc.getDob());
//	//	System.out.println(acc);
//		HashMap<String,String> hm =new HashMap<String,String>();
//		hm.put("1", "reshma");
//		hm.put("2", "reshma2");
//		hm.put("3", "reshma3");
//		HashMap<String,String> hm1=new HashMap<String,String>(hm);
//		System.out.println(hm);
//		System.out.println(hm1);
//		System.out.println("------------------------");
//		
//		
//		
//		hm.remove("1");
//		System.out.println(hm);
//		System.out.println(hm1);	
//		
		
		System.out.println("***************************************************************************************************");
		
		Account acc=new Account(new Date(), adr, "Reshma", 100);
		//adr.setCcity("banglore");
		
		System.out.println(acc);
		System.out.println(acc);
		TempAccount temp1=new TempAccount(new Date(), adr, "Savings", 1234, "kar");
		System.out.println(temp1);
		//adr.setCcity("bangr");
		
		System.out.println(temp1);
		
		System.out.println("***************************************************************************************************");
		

		Acc acc1=new Acc(1, "reshma", adr);
		System.out.println(acc1);
		adr.setCcity("loooooola");
		System.out.println(acc1);
	}


	private static void tryModify(String accountName, int accountNumber) {
		accountName="vvvvv";
		accountNumber=111111111;
		
	}
	


}
				