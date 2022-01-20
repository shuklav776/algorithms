package com.java.algorithms.search;

import java.util.Arrays;

public class BinarySearchApproach1 {

	public static void main(String[] args) {

		int[] arr = { 20, 78, 44, 23, 6, 82, 328, 58, 16, 23 };
		int ele = 328;
		Arrays.sort(arr);
		int pos = -1, min = 0, max = arr.length, mid = (min + max) / 2;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = min; i < max;) {
			if (ele == arr[mid]) {
				pos = mid;
				break;
			}
			if (ele < arr[mid]) {
				max = mid;
				mid = (min + max) / 2;
				if (ele == arr[mid]) {
					pos = mid;
					break;
				}
			}
			if (ele > arr[mid]) {
				min = mid;
				mid = (min + max) / 2;
				if (ele == arr[mid]) {
					pos = mid;
					break;
				}
			}
		}

		if (pos == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println(pos);
		}

	}
}
