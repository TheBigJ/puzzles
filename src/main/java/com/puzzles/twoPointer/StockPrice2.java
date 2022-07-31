package com.puzzles.twoPointer;

/**
 * 
 * Can have any transactions.
 * 
 * @author abhijeets
 *
 */
public class StockPrice2 {

	public static void main(String[] args) {
		// {98,23,18,17,34,87,20}; // {7,6,4,3,1} //{7,1,5,3,6,4}
		int input_array[] = { 98, 23, 18, 17, 34, 87, 20 };

		if (input_array.length == 1) {
			System.out.println("Please provide valid input.");
		} else {
			int max_profit = 0;
			for (int i = 1; i < input_array.length; i++) {
				if (input_array[i-1] < input_array[i]) {
					max_profit = max_profit + input_array[i] - input_array[i - 1];
				}
			}
			System.out.println("Profit: " + max_profit);
		}
	}

}
