package com.company;

public class RotateArrayByK {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        rotateArr(arr, 3, arr.length);
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rotateArr(int[] arr, int k, int n) {
        int start = 0, last = k - 1;

        while (start <= last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }

        start = k;
        last = n - 1;

        while (start <= last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }

        start = 0;
        last = n - 1;

        while (start <= last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }

    }


}