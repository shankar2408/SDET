package daily.practice;

import java.util.Arrays;

import org.junit.Test;

public class PlusOneArray {/*
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
	 * 
	 * 
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
		    int[] newNumber = new int [n+1];
		    newNumber[0] = 1;
		    
		    return newNumber;

	}

	private void twoPointer() {

	}

}
