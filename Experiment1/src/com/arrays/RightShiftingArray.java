package com.arrays;

import java.util.regex.Pattern;

public class RightShiftingArray {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("[+-]?[0-9][0-9]*");

		String userID = "+";
		if (pattern.matcher(userID).matches()) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		int array[] = { 1, 2, 3, 4, 5 };
		int n = 2;
		while (n > 0) {
			int temp = array[array.length - 1];
			for (int i = array.length - 2; i >= 0; i--) {
				array[i + 1] = array[i];
			}
			array[0] = temp;
			n--;
		}
		for (int s : array) {
			System.out.print(s);
		}
	}

}
