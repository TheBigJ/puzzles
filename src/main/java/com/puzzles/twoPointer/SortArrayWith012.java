package com.puzzles.twoPointer;

import java.util.Arrays;

/*
 * The flag of the Netherlands consists of three colors: red, white and blue; 
 * and since our input array also consists of three different numbers 
 * that is why it is called Dutch National Flag problem.
 * 
 */
public class SortArrayWith012 {

	public static void main(String[] args) {
		int[] input_array = { 2, 2, 0, 1, 2, 0 };
		int low = 0;
		int high = input_array.length - 1;
		for (int i = 0; i < input_array.length; i++) {
			if (low <= high) {
				int lowValue = input_array[low];
				int highValue = input_array[high];
				if (lowValue == 0 || highValue == 2) {
					if (lowValue == 0)
						low++;
					if (highValue == 2)
						high--;
					continue;
				}
				if (lowValue == 2) {
					input_array[high] = lowValue;
					high--;

					input_array[low] = highValue;
					if (highValue == 0) {
						low++;
					}
				}
				if (lowValue == 1) {
					input_array[low] = highValue;
					if (highValue == 0) {
						low++;
					}
					input_array[high] = lowValue;
				}
			}
		}
		System.out.println(Arrays.toString(input_array));
	}

}
