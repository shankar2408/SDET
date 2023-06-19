package DSA.DailyWeeklyClassProblems.week6.DailyClass;

import org.junit.Test;

public class FindMinRotatedSortedArray {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {3,4,5,1,2};
		System.out.println(findMin1(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(findMin1(nums));
	}

	@Test // negative
	public void example3() {
		int[] nums = {11,13,15,17};
		System.out.println(findMin1(nums));
	}

	public int findMin(int[] nums) {

		int left=0; int right=nums.length-1;
		int min=Integer.MAX_VALUE;
		int val=0;

		while(left<=right) {
			if(nums[left]<nums[right]) {
				val=nums[left++];

			}else {
				val=nums[right--];
			}
			if(min>val) {
				min=val;
			}


		}return min;


	}

	//int[] nums = {3,4,5,1,2};
	public int findMin1(int[] nums) {
		int start=0,end=nums.length-1;

		while (start<end){
			int mid=(start+end)/2;
			if (nums[mid]>nums[end]){
				start=mid+1;
			}
			else {
				end=mid;
			}         
		}
		return nums[start];

	}
}
