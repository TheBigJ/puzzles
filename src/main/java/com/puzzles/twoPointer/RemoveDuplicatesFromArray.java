package com.puzzles.twoPointer;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] input_array = { 2, 2, 3, 3, 6, 9, 9 };
		int j = 0;
		for (int i = 0; i < input_array.length; i++) {
			if ((input_array[i] != input_array[j]) && (i != j)) {
				j++;
				input_array[j] = input_array[i];
			} 
		}
		System.out.println(Arrays.toString(input_array) + (j+1));
	}

}
