package com.puzzles.twoPointer;

import java.util.Arrays;

public class SquaringSortedArray {

	public static void main(String[] args) {
		int[] input_array = { -3, -1, 0, 1, 2 };
		int[] out_array = new int[input_array.length];
		int left_index = 0;
		int right_index = input_array.length - 1;
		int higest_index = input_array.length - 1;
		for (int i = 0; i < input_array.length; i++) {
			int leftValue = input_array[left_index] * input_array[left_index];
			int rightValue = input_array[right_index] * input_array[right_index];
			if (left_index <= right_index) {
				if (rightValue > leftValue) {
					out_array[higest_index--] = rightValue;
					right_index--;
				} else {
					out_array[higest_index--] = leftValue;
					left_index++;
				}
			}
		}
		System.out.println(Arrays.toString(out_array));
	}

}
