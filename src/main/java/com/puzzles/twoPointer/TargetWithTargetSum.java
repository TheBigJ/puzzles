package com.puzzles.twoPointer;

import java.util.Arrays;
/*
 * all kind of triplets or pair patterns in array can be resolved by this.
 * If array is un sorted then first sort it and apply similar technique.
 * 
 */

public class TargetWithTargetSum {

	public static void main(String[] args) {
		int[] input_array = { 12, 15, 9, 11 };
		int target = 20;
		int value1 = -1;
		int value2 = -1;
		int index_i = 0;
		Arrays.sort(input_array);
		System.out.println(Arrays.toString(input_array));
		int index_j = input_array.length - 1;
		for (int i = 0; i < input_array.length; i++) {
			if (index_i <= index_j) {
				value1 = input_array[index_i];
				if (index_i != index_j) {
					value2 = input_array[index_j];
					if (value1 + value2 == target) {
						break;
					} else if (value1 + value2 < target) {
						index_i++;
					} else if (value1 + value2 > target) {
						index_j--;
					}
				} else {
					System.out.println("Target not found. ");
					return;
				}
			} else {
				System.out.println("Target not found. ");
				return;
			}
		}

		System.err.println("Output: " + value1 + "," + value2);

	}

}
