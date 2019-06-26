package hacker.rank.programs;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int length = scan.nextInt();
		int[] ar = new int[length];
		for (int i = 0; i < length; i++) {
			ar[i] = scan.nextInt();
		}
		int day=scan.nextInt();
		int month=scan.nextInt();
		scan.close();
		displayArray(ar);
		System.out.println("--------------------------");
		System.out.println(birthdaySquare(ar,day,month));
		
		
	}

	private static char[] birthdaySquare(int[] ar, int day, int month) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				
				
			}
			
		}

		return null;
	}

	private static void displayArray(int[] ar) {
		for (int a : ar) {
			System.out.println(a);
		}
	}

}
