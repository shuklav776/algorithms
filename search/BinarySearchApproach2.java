package com.java.algorithms.search;

import java.util.Arrays;

public class BinarySearchApproach2 {

	public static void main(String[] args) {

		int[] arr = { 20, 78, 44, 23, 6, 82, 328, 58, 16, 23 };
		int ele = 16;
		Arrays.sort(arr);
		int pos = -1, min = 0, max = arr.length, mid = (min + max) / 2;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int index = binarySearch(arr, 0, arr.length - 1, ele);

		if (index == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println(index);
		}

	}

	private static int binarySearch(int[] arr, int l, int r, int ele) {

		if (r >= l) {
			int mid = l + (r - l) / 2;

			if (ele == arr[mid]) {
				return mid;
			}

			if (arr[mid] > ele)
				return binarySearch(arr, l, mid - 1, ele);

			return binarySearch(arr, mid + 1, r, ele);
		}
		return -1;
	}

}
