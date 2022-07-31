package com.puzzle.arrays;

import java.util.Arrays;

public class RotateByK {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k = 3;
		
		System.out.print(Arrays.toString(rotateByK(nums, k)));
		
	}
	
	public static int[] rotateByK(int[] nums, int k) {
        k = defineKWithinRange(k, nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
        int array_length = nums.length-1;   
        reverseArray(0, array_length, nums);
        reverseArray(0, k-1, nums);
        reverseArray(k, array_length, nums);
        return nums;
   }
   
   private static void reverseArray(int from, int to, int[] nums){
      while(from < to){
          int num = nums[from];
           nums[from] =  nums[to];
           nums[to] = num;
          from++;
          to--;
      }  
   }
   
   private static int defineKWithinRange(int k, int length){
       if( k > length){
           k = k - length;
           return defineKWithinRange(k, length);
       } else {
           return k;
       }
       
   }
}
