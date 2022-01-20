package com.java.algorithms.search;

import java.util.Arrays;

public class JumpSearch {

	public static void main(String[] args) {

		int[] arr = { 20, 78, 44, 23, 6, 82, 328, 58, 16, 23 };
		int ele = 6;
		Arrays.sort(arr);
		int index = jumpSearch(arr, ele);
		if (index == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println(index);
		}
	}

	private static int jumpSearch(int[] arr, int ele) {
		int n = arr.length;
		int step = (int) Math.floor(Math.sqrt(n));
		int prev = 0;
		while (arr[Math.min(step, n) - 1] < ele) {
			prev = step;
			step += (int) Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}
		while (arr[prev] < ele) {
			prev++;
			if (prev == Math.min(step, n))
				return -1;
		}
		if (arr[prev] == ele)
			return prev;
		return -1;
	}

}
