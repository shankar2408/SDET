package DSA.mandatoryHomeWork.week2.Day5;

import java.util.Arrays;

import org.junit.Test;

public class LC_88_MergeSortedArray {
	/*
	 * Question here !! https://leetcode.com/problems/merge-sorted-array/
	 */

	@Test // +ve
	public void example1() {
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };
		int m = 3;
		int n = 3;

		//merge(nums1, m, nums2, n);
		merge1(nums1, m, nums2, n);

	}

	@Test // edge
	public void example2() {
		int[] nums1 = { 1 };
		int[] nums2 = {};
		int m = 1;
		int n = 0;

		//merge(nums1, m, nums2, n);
		merge1(nums1, m, nums2, n);

	}

	@Test // negative
	public void example3() {
		int[] nums1 = { 0 };
		int[] nums2 = { 1 };
		int m = 0;
		int n = 1;

		//merge(nums1, m, nums2, n);
		merge1(nums1, m, nums2, n);

	}

	/*
	 * Brute force !! Psuedo code here:
	 * 
	 * 
	 */
//int[] nums1 = {1,2,3,0,0,0}; int[] nums2 = {2,5,6};
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] output = new int[nums1.length];
		int c = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] != 0) {
				output[c++] = nums1[i];
			}
		}
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] != 0) {
				output[c++] = nums2[i];
			}
		}

		Arrays.sort(output);

		for (int i = 0; i < output.length; i++) {
			nums1[i] = output[i];
		}

		System.out.println(Arrays.toString(nums1));

	}

	public void merge1(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (j >= 0) {
			if (i >= 0 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
		System.out.println(Arrays.toString(nums1));

	}
}
