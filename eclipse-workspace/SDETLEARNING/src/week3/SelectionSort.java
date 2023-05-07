package week3;

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
	 * 
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
			arr[minLoc]=(arr[minLoc]+arr[i])-(arr[i]=arr[minLoc]);
			System.out.println(Arrays.toString(arr));
		}
		
		
		return arr;
	}

	

}