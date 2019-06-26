package com.algorithm;

public class MatrixTest {

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s.replace('o','l'));
		int a[][] = { { 1, 2 }, 
					  { 5, 6 } };
		int b[][] = { { 1, 2 }, 
				      { 5, 6 } };
		int c[][]=add(a, b);
		display(c);
		

	}

	private static void display(int[][] c) {
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c.length; j++) {
				System.out.println(c[i][j] +" ");
			}
		}
		
	}

	private static int[][] add(int[][] a, int[][] b) {
		int c[][] = new int[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}

		}
		return c;
	}

}
