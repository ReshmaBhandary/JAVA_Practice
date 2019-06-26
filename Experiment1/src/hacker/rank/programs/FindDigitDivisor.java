package hacker.rank.programs;

import java.util.Scanner;

public class FindDigitDivisor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for (int i = 0; i < testCase; i++) {
			int ii = scan.nextInt();
			int count = findDigit(ii);
			System.out.println("digit and count are " + ii + "," + count + " respectively");

		}
		scan.close();

	}

	private static int findDigit(int digit) {
		int count = 0;
		int n=digit;
		while (digit > 0) {
			int remainder = digit % 10;
			if (0 != remainder) {
				if (0 == n % remainder) {
					count++;
				}
			}
			digit = digit / 10;
		}

		return count;
	}

}
