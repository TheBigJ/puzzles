package com.puzzle.arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6};
		
		int i = 0;
		int j = nums.length-1;
		
		while(i<j) {
			int temp  = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
			
		}

		 System.out.println(Arrays.toString(nums));
	}

}
