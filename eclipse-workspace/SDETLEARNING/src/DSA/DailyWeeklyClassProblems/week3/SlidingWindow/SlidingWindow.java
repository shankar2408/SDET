package DSA.DailyWeeklyClassProblems.week3.SlidingWindow;

import org.junit.Test;

public class SlidingWindow {
	/*
	 * Question here !!
	 * max sum in 3 length
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {11,1,5,20,3,7,1,50};
		int k=3;
		System.out.println(bruteForce(nums,k));
		slidingWindow(nums,k);
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	private int bruteForce(int[] nums, int k) {
		int sum=0;
		int max=0;
		for(int i=0; i<nums.length-k+1; i++) {
			sum=nums[i]+nums[i+1]+nums[i+2];
			if(sum>max) {
				max=sum;
			}
		}
		
		return max;
	}	
	
	private void slidingWindow(int[] nums, int k) {
		int maxSum=0;
		for(int i=0; i<k; i++) {
			maxSum=maxSum+nums[i];
		}
		int sum=maxSum;
		for(int i=1; i<nums.length-k+1; i++) {
			sum=sum-nums[i-1]+nums[i+k-1];
			//System.out.println(sum);
			if(sum>maxSum) {
				maxSum=sum;
			}
		}
		System.out.println(maxSum);
		
	}

	
}
