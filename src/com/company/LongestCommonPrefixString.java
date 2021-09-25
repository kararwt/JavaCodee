package com.company;

import java.util.Arrays;

public class LongestCommonPrefixString {

	static String commonPrefixUtil(String str1, String str2) {
		String result = "";
		int n1 = str1.length(), n2 = str2.length();

		// Compare str1 and str2
		for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) {
			if (str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			result += str1.charAt(i);
		}

		return (result);
	}

// A Function that returns the longest common prefix  
// from the array of strings  
	static void commonPrefix(String arr[], int n) {
		// sorts the N set of strings
		Arrays.sort(arr);

		// prints the common prefix of the first and the
		// last String of the set of strings
		System.out.println(commonPrefixUtil(arr[0], arr[n - 1]));
	}

// Driver Code  
	public static void main(String[] args) {
		String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer" };
		int n = arr.length;

		commonPrefix(arr, n);

	}

}
