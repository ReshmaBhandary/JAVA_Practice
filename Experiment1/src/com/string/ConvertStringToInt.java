package com.string;

public class ConvertStringToInt {

	public static void main(String[] args) {
	//	System.out.println(Math.subtractExact(3, 9));
		String givenNumber = "123456";
		
		int number = convertStringToInt(givenNumber);
		System.out.println(" number "+number);

	}

	private static int convertStringToInt(String givenNumber) {
		//int num=0;
		int sum=0;
		for(int i=0;i<givenNumber.length();i++) {
			int  num1=givenNumber.charAt(i)-'0';
			System.out.println(num1);
		//num=	num+num1*mul;
		sum=(sum*10)+(num1);
		}
		return sum;
	}

}
