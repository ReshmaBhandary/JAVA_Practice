package org.collections;

public class reverseArray {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5,6 };
		int mid=array.length/2;
		int j=array.length-1;
		for(int i=0;i<mid;i++) {
			int a=array[i];
			int b=array[j];
			array[i]=array[i]+array[j];
			array[j]=array[i]-array[j];
			array[i]=array[i]-array[j];
			j--;
			
		}
		for(int i:array) {
		System.out.println(i);
		}
	}

}
