package org.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B");
		add(list);
		System.out.println(list);

		/*List listAll = new ArrayList<>();
		listAll.add(1);
		listAll.add("String");
		addd(listAll);
		System.out.println(listAll);*/
	}
	private static void add(List<String> list) {
		list.add("C");
	}
	/*private static void addd(List listAll) {
	listAll.add("1233556");
}*/


}
