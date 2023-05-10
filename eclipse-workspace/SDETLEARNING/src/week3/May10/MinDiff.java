package week3.May10;

import java.util.Arrays;

import org.junit.Test;

public class MinDiff {
	/*
	 * 1984. Minimum Difference Between Highest and Lowest of K Scores
	 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/
	 */
	
	@Test
	public void example() {
		int[] arr = {9,4,1,7}; //9,4,1,7
		int  k= 2;
		System.out.println(minimumDifference(arr, k));
	}
	@Test
	public void example1() {
		int[] arr = {90};
		int  k= 1;
		System.out.println(minimumDifference(arr, k));
	}

	private int minimumDifference(int[] arr, int k) {
		if (arr.length == 1) {
			return 0;
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int sub = Math.abs(arr[i] - arr[j]);
				min = Math.min(min, sub);
			}
		}
	 	return min;
	}
	
	public int minimumDifference1(int[] arr, int k) {
	    Arrays.sort(arr);
	    int n = arr.length;
	    int minDiff = Integer.MAX_VALUE;
	    for (int i = 0; i <= n-k; i++) {
	        int diff = arr[i+k-1] - arr[i];
	        minDiff = Math.min(minDiff, diff);
	    }
	    return minDiff;
	}

}