package org.collections;

import java.util.Arrays;

public class CommonsArrayElements {

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 1, 2, 6,6 };
		Arrays.sort(array);
		for (int i = 1;i < array.length; i++) {
			if(array[i]==array[i-1]) {
				System.out.println(array[i]);
			}
		}
	}

}
