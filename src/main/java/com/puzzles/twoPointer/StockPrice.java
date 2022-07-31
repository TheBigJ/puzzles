package com.puzzles.twoPointer;

/**
 * 
 * Any given day, once single transaction.
 * @author abhijeets
 *
 */
public class StockPrice {

	public static void main(String[] args) {
		//{98,23,18,17,34,87,20}; // {7,6,4,3,1} //{7,1,5,3,6,4}
		int input_array[] = {98,23,18,17,34,87,20};
		
		if(input_array.length == 1) {
			System.out.println("Please provide valid input.");
		}else {
			int min_value = input_array[0];
			int max_profit = 0;
			int profit = 0;
			
			for(int i=1; i<input_array.length; i++) {
				 profit = input_array[i] - min_value;
			  if(max_profit < profit) {
				  max_profit = profit;
				  
			  }
			  if(input_array[i] < min_value) {
				  min_value = input_array[i];
			  }
			}
			System.out.println("Profit: " + max_profit);
		}
	}

}
