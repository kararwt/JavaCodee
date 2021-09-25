package com.company;

public class BubbleSort {

	static void bubbleSort(int arr[], int n) {
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap the elements
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		// print the sorted array
		System.out.println("Sorted Array: ");
		for (i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 8, 5, 2, 4, 6, 3 };
		bubbleSort(arr, 7);
	}

}
