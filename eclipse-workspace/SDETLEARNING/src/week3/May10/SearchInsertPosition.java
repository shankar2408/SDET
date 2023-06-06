package week3.May10;

import java.util.Iterator;

import org.junit.Test;

public class SearchInsertPosition {

	/*
	 * 35. Search Insert Position
	 * https://leetcode.com/problems/search-insert-position/description/
	 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
	 */
//	@Test
//	public void example() {
//		int[] nums = { 1, 3, 5, 6 };
//		int target = 5;
//		System.out.println(searchIntertOfPosition(nums, target));
//
//	}

	@Test
	public void example1() {
		int[] nums = { 1, 3, 5, 6 ,8};
		int target = 7;
		System.out.println(searchIntertOfPosition(nums, target));

	}

	private int searchIntertOfPosition(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return left;

	}

}