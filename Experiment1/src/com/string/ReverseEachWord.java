package com.string;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {
		String array[]= {"hello","World","Im","Here"};
		int i=0;
		for(String single:array) {
			array[i]=reverse(single);
			i++;
			
		}
		String str = Arrays.toString(array);
		System.out.println(str);
		reverseTheArray(array);
		System.out.println("after reverse");
		System.out.println(Arrays.toString(array));
		

	}

	

	private static void reverseTheArray(String[] array) {
		int mid = array.length / 2;
		int j=array.length-1;
		for (int i = 0; i <= mid; i++) {
			String temp=array[i];
			array[i]=array[j];
			array[j]=temp;

		}
	}



	private static String reverse(String single) {
		StringBuilder strBul=new StringBuilder();
		char[] ch=single.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			strBul=strBul.append(ch[i]);
		}
		return strBul.toString();
	}

}
