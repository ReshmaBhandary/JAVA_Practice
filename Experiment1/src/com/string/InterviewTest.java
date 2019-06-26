package com.string;

import java.util.Scanner;

public class InterviewTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int primeNumber = scan.nextInt();
		int fibi = scan.nextInt();
		int fact = scan.nextInt();
		scan.close();
		System.out.println("***************PRIME NUMBER***************");
		System.out.println(findPrimeNumber(primeNumber));

		System.out.println("***************FIBINOCCI NUMBER***************");
		findFibinocciNumber(fibi);

		System.out.println("***************FACTORIAL NUMBER***************");
		System.out.println(findFactorialNumber(fact));

	}

	private static int findFactorialNumber(int fact) {
		if (fact == 1 || fact == 0) {
			return 1;
		}
		
		return fact * findFactorialNumber(fact - 1);
	}

	private static void findFibinocciNumber(int fibi) {
		int i = 0;
		int j = 1;
		if (fibi == 1) {
			System.out.println(i);
		} else if (fibi == 2) {
			System.out.println(i);
			System.out.println(j);
		} else {

			for (int z = 2; z < fibi; z++) {

				int k = i + j;
				System.out.println(k);
				i = j;
				j = k;

			}
		}

	}

	private static boolean findPrimeNumber(int primeNumber) {
		int size = primeNumber / 2;
		for (int i = 2; i <= size; i++) {
			if (primeNumber % i == 0) {
				return false;
			}

		}

		return true;
	}

}
