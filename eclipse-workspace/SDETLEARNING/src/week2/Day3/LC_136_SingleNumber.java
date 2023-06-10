package week2.Day3;

import org.junit.Test;

public class LC_136_SingleNumber {

	/*
	 * Question here !! https://leetcode.com/problems/single-number/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 2, 2, 1,1,3 };
		System.out.println(bruteForce(nums));

	}

	@Test // edge
	public void example2() {
		int[] nums = {2,4, 1, 2, 1, 2 };
		System.out.println(bruteForce(nums));

	}

	@Test // negative
	public void example3() {
		int[] nums = { 1 };
		System.out.println(bruteForce(nums));

	}

	/*
	 * Brute force !! Psuedo code here:
	 * use 2 for loop for comaparing each element with other element
	 * if element match increase count++
	 * return the count==1 element value 
	 * 
	 */

	private int bruteForce(int[] nums) {
		
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			
			for (int j =0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}

			}if(count==1) {
				return nums[i];
			}

		}
		return 0;

	}
}
