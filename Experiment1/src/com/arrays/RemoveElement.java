package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {
	public static void main(String args[]) {
		int [] array= {1,2,3,4,5};
		int[] result=removeAtgivenPosition(array,2);
		
		for(int i:result) {
			System.out.println(i);
		}
		
		
	}

	private static int[] removeAtgivenPosition(int[] array, int i) {

		ArrayList<Integer> list = new ArrayList<>();
		for (int a = 0; a < array.length; a++) {
			list.add(array[a]);
		}
		System.out.println(list);
		list.remove(i);
		int[] ans = new int[list.size()];
		for (int a = 0; a < list.size(); a++) {
			ans[a] = list.get(a);
		}

		return ans;
	}

}
