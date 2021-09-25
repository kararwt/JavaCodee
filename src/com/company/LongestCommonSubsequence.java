package com.company;/*
 * k0r02ds
 * created on 13/11/20
 */


public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1 = "abcdefghij";
        String str2 = "ecdgi";
        System.out.println(lcs(str1.toCharArray(), str2.toCharArray(), str1.length(), str2.length()));
    }
    private static int lcs(char[] str1, char[] str2, int len1, int len2) {
        int arr[][] = new int[len1+1][len2+1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (str1[i-1] == str2[j-1]) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }
        return arr[len1][len2];
    }
}
