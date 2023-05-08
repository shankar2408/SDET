package week3.SlidingWindow;

import org.junit.Test;

public class MaximumAverageSubarray {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/maximum-average-subarray-i/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(findMaxAverage(nums,k));
	}

	@Test // edge
	public void example2() {
		int[] nums = {5};
		int k=1;
		System.out.println(findMaxAverage(nums,k));
	}

	

	/* 
	 * Psuedo code here: The approach is to make a window sized k and
	 * calculate the average (currAvg ) and store the max average using the Math.max
	 * method. Put a if condition to keep check on the window size. Substract the
	 * 1st element of the previous window to move the window forward.
	 * Time complexity: O(n)
	 */

	public double findMaxAverage(int[] arr, int k) {
	      double maxAvg = Integer.MIN_VALUE; 
	      double currAvg = 0;
	      double currsum = 0;
	         
	      for(int i = 0; i<arr.length; i++) { // iterate the array.
	          
	          currsum += arr[i]; // adding the elements.

	          if(i>=k-1) {      // keeping check at the window.
	            currAvg = currsum/k;    // Calculating Average.
	            maxAvg = Math.max(maxAvg,currAvg);  // Storing the maxAvg.
	            currsum -= arr[i-(k-1)];    //Substract the first element of the prev window.
	          }
	      } 
	      return maxAvg;
	    }
	}





