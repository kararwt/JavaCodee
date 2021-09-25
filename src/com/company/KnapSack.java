package com.company;/*
 * k0r02ds
 * created on 17/11/20
 */

public class KnapSack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int weights[] = {10, 20, 30};
        int max = 50;
        System.out.println(knapSack(max, weights, val, val.length));
    }

    static int knapSack(int W, int weights[],
                        int val[], int n) {
        int i, j;
        int arr[][] = new int[n + 1][W + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= W; j++) {
                if (i == 0 || j == 0)
                    arr[i][j] = 0;
                else if (weights[i - 1] <= j)
                    arr[i][j]
                            = Math.max(val[i - 1]
                                    + arr[i - 1][j - weights[i - 1]],
                            arr[i - 1][j]);
                else
                    arr[i][j] = arr[i - 1][j];
            }
        }

        return arr[n][W];
    }
}
