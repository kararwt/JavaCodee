package com.company;

import java.util.Stack;

// class of binary tree 
public class MyStack extends Stack<Integer> {

	Stack<Integer> min = new Stack<>();

	public static void main(String... args) {
		MyStack s = new MyStack();
		s.push(10);
		s.push(30);
		s.push(20);

		System.out.println(s);

		System.out.println(s.getMin());
		s.push(5);
		System.out.println(s.getMin());
	}

	void push(int x) {
		if (isEmpty() == true) {
			super.push(x);
			min.push(x);
		} else {
			super.push(x);
			int y = min.peek();
			if (x < y)
				min.push(x);

		}
	}

	/*
	 * SpecialStack's member method to insert an element to it. This method makes
	 * sure that the min stack is also updated with appropriate minimum values
	 */
	public Integer pop() {
		int x = super.pop();
		min.pop();
		return x;
	}

	/* SpecialStack's member method to get minimum element from it. */
	int getMin() {
		int x = min.peek();
		return x;
	}

}