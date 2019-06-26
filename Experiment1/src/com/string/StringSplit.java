package com.string;

import java.util.Arrays;

public class StringSplit {

	public static void main(String[] args) {
		String a = "hi,hello,bye";
		String[] array = a.split(",");
		for (String i : array) {
			System.out.println(i);
		}
		System.out.println("********************");
		System.out.println(Arrays.toString(array));
	}

}
