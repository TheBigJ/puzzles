package com.puzzles.dp;

public class SubsetSum {
	public static void main(String[] args) {
		int nums[] = {2,3,7,8,10};
		int target  = 5;
		int length =  nums.length;
		System.out.println(findSubSetSum(nums, target, length));
	}

	private static boolean findSubSetSum(int[] nums, int target, int length) {
		if (target == 0) {
			return true;
		}
		if (length == 0) {
			return false;
		}
		if (nums[length - 1] > target) {
			return findSubSetSum(nums, target, length-1);
		} 
		
		return (findSubSetSum(nums, target - nums[length-1], length-1)
					|| findSubSetSum(nums, target, length-1));
		
	}	

}
