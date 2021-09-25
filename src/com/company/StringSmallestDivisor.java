package com.company;

public class StringSmallestDivisor {

	public static int findSmallestDivisor(String s, String t) {

		int len = s.length();
		int size = -1;
		for (int i = 1; i <= len; i++) {
			String currStr = "";
			String tmp = "";

			for (int j = 0; j < i; j++)
				tmp += s.charAt(j);
			for (int j = 0; j < (len / i); j++)
				currStr += tmp;

			if (s.equals(currStr)) {
				System.out.println(tmp);
				if (t.contains(currStr)) {
					size = t.length() / tmp.length();
					if (size == 1 && (s.length() == t.length()))
						size = t.length();
				}
				return size;
			}

		}
		return size;
	}

	public static void main(String[] args) {

		int result = StringSmallestDivisor.findSmallestDivisor("abcabcd", "abcabcd");
		System.out.println(result);

	}

}
