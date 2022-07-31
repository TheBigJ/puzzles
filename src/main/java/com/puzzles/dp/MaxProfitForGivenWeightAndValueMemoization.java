package com.puzzles.dp;

import java.util.Arrays;

public class MaxProfitForGivenWeightAndValueMemoization {
	static int [][] dp = new int[6][41];
	public static void main(String[] args) {
		int[] value =  { 10, 20, 30, 40};
		int[] weight = { 30, 10, 40,20 };
		int size = 40;
		int length = value.length;
		
		for(int[] row: dp) {
		 Arrays.fill(row, -1);
		}
		System.out.println(maxProfit(value, weight, size, length));
	}

	private static int maxProfit(int[] values, int[] weights, int size, int length) {
	
		if(size == 0 || length ==0) {
			return 0;
		}
		if(	dp[length][size] != -1) {
			return dp[length][size];
		}
		if(weights[length-1] > size) {
			return  (dp[length][size] = maxProfit(values, weights,size,length-1));
		} else {
			return (dp[length][size] = Math.max(values[length-1] + maxProfit(values, weights,size - weights[length-1],length-1), maxProfit(values, weights,size,length-1)));
		}
	}
}
