package week6;

import org.junit.Test;

public class RiverRecordsAssessment {
	/*
	 * Question here !!
	 * Given an array of integers, without reordering, determine the maximum
difference between any element and any prior smaller element. If there
is never a lower prior element, return -1.
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {5, 3, 6, 7, 4};
		System.out.println(maxDiff(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = {2, 3, 10, 2, 4, 8, 1 };
		System.out.println(maxDiff(nums));
	}

	@Test // negative
	public void example3() {
		int[] nums = { 7, 9, 5, 6, 3, 2 };
		System.out.println(maxDiff(nums));
	}


	private int bruteForce(int[] nums) {
		int max=-1;
		int val=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[j]>nums[i]) {
					val=nums[j]-nums[i];
					if(val>max) {
						max=val;
					}
				}
			}
		}
		return max;
	}

	public int maxDiff(int[] ar){

	    int ans = -1;
	    int min = Integer.MAX_VALUE;

	    for(int i = 0; i < ar.length; i++){
	        min = Math.min(min, ar[i]);
	        if(ar[i] > min) 
	        ans = Math.max(ans, ar[i] - min);
	    }

	    return ans;
	}
}
