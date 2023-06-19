package DSA.DailyWeeklyClassProblems.week3.Sort;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {11,4,17,18,2,22,1,8};
		System.out.println(Arrays.toString(bruteForce(nums)));
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * Low value first
	 * 
	 */

	private int[] bruteForce(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			int minLoc=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[minLoc]>arr[j]) {
					minLoc=j;
				}
			}
			//arr[minLoc]=(arr[minLoc]+arr[i])-(arr[i]=arr[minLoc]);
			
			int temp=arr[minLoc];
			arr[minLoc]=arr[i];
			arr[i]=temp;
			
			System.out.println(Arrays.toString(arr));
		}
		
		
		return arr;
	}
	
	private int[] merge(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int minLoc = findMin(nums, i);
			nums[i] = nums[minLoc];
			nums[minLoc] = temp;
			System.out.println(Arrays.toString(nums));

		}

		return nums;
	}

	public int findMin(int[] nums, int startPos) {
		int min = startPos;

		for (int j = startPos + 1; j < nums.length; j++) {
			if (nums[min] > nums[j])
				min = j;
		}
		return min;

	}

}