package com.java.algorithms.sort;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 20, 78, 44, 23, 6, 82, 328, 58, 16, 23 };

		for (int i = arr.length - 1; i > 0; i--) {
			int j = 1, big = 0;
			for (; j <= i; j++) {
				if (arr[big] < arr[j]) {
					big = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[big];
			arr[big] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
