package com.company;

public class CoinChainOrCombinationalSum {

	public static int count(int coins[], int sum) {

		int table[] = new int[sum + 1];
		table[0] = 1;

		for (int k : coins)
			for (int j = 1; j < table.length; j++)
				if (j >= k)
					table[j] += table[j - k];

		return table[sum];
	}

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3 };
		int n = 4;
		System.out.println(count(arr, n));
	}

	/*
	 * public List<List<Integer>> combinationSum(int[] candidates, int target) {
	 * List<List<Integer>> result = new ArrayList<>(); List<Integer> temp = new
	 * ArrayList<>(); helper(candidates, 0, target, 0, temp, result); return result;
	 * }
	 * 
	 * private static void helper(int[] candidates, int start, int target, int sum,
	 * List<Integer> list, List<List<Integer>> result) { if (sum > target) { return;
	 * }
	 * 
	 * if (sum == target) { result.add(new ArrayList<>(list)); return; }
	 * 
	 * for (int i = start; i < candidates.length; i++) { list.add(candidates[i]);
	 * helper(candidates, i, target, sum + candidates[i], list, result);
	 * list.remove(list.size() - 1); } }
	 * 
	 * public static void main(String... args) {
	 * 
	 * int[] candidates = { 1, 2, 3 };
	 * 
	 * List<Integer> list = new ArrayList<>(); List<List<Integer>> result = new
	 * ArrayList<>(); helper(candidates, 0, 4, 0, list, result);
	 * System.out.println(result); }
	 */

}