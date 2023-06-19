package DSA.mandatoryHomeWork.week2.Day5;

import org.junit.Test;

public class LC_1394_FindLuckyIntegerinanArray {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 2, 2, 3, 4 };
		System.out.println(bruteForce(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 1, 2, 2, 3, 3, 3 };
		System.out.println(bruteForce(nums));
	}

	@Test // negative
	public void example3() {
		int[] nums = { 2, 2, 2, 3, 3 };
		System.out.println(bruteForce(nums));
	}

	/*
	 * Brute force !! Psuedo code here: pseudocode: int[] num=new int[501] for (int
	 * val: arr) { num[val]=num[val]+1; }
	 * decalre max=minimum value
	 * use for loop for temp iteration
	 * if temp[i]==i, max=i;
	 *return max if don't have 0 else return -1 using ternary operator conditon
	 */
//TC=O(n)
	private int bruteForce(int[] nums) {
		int[] temp = new int[501];

		for (int val : nums) {
			temp[val]++;
		}

		int max = Integer.MIN_VALUE;

		for (int i = 0; i <temp.length; i++) {

			if (temp[i] == i) {
				max = i;

			}
		}

		return max == 0 ? -1 : max;
	}
}
