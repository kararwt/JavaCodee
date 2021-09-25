package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int findLIS(int[] s) {
		if (s == null || s.length == 0)
			return 0;

		List<Integer> res = new ArrayList<>();

		for (int curr : s) {
			if (res.size() == 0 || curr > res.get(res.size() - 1)) {
				res.add(curr);
			} else {
				int i = 0;
				int j = res.size() - 1;

				while (i < j) {
					int centr = (i + j) / 2;
					if (res.get(centr) < curr) {
						i = centr + 1;
					} else {
						j = centr;
					}
				}

				res.set(j, curr);
			}
		}

		return res.size();
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _s_size = Integer.parseInt(in.nextLine());
		int[] _s = new int[_s_size];
		int _s_item;
		for (int _s_i = 0; _s_i < _s_size; _s_i++) {
			_s_item = Integer.parseInt(in.nextLine());
			_s[_s_i] = _s_item;
		}

		res = findLIS(_s);
		System.out.println(res);

	}
}