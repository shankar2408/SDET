package week2;

import java.util.Arrays;

import org.junit.Test;

public class ThirdMaxNum {
	/*
	 * Question here !! https://leetcode.com/problems/third-maximum-number/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {4, 6, 2, 5};
		System.out.println(bruteForce(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 1, 9 };
		System.out.println(bruteForce(nums));
	}

	@Test // negative
	public void example3() {
		int[] nums = { 2, 2, 3, 1 };
		System.out.println(bruteForce(nums));
	}

	/*
	 * Brute force !! Psuedo code here: declare max1=0 max2=0 max3=0 use for loop
	 * for iteration if(num>max1), max1=num; return max 3 if no max 3 then return
	 * max1
	 */

	//leetcode answer
	private int bruteForce(int[] nums) {
		Integer max1 = null;
		Integer max2 = null;
		Integer max3 = null;
		for (Integer n : nums) {
			if (n.equals(max1) || n.equals(max2) || n.equals(max3))
				continue;
			if (max1 == null || n > max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (max2 == null || n > max2) {
				max3 = max2;
				max2 = n;
			} else if (max3 == null || n > max3) {
				max3 = n;
			}
		}
		return max3 == null ? max1 : max3;
	}
}