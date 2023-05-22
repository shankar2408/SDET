package week5;

import org.junit.Test;

public class MaxConsecutiveOnes {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/max-consecutive-ones/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = {1,0,1,1,0,1 };
		System.out.println(findMaxConsecutiveOnes(nums));
	}

	

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

		public int findMaxConsecutiveOnes(int[] nums) {
		     int max = 0;
		     int count = 0;
		     
				for (int i = 0; i < nums.length; i++) {
					if(nums[i]!=1) {
						count = 0;		
					}else {
						count++;
						max = Math.max(count, max);
					}
				}
				
				return max;
			
		    }
	

	private int[] twoPointer(int[] nums) {
		return nums;

	}

}
