package com.string;

public class StringReverse {

	public static void main(String[] args) {
		String name = "abcd";
		StringBuilder str = new StringBuilder();
		StringBuilder str1 = new StringBuilder();
		for (int i = name.length() - 1; i >= 0; i--) {

			str = str.append(name.charAt(i));
		}
		System.out.println(str);

		str = new StringBuilder(name);
		str.reverse();
		System.out.println(str);
		System.out.println("----------------------------------------------");
		char[] nameArray=name.toCharArray();
		System.out.println(nameArray.length);
		for(int a=nameArray.length-1;a>=0;a--) {
		str1=str1.append(nameArray[a]);	
			
		}
		System.out.println(str1.toString());
		
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println(2+2*3+"Shting"+2+3); //8Shting23
		System.out.println(2+2+"string"+2*3);//4string6
		System.out.println(2+2+"string"+2*3+2);//4string62
		System.out.println(2+2*3+"Shting"+2+3*4); //8Shting212
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + (s1 == s2));
		System.out.println(2*3+"s1 == s2 is:" +2*3+4);
		System.out.println(2*3+"s1 == s2 is:" +2+3*4+"hi"+9+1);
		
		
		
	}

}
