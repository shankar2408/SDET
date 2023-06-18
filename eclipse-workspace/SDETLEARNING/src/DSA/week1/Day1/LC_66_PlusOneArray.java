package DSA.week1.Day1;

import java.util.Arrays;

import org.junit.Test;

public class LC_66_PlusOneArray {/*
	 * Question here !!
	 * https://leetcode.com/problems/plus-one/
	 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
	 */

	@Test // +ve
	public void example1() {
		int[] digits= {1,2,3};
		System.out.println(Arrays.toString(bruteForce(digits)));
	}

	@Test // edge
	public void example2() {
		int[] digits= {9};
		System.out.println(Arrays.toString(bruteForce(digits)));


	}

	@Test // negative
	public void example3() {
		int[] digits= {1,9,9};
		System.out.println(Arrays.toString(bruteForce(digits)));


	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * use for loop for backward iteration
	 * if digits[i]>9, increase the value by 1 and return digits
	 * else digits[i]=0
	 * create new array with digits.length+1
	 * digits[0]=1
	 * return digits
	 * 
	 * TC:O(n)
	 * SC:O(n)
	 */

	private int[] bruteForce(int[] digits) {
		 int n = digits.length;
		 //handle 1,2,3
		    for(int i=n-1; i>=0; i--) {
		        if(digits[i] < 9) {
		            digits[i]++;
		            return digits;
		        }
		        //handle 1,9,9
		        digits[i] = 0;
		    }
		    //handle 9
		    digits = new int [n+1];
		    digits[0] = 1;
		    
		    return digits;

	}

	
}
