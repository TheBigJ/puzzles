package com.puzzle.slidingWindow;

public class NonRepeatSubString {

	public static void main(String[] args) {
		String inputString = "abccde";
		String result = "";
		String finalResult = "";
		for(int i=0; i<inputString.length(); i++) {
			if(!result.contains(inputString.charAt(i) + "")) {
				result = result + inputString.charAt(i);
				if(finalResult.length() < result.length()) {
					finalResult = result;
				}
			} else {
				int j = result.indexOf(inputString.charAt(i));
				result = result.substring(j, result.length());
			}
		}
		System.out.println(finalResult);
		System.out.println(finalResult.length());

	}

}
