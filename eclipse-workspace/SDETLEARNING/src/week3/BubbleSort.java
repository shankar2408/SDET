package week3;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSort {
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
		for(int i=0; i<arr.length; i++) {
			boolean swap=false;
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					arr[j]=(arr[j]+arr[j+1])-(arr[j+1]=arr[j]);
					swap=true;
				}
			}
			if(!swap) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		return arr;

	}

	

}