package org.collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i <=5; i++) {
			stack.push(Integer.valueOf(i));
		}
		System.out.println(stack.size());

	//	System.out.println(stack.peek());
	//	System.out.println(stack.pop());
//		for(int i = 0; i <=stack.size(); i++) {
//			System.out.println(stack.pop());
//		}
		System.out.println("size "+stack.size());
		System.out.println(stack.search(2));

	}

}
