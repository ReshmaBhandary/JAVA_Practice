package org.generics;

import java.util.HashSet;
import java.util.Set;

import com.serializable.Address;
import com.sort.object.Account;

public class GenericTest {

	public static void main(String[] args) {
		GenericUtility obj=new GenericUtility();

		Employee emp=new Employee("Reshma", 1111, "manipal");
//		GenericUtility.display(emp);
		Address address=new Address("kar", "kar");
	//	GenericUtility.display(address);
		Account account=new Account("Savings", "Temporary", 309090);
		//GenericUtility.display(account);
		
		obj.display(emp);
		obj.display(address);	
		obj.display(account);
		
		
		System.out.println("*********************");
		String name="Reshma";
		swap(name);
		System.out.println(name);
		
		
		
		Set<? extends Object> SetOfObject = new HashSet<String>();
		
	}

	private static void swap(String name) {
name=name.concat("Bhandary");		
	}

}
