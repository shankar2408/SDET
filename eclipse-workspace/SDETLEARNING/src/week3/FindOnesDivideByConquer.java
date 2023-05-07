package week3;

import org.junit.Test;

public class FindOnesDivideByConquer {

	/*
	 * Question here !! FindOnesDivideByConquer a binary sorted Array and find the
	 * no of1's
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 0, 0, 0, 1, 1 ,1};
		bruteForce(nums);
		//System.out.println(one(nums));
	}

	/*
	 * Brute force !! Psuedo code here: 2 Index (left at 0 and right at length-1)
	 * Conditions for the problems Find the mid => (left + right) / 2 (and divide
	 * into half) If mid is the point where we see the 1st one calculate the length
	 * from mid to arr.length as number of 1s If mid=0, left = mid+1 If mid = 1,
	 * right = mid-1
	 * 
	 */

	private void bruteForce(int[] arr) {
		if (arr == null || arr[arr.length - 1] == 0) {
			System.out.println(0);
			return;
		} else if (arr[0] == 1) {
			System.out.println(arr.length);
			return;
		}

		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] == 1 && arr[mid - 1] == 0) {
				System.out.println(arr.length - mid);
				break;
			} else if (arr[mid] == 0 && arr[mid + 1] == 1) {
				System.out.println(arr.length - mid - 1);
				break;
			} else if (arr[mid] == 0) {
	          start = mid + 1;
	        } else if (arr[mid] == 1) {
	          end = mid - 1;
			}

		}

	}
	
	public int one(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = (left + right) / 2;
			if (nums[mid] == 1) 
				right = mid;
			else left = mid + 1;		
		}

		return nums[right] == 0 ? 0 : nums.length - right;

	}

}
