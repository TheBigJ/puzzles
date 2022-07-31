package com.puzzle.slidingWindow;

import java.util.Arrays;

public class MaximunSubArraySizeN {

	public static void main(String[] args) {
		int arrayOfSize = 3;
		int input_array[] = { 2, 1, 5, 1, 3, 2 };
		int maxSum = 0;
		int sum = 0;
		int slideWindow = 0;

		System.out.println("size: " + arrayOfSize);
		System.out.println("Input array: " + Arrays.toString(input_array));

		if (input_array.length < arrayOfSize) {
			System.out.println("Input size is greater then array size.");
		}
		for (int i = 0; i < input_array.length; i++) {
			if (i < arrayOfSize) {
				sum = sum + input_array[i];
				maxSum = sum;
				continue;
			}
			
			sum = sum + input_array[i] - input_array[slideWindow];
			slideWindow++;
			if (maxSum < sum) {
				maxSum = sum;
			}
		}
		System.out.println("MaxSum: " + maxSum);

	}

}
