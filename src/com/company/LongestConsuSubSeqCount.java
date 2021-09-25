package com.company;

import java.util.HashSet;
import java.util.Set;


public class LongestConsuSubSeqCount {
    //TODO KR: abdul bari DSA
    // Returns length of the longest consecutive subsequence
    static int findLongestConseqSubseq(int arr[], int n) {
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {

                int j = arr[i];
                while (set.contains(j))
                    j++;

                if (count < j - arr[i])
                    count = j - arr[i];
            }
        }
        return count;
    }

    // Testing program
    public static void main(String args[]) {
        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        int n = arr.length;
        System.out.println("Length of the Longest consecutive subsequence is " + findLongestConseqSubseq(arr, n));
    }
}