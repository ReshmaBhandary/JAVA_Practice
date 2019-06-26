package hacker.rank.programs;

import java.util.Scanner;

public class BeautiFulDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startDay = scan.nextInt();
		int endDay = scan.nextInt();
		int divisor = scan.nextInt();
		scan.close();
		int size = endDay - startDay;
		int count=0;
		int[] array = new int[size + 1];

		getArrayDate(startDay, size, array);
		for (int j : array) {
			int fineReverse = getReverse(j);
			int sub=Math.abs(j-fineReverse);
			if(0==sub%divisor) {
				count++;
			}
		}
		System.out.println(count);

	}

	private static void getArrayDate(int startDay, int size, int[] array) {
		int date = startDay;
		for (int i = 0; i < size + 1; i++) {
			array[i] = date;
			date++;
		}
	}

	private static int getReverse(int j) {
		int sum = 0;
		while (j > 0) {
			int rem = j % 10;
			sum = sum * 10 + rem;
			j = j / 10;

		}
		return sum;
	}

}
