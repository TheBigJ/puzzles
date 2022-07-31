package com.puzzle.FastAndSlowPointer;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int []nums = {1,2,3,0,5,6}; //{1,2,3,0,5,6} //{0,1,0,3,12}
        int i =0;
        int j  = 1;
		while(j<nums.length) {
			if(nums[i] != 0) {
				i++;
			}else if(nums[i] == 0 && nums[j] != 0) {
				int num = nums[i];
				nums[i] = nums[j];
				nums[j] = num;
				i++;
			} 
			j++;
		}
		System.out.println(Arrays.toString(nums));
	}

}
