package DSA.DailyWeeklyClassProblems.week6.DailyClass;

import org.junit.Test;

public class SearchRotatedSortedArray {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {4,5,6,0,1,2,3};
		int target=4;
		System.out.println(binarySearch(nums,target));
	}

	@Test // edge
	public void example2() {
		int[] nums = {4,5,6,7,0,1,2};
		int target=3;
		System.out.println(binarySearch(nums,target));
	}

	@Test // negative
	public void example3() {
		int[] nums = {1};
		int target=0;
		System.out.println(binarySearch(nums,target));
	}

	

	public int search(int[] nums, int target) {

        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }

        }
       return -1; 
    }
	
	public int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[left] <= nums[mid]) {  // If the Left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {  // If the Right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;  // when the Target element is not found
    }


}
