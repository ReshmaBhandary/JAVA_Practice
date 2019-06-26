package org.collections;

import java.util.ArrayList;
import java.util.*;

public class DuplicatesInArray {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list.addAll(list2);
		
		Set<Integer> set = new HashSet<>();
		for(Integer i:list) {
			if(!set.add(i)) {
			System.out.println(i);	
			}
		}

	}

}
