package DSA.DailyWeeklyClassProblems.week8.DailyClass;

import java.util.Arrays;

import org.junit.Test;

public class LC_189_RotateArray {

	/*
	 * Question here !! https://leetcode.com/problems/rotate-array/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
	}

	@Test // edge
	public void example2() {
		int[] nums = { -1, -100, 3, 99 };
		int k = 2;
		rotate(nums, k);
	}

//SC: O(n), TC-O(n)

	public void rotate(int[] nums, int k) {
		int n = nums.length;
		if (n != 0 && n != 1) {
			if (n < k) {
				k = k % n;
			}
			int[] temp = new int[n];
			int index = 0;
			for (int i = n - k; i < nums.length; i++) {
				temp[index++] = nums[i];
			}

			for (int i = 0; i < nums.length - k; i++) {
				temp[index++] = nums[i];
			}

			for (int i = 0; i < temp.length; i++) {
				nums[i] = temp[i];
			}
			System.out.println(Arrays.toString(nums));
		}
	}

	//SC: O(n), TC-O(1)

	public static void reverse(int nums[], int start, int end) {
		// While start index is less than end index
		while (start < end) {
			// Swap elements at start and end indices
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			// Increment start index and decrement end index
			start++;
			end--;
		}
	}

	public void rotate1(int[] nums, int k) {
		// Ensure k is within array bounds
		k %= nums.length;
		// Reverse entire array
		reverse(nums, 0, nums.length - 1);
		// Reverse first k elements
		reverse(nums, 0, k - 1);
		// Reverse remaining elements
		reverse(nums, k, nums.length - 1);
	}
}
