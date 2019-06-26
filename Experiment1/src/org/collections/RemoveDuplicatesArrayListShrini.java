package org.collections;

import java.util.*;

public class RemoveDuplicatesArrayListShrini {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("A");
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("C");
		list2.add("A");
		list2.add("D");
		
		Set<String> set=new HashSet<>();
		for(String single1:list1) {
			if(list2.contains(single1)) {
				list2.remove(single1);
			}
			else {
				set.add(single1);
			}
		}
		set.addAll(list2);
		
		System.out.println(set.toString());
		

	}

	
	




}
