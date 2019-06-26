package org.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.serializable.Address;

public class AddressSetTest {

	public static void main(String[] args) {
		Address adress1=new Address("kar","karnataka");
		Address adress2=new Address("kar1","karnataka1");
		Address adress3=new Address("kar","karnataka");
		Address adress4=adress2;
		Set<Address> set=new HashSet<>();
		set.add(adress1);
		set.add(adress2);
		set.add(adress3);
		set.add(adress4);
		System.out.println(set.size());

		
		
		
	}

}
