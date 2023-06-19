package DSA.mandatoryHomeWork.week2.Day3;

import org.junit.Test;

public class LC_1464_MaximumProductOfTwoElementsInAnArray {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 3, 4, 5, 2 };
		System.out.println(bruteForce(nums));
		System.out.println(twoPointer(nums));

	}

	@Test // edge
	public void example2() {
		int[] nums = { 1, 5, 4, 5 };
		System.out.println(bruteForce(nums));
		System.out.println(twoPointer(nums));

	}

	@Test // negative
	public void example3() {
		int[] nums = { 3, 7 };
		System.out.println(bruteForce(nums));
		System.out.println(twoPointer(nums));

	}

	/*
	 * Brute force !! Psuedo code here: use 2 for loop for iterating i with all j
	 * values declare max=0 to store the calculated max value return max after the
	 * iteration
	 */
//(nums[i]-1)*(nums[j]-1)
	//Time complexity-O(n^2) Sc-O(1)
	private int bruteForce(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] - 1) * (nums[j] - 1) > max) {
					max = (nums[i] - 1) * (nums[j] - 1);
				}
			}
		}
		return max;

	}

	//Time complexity-O(n) SC=O(1)
	public int twoPointer(int[] arr) {
		int i = 0, j = arr.length - 1;
		int maxValue = Integer.MIN_VALUE;
		while (j > i) {
			if (((arr[i] - 1) * (arr[j] - 1)) > maxValue)
				maxValue = (arr[i] - 1) * (arr[j] - 1);

			if (arr[j] >= arr[i])
				i++;
			else if (arr[i] >= arr[j])
				j--;
		}
		return maxValue;
	}
}
