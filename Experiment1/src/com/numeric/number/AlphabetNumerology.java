package com.numeric.number;

import java.util.ArrayList;
import java.util.HashMap;

public class AlphabetNumerology {
	static HashMap<Character, Integer> alphabetMap = new HashMap<>();
	static {

		prepareMapWithAlphabetValues();
	}

	public static void main(String[] args) {
		

		String givenName = "Reshma Bhandary";

		int finalSum = 0;
		for (String single : givenName.split(" ")) {
			int luckyNumber = getNumericNumber(single);
			finalSum = finalSum + luckyNumber;
		}
		System.out.println(finalSum);

	}

	private static int getNumericNumber(String givenName) {
		givenName = givenName.toUpperCase();
		int sum = 0;
		for (int i = 0; i < givenName.length(); i++) {
			char c = givenName.charAt(i);

			int value = alphabetMap.get(c);
			sum = sum + value;
		}
		while (sum >= 10) {
			sum = getSingleValue(sum);

		}
		return sum;
	}

	private static int getSingleValue(int sum) {
		int ans = 0;
		while (sum > 0) {
			int rem = sum % 10;
			ans = ans + rem;
			sum = sum / 10;

		}
		return ans;
	}

	private static void prepareMapWithAlphabetValues() {
		alphabetMap.put('A', 1);
		alphabetMap.put('B', 2);
		alphabetMap.put('C', 3);
		alphabetMap.put('D', 4);
		alphabetMap.put('E', 5);
		alphabetMap.put('F', 6);
		alphabetMap.put('G', 7);
		alphabetMap.put('H', 8);
		alphabetMap.put('I', 9);
		alphabetMap.put('J', 10);
		alphabetMap.put('K', 11);
		alphabetMap.put('L', 12);
		alphabetMap.put('M', 13);
		alphabetMap.put('N', 14);
		alphabetMap.put('O', 15);
		alphabetMap.put('P', 16);
		alphabetMap.put('Q', 17);
		alphabetMap.put('R', 18);
		alphabetMap.put('S', 19);
		alphabetMap.put('T', 20);
		alphabetMap.put('U', 21);
		alphabetMap.put('V', 22);
		alphabetMap.put('W', 23);
		alphabetMap.put('X', 24);
		alphabetMap.put('Y', 25);
		alphabetMap.put('Z', 26);

	}

}
