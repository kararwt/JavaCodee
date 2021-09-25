package com.company;

import java.util.ArrayList;
import java.util.List;

public class HouseColor {

	public static int minPrice(List<List<Integer>> cost) {

		int[][] priceArray = new int[cost.size()][cost.get(0).size()];
		for (int i = 0; i < cost.size(); i++) {

			List<Integer> list = cost.get(i);
			int k = 0;
			for (Integer integer : list) {
				priceArray[i][k] = integer;
				k++;
			}
		}
		return caculateCost(priceArray);

	}

	public static int caculateCost(int[][] priceArray) {
		if (priceArray == null || priceArray.length == 0)
			return 0;

		for (int k = 1; k < priceArray.length; k++) {
			priceArray[k][0] += Math.min(priceArray[k - 1][1], priceArray[k - 1][2]);
			priceArray[k][1] += Math.min(priceArray[k - 1][0], priceArray[k - 1][2]);
			priceArray[k][2] += Math.min(priceArray[k - 1][0], priceArray[k - 1][1]);
		}

		int lastRow = priceArray.length - 1;
		int minOfTwo = Math.min(priceArray[lastRow][0], priceArray[lastRow][1]);

		return Math.min(minOfTwo, priceArray[lastRow][2]);
	}

	public static void main(String[] args) {
		Integer[][] arr = { { 1, 2, 2 }, { 2, 2, 1 }, { 2, 1, 2 } };
		List<List<Integer>> cost = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(2);
		cost.add(0, list);
		list = new ArrayList<>();
		list.add(2);
		list.add(2);
		list.add(1);
		cost.add(1, list);
		list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(2);
		cost.add(2, list);

		System.out.println(minPrice(cost));
	}

}
