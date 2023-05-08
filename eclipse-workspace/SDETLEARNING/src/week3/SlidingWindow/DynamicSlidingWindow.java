package week3.SlidingWindow;

import java.util.Arrays;

import org.junit.Test;

public class DynamicSlidingWindow {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {1,2,3,2,1};
		int k=7;
		System.out.println(Arrays.toString(bruteForce(nums,k)));
		dynamicSlidingWindow(nums,k);
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	private int[] bruteForce(int[] nums, int k) {
		int sum=0;
		
		for(int i=0; i<nums.length; i++) {
			sum=0;
			if(sum==k) {
				return new int[]{i,i};
			}
			for(int j=i; j<nums.length; j++) {
				sum=sum+nums[j];
				if(sum==k) {
					return new int[]{i,j};
				}
			}
			
		}
		return new int[] {-1, -1};
		
	}
	
	private void dynamicSlidingWindow(int[] arr, int k) {
		int sum=0;
		int start=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
			if(checkAndPrintArr(arr,start,i,sum,k)){
				break;
			}else if(sum>k) {
				while(sum>k && start <=i) {
					sum=sum-arr[start++];
				}
				if(checkAndPrintArr(arr,start,i,sum,k)){
					break;
				}
			}
		}
	}


	private boolean checkAndPrintArr(int[] arr, int start, int end, int sum, int k) {
		if(sum==k) {
			for(int i=start; i<=end; i++) {
				System.out.println(arr[i]+",");
			}
			return true;
		}
		return false;
	}

	
}
