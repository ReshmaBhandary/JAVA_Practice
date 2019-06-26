package com.string;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveMultipleStringCharacters {

	public static void main(String[] args) {
		String namea = "reshma";
		String part = "sh";
		System.out.println(namea.indexOf(part));

		String name = "bananas";
		String[] array = name.split("");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					array[j] = "0";
				}
			}

		}
		StringBuilder strBu = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (!array[i].equals("0")) {
				strBu = strBu.append(array[i]);
			}
		}
		System.out.println(strBu.toString());
		System.out.println("**********************************************");

		// String.join("," ,array);
		StringBuilder bul = new StringBuilder();
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != "0") {
				set.add(array[i]);
				bul.append(array[i]);
			}
		}
		System.out.println(set);
		System.out.println(bul.toString());
		
		
		
		
		remove("Reshsma",'s');
	}

	private static void remove(String word, char c) {
		StringBuilder strbul=new StringBuilder();
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i) != c) {
				strbul.append(word.charAt(i));
			}
		}
		System.out.println(strbul.toString());
		
	}

}
