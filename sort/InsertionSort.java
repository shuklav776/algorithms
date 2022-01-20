package com.java.algorithms.sort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 20, 78, 44, 23, 6, 82, 328, 58, 16, 23 };

		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int key = arr[i];

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j -1;
			}
			arr[j + 1] = key;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
