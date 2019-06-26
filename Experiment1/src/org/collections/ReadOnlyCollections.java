package org.collections;

import java.util.*;
import java.util.Collections;

public class ReadOnlyCollections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("12");
		list.add("13");
		list.add("14");
		display(list);
		list=Collections.unmodifiableList(list);
		System.out.println("*****************************");
		list.add("15");
		display(list);
	}

	private static void display(List<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}

}
