package com.string;

public class StringSingleRemoveCharacter {

	public static void main(String[] args) {
		String name = "Resahma";
		char[] array=name.toCharArray();
		for(int i=0;i<array.length;i++) {
			if('a'==array[i]) {
				//name=name.replace(array[i], ' ');
				array[i]=' ';
				String na=new String(array);
				System.out.println(na);
				na=na.replaceAll("\\s+","");
				System.out.println(" before "+name);
				
				System.out.println("after "+na);
				
				
				break;
			}
			
		}
		
		System.out.println(name.trim());
		System.out.println("***************");
		name="areshma";
		name=name.replaceAll(Character.toString('a'), " ");
		System.out.println(name.trim());
System.out.println(Integer.valueOf(123));
		
	}

}
