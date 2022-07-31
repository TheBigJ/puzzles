package com.puzzle.Strings;

public class ReverseString {

	public static void main(String[] args) {
		String inputString = "abhijeet";
		String outPutString = reverseStringRecursion(inputString);
		System.out.println(outPutString);
	}

	private static String reverseStringLoop(String inputString) {
		if(inputString == null || inputString.length() == 1) {
			return inputString;
		}
		String result = "";
		for(int i = inputString.length()-1; i >= 0; i--) {
		   result =  result + inputString.charAt(i)  ;
		}
		return result;
	}
	
	private static String reverseStringRecursion(String inputString) {
		if(inputString == null || inputString.length() == 1) {
			return inputString;
		}
		return inputString.substring(inputString.length()-1) + reverseStringRecursion(inputString.substring(0, inputString.length()-1));
	}

}
