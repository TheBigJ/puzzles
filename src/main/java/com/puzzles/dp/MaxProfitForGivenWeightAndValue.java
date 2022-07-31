package com.puzzles.dp;

public class MaxProfitForGivenWeightAndValue {

	public static void main(String[] args) {
		int[] value =  { 1, 2, 3, 4, 5 };
		int[] weight = { 1, 3, 5, 7, 2 };
		int size = 10;
		int length = value.length;
		System.out.println(maxProfit(value, weight, size, length));
	}

	private static int maxProfit(int[] values, int[] weights, int size, int length) {
		if(size == 0 || length ==0) {
			return 0;
		}
		if(weights[length-1] > size) {
			return maxProfit(values, weights,size,length-1);
		} else {
			return Math.max(values[length-1] + maxProfit(values, weights,size - weights[length-1],length-1), maxProfit(values, weights,size,length-1));
		}
	}
}
