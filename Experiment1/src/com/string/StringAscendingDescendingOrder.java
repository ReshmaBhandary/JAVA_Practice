package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAscendingDescendingOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String givenName = scan.next();
		String order=scan.next();
		scan.close();
		givenName=givenName.toUpperCase();
		order=order.toUpperCase();
		
		int asciiArray[]=new int[givenName.length()];
		convertCharToInt(givenName, asciiArray);
		sort(asciiArray,order);
		convertIntToChar(givenName, asciiArray);
		

	}

	private static void convertIntToChar(String givenName, int[] asciiArray) {
		StringBuilder strbul=new StringBuilder();
		for(int i=0;i<asciiArray.length;i++) {
			strbul.append((char)asciiArray[i]);
		}
		System.out.println(strbul.toString());		
	}

	private static void sort(int[] asciiArray,String order) {
		switch (order) {
		case "ASC":
			asecendingOrder(asciiArray);
			break;

		default:
			desecendingOrder(asciiArray);
			break;
		}
		
		
	}

	private static void desecendingOrder(int[] asciiArray) {
		for(int i=0;i<asciiArray.length;i++) {
			for(int j=0;j<asciiArray.length;j++) {
				if(asciiArray[i]>asciiArray[j]) {
					int temp=asciiArray[j];
					asciiArray[j]=asciiArray[i];
					asciiArray[i]=temp;
				}
			}
		}
	}
	private static void asecendingOrder(int[] asciiArray) {
		for(int i=0;i<asciiArray.length;i++) {
			for(int j=i;j<asciiArray.length;j++) {
				if(asciiArray[i]>asciiArray[j]) {
					int temp=asciiArray[j];
					asciiArray[j]=asciiArray[i];
					asciiArray[i]=temp;
				}
			}
		}
	}

	private static void convertCharToInt(String givenName, int[] asciiArray) {
		for(int i=0;i<givenName.length();i++) {
			asciiArray[i]=givenName.charAt(i);
			System.out.println("Given Letter "+ givenName.charAt(i) +" : "+asciiArray[i]);
		}
	}

}
