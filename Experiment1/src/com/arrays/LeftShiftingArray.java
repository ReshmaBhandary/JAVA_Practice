package com.arrays;

public class LeftShiftingArray {

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		int n=2;
		while(n>0){
			int temp=array[0];
			for(int i=1;i<array.length;i++) {
				array[i-1]=array[i];
			}
			array[array.length-1]=temp;
			n--;
		}
		
		for(int s:array) {
			System.out.println(s);
		}
		
		
		
	}
	

}
