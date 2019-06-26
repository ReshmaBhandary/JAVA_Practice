package com.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String name="ReshMa";
String name2="Ramesh";
boolean flag=anagram(name,name2);
System.out.println(flag);
	}

	private static boolean anagram(String name, String name2) {
		char[] name1=name.toCharArray();
		char[] name22=name2.toCharArray();
		Arrays.sort(name1);
		Arrays.sort(name22);
		
		return Arrays.equals(name1, name22);
	}

}
