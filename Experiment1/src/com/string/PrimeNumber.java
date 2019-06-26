package com.string;

public class PrimeNumber {
	public static void main(String... args) {
		int n = 4;
		boolean flag=false;
		int mid = n / 2;
		for (int j = 2; j <= mid; j++) {
			if(n%j==0) {
				System.out.println("A prime number");
				flag=true;
				break;
			}

		}
		if(!flag) {
			System.out.println("Nota prime number");
		}

	}

}
