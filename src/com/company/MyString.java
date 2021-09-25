package com.company;

public class MyString {

	// Driver program to test above functions
	public static void main(String[] args) {
		String str = "abc";
		Character[] charObj = str.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		System.out.println(charObj);
	}

}
