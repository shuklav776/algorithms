package com.java.algorithms.search;

public class LinearSearch {

	public static void main(String[] args) {

		int[] arr = { 20, 78, 44, 23, 6, 82, 328, 58, 16 };
		int element = 11;

		int left = 0, len = arr.length, right = len - 1, position = -1;

		for (; left <= right;) {
			if (arr[left] == element) {
				position = left+1;
				System.out.println("Left position: " + position);
				break;
			}
			if (arr[right] == element) {
				position = right+1;
				System.out.println("Right position: " + position);
				break;
			}
			left++;
			right--;
		}
		if (position == -1) {
			System.out.println("Not Found");
		}
	}
}
