package com.arrays;

import java.util.*;

public class RemoveArrayElement {

	public static void main(String[] args) {
		int arrays[] = new int[] { 1, 5, 3, 5, 2 };
		int[] rsul = removeDuplicate(arrays);
		for (int i : rsul) {
			System.out.println(i);
		}
		System.out.println("*****");
		sort(arrays);
		System.out.println("*****");
	List<String> list=new ArrayList<>(Arrays.asList(new String[]{"A","B"}));
	list.add("C");
	System.out.println(list);
	ArrayList<String> aa=new ArrayList<>(list);
	aa.add("A");
	System.out.println(aa);
	
	List<String> list1=Arrays.asList(new String[]{"A","B"});
	list1.add("C");
	System.out.println(list1);
		
		
	}




	private static int[] removeDuplicate(int[] arrays) {
		Set<Integer> set = new HashSet<>();
		for (int i : arrays) {
			set.add(i);
		}
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(set);
		int res[] = new int[set.size()];
		for (int x = 0; x < res.length; x++) {
			res[x] = list.get(x);

		}
		return res;
	}
	private static void sort(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			for (int j = i+1; j < arrays.length; j++) {
				if (arrays[i] > arrays[j]) {
					int temp = arrays[i];
					arrays[i] = arrays[j];
					arrays[j] = temp;
				}
			}

		}

		for (Integer ii : arrays) {
			System.out.println(ii);
		}

	}


}
