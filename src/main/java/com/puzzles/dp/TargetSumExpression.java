package com.puzzles.dp;

public class TargetSumExpression {

	public static void main(String[] args) {

		int[] nums = { 1, 1, 1, 1, 1 };
		int target = 3;
		int count = countSumExpression(nums, target, 0, 0);
		System.out.println(count);
	}

	private static int countSumExpression(int[] nums, int target, int sum, int pos) {
		if (nums.length == pos) {
			return target == sum ? 1 : 0;
		}
		return countSumExpression(nums, pos + 1, sum + nums[pos], target)
				+ countSumExpression(nums, pos + 1, sum + -nums[pos], target);
	}

}
