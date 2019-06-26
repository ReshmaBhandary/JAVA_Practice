package org.collections;

import java.util.*;

import org.generics.Employee;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		addMore(list);
		for (String singlr : list) {
			System.out.println(singlr);
		}
		
		
		
		System.out.println(list.toString());
		System.out.println("****************************************");
		list.remove(3);
		System.out.println(list.toString());
		list.remove("3");
		System.out.println(list.toString());
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		ArrayList<Integer> intlist=new ArrayList<>();
		intlist.add(1);
		intlist.add(2);
		intlist.add(3);
		intlist.add(4);
		
		System.out.println(intlist.toString());
		intlist.remove(1);
		System.out.println(intlist.toString());
		Integer a=1;
		intlist.remove(a);
		System.out.println(intlist.toString());
		
	}

	private static void addMore(List<String> list) {
		list.add("5");

		list=null;
	}

}
