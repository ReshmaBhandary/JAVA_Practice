package com.arrays;

public class ShiftingRotating {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		rightShift(a);
	int[]	a1= { 1, 2, 3, 4, 5 };
	System.out.println("\n");
	System.out.println("***********************************");
		leftShift(a1);

	}

	private static void leftShift(int[] a1) {
		for(int s:a1) {
			System.out.print(s);
			System.out.print(" ");
		}
		System.out.println("\n");
		int length = a1.length - 1;
		int temp=a1[0];
		for(int i=1;i<=length;i++) {
			a1[i-1]=a1[i];
		}
		a1[length-1]=temp;
		for(int s:a1) {
			System.out.print(s);
			System.out.print(" ");
		}
	}

	private static void rightShift(int[] a) {
		int length = a.length - 1;
		int temp = a[length];
		for(int s:a) {
			System.out.print(s);
			System.out.print(" ");
		}
		System.out.println("\n");
		for (int i = length-1; i >= 0; i--) {
			//System.out.println(i);
			a[i+1] = a[i];
		}
		a[0]=temp;
		for(int s:a) {
			System.out.print(s);
			System.out.print(" ");
		}
	}

}
