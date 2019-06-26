package com.algorithm;

public class BinarySearch {

	public static void main(String[] args) {
		int[] givenArray = { 1, 5, 9, 11 };
		int key = 9;
		int index = binarySearch(givenArray, key);
		if (index == -1) {
			System.out.println(key + " is not found at any index ");
		} else {
			System.out.println(key + " is found at index " + index);
		}

	}

	private static int binarySearch(int[] givenArray, int key) {
		int low = 0;
		int high = givenArray.length - 1;
		
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key == givenArray[mid]) {
				return mid;
			} else if (key < givenArray[mid]) {
				high = mid - 1;
			} else if (key > givenArray[mid]) {
				low =mid + 1;
			}
		}
		return -1;
	}

}
