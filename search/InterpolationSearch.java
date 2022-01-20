package com.java.algorithms.search;

import java.util.Arrays;

public class InterpolationSearch {

	public static void main(String[] args) {

		int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47 };

		int n = arr.length;
		int x = 18;
		int index = interpolationSearch(arr, 0, n - 1, x);
		if (index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found.");

	}

	private static int interpolationSearch(int[] arr, int lo, int hi, int ele) {
		int pos;
		if (lo <= hi && ele >= arr[lo] && ele <= arr[hi]) {

			pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (ele - arr[lo]));

			if (arr[pos] == ele)
				return pos;
			if (arr[pos] < ele)
				return interpolationSearch(arr, pos + 1, hi, ele);
			if (arr[pos] > ele)
				return interpolationSearch(arr, lo, pos - 1, ele);
		}

		return -1;
	}

}
