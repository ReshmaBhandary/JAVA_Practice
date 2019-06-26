package com.string;

public class SwitchMain {

	public static void main(String[] args) {
		System.out.println(10/0.0);
		int b=1;
		//b=b+1.2
		System.out.println(b);
		System.out.println(b+1.2);
		String var = "C";
		switch (var) {
		case "A":
			System.out.println("A");
			break;

		case "B":
			System.out.println("B");
			break;
		default:
			System.out.println("Default");
			break;

		}
	}

}
