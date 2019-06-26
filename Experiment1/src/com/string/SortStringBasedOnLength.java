package com.string;

public class SortStringBasedOnLength {

	public static void main(String[] args) {
		String[] arrayString = { "abcde", "abc", "abcd" };
		sort(arrayString);
	}

	private static void sort(String[] arrayString) {
		for (int i = 0; i < arrayString.length; i++) {
			for (int j = i; j < arrayString.length; j++) {
				if (arrayString[i].length() > arrayString[j].length()) {
					String temp = arrayString[j];
					arrayString[j] = arrayString[i];
					arrayString[i] = temp;
				}
			}
		}

		for (String a : arrayString) {
			System.out.println(a);
		}
	}

}
