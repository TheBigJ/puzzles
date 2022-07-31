package com.puzzle.slidingWindow;

public class LongestSubstringKDistinct {
	/*
	 * 
	 * Variation 
	 * Problem 1:
	 * Fruits into Baskets This problem follows the Sliding Window pattern and
	 * is quite similar to Longest Substring with K Distinct Characters. In this
	 * problem, we need to find the length of the longest subarray with no more than
	 * two distinct characters (or fruit types!). This transforms the current
	 * problem into Longest Substring with K Distinct Characters where K=2.
	 * 
	 * Problem 1: 
	 * Longest Substring with at most 2 distinct characters
	 */
	public static void main(String[] args) {
		int kDistinct = 3;
		String input_array = "cbbebi";
		String trial = "";
		String finalString = "";
		int containsCount = 0;

		for (int i = 0; i < input_array.length(); i++) {
			if (containsCount < kDistinct) {
				if (!trial.contains(input_array.charAt(i) + "")) {
					containsCount++;
				}
				trial = trial + input_array.charAt(i);
				continue;
			}
			if (trial.contains(input_array.charAt(i) + "")) {
				trial = trial + input_array.charAt(i);
				if (trial.length() > finalString.length()) {
					finalString = trial;
				}
			} else {
				trial = "";
				trial = trial + input_array.charAt(i);
				containsCount = 1;
			}
		}
		System.out.println("Result: " + finalString.length());
		System.out.println("Result String: " + finalString);
	}
}
