package com.string;

public class StringRemoveCharacter {

	public static void main(String[] args) {
		String name = "Homeh";
	//	System.out.println(name.replace('H', ' '));
		char[] array=name.toCharArray();
		for(int i=0;i<array.length;i++) {
			if('h'==array[i]) {
				name=name.replace(array[i], ' ');
				System.out.println(name);
				name=name.replaceAll("\\s", "");
				break;//for all occurance then no need ot use break
			}
		}
		
		System.out.println(name.trim());
		System.out.println("***************");
		name="areshma";
		name=name.replaceAll(Character.toString('a'), " ");
		System.out.println(name.trim());
System.out.println(Integer.valueOf(123));
System.out.println("**************************************************************");
String names="Home is sweet home";
names=names.replace("i", " ");
System.out.println(names);
	}

}
