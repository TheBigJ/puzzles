package com.puzzle.FastAndSlowPointer;

public class HappyNumber {

	public static void main(String[] args) {
		
		
		System.out.println("=========================");
		String name = "abhijeet";
		System.out.println(name.substring(name.length()-1));
		int num = 345;
		
		int div = num/10;
		System.out.println(div);
		int remain = num%10;
		System.out.println(remain);
		int div1 = div/10;
		int remain1 = div%10;
		System.out.println(remain1);
		int div2 = div/10;
		int remain2 = div%10;
		System.out.println(remain2);
	}

}
