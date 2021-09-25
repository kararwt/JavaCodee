package com.company;/*
 * k0r02ds
 * created on 18/11/20
 */

//recursion
public class EggDrop {
    public static void main(String[] args) {
        int n = 2, k = 10;
        System.out.print("Minimum number of "
                + "trials in worst case with "
                + n + " eggs and " + k
                + " floors is " + eggDrop(n, k));
    }

    private static int eggDrop(int n, int k) {

        if (k == 1 || k == 0) {
            return k;
        }
        if (n == 1)
            return k;
        int x, res = 0;
        int min = Integer.MAX_VALUE;
        for (x = 1; x <= k; x++) {
            res = Math.max(eggDrop(n - 1, x - 1), eggDrop(n, k - x));
            if (res < min) {
                min = res;
            }
        }
        return min+1;
    }
}
