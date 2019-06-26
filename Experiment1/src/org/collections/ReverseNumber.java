package org.collections;

public class ReverseNumber {

	public static void main(String[] args) {
		int i = 195;
		int ii = revereNumber(i);
		System.out.println(ii);
	}

	private static int revereNumber(int i) {
		int ans = 0;
		while (i > 0) {
			int remainder = i % 10;
			System.out.println(remainder);
			ans = ans * 10 + remainder;
			i = i / 10;

		}
		return ans;
	}

}
