package week2;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElement {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/remove-element/
	 */

	@Test // +ve
	public void example1() {
     int[] nums = {3,2,2,3};
     int val=2;
     System.out.println(bruteForce(nums,val));
	}

	@Test // edge
	public void example2() {
	     int[] nums = {0,1,2,2,3,0,4,2};
	     int val=2;
	     System.out.println(bruteForce(nums,val));
	}

	@Test // negative
	public void example3() {

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * declare j=0;
	 * Use for loop for i iteration
	 * if(num[i]!=val)-> num[j++]=num[i];
	 * return j
	 */
//time complexity-O(n)
	private int bruteForce(int[] nums, int val) {
		int j=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=val) {
				nums[j++]=nums[i];
			}
		}System.out.println(Arrays.toString(nums));
		return j;
	}
}

