package week1.daily.practice;

import org.junit.Test;

public class PowerOfTwo {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/power-of-two/
	 * Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
	 */

	@Test // +ve
	public void example1() {
		int n=4096;
		System.out.println(isPowerOfTwo(n));
		

	}

	@Test // edge //2^0=1
	public void example2() {
		int n=1;
		System.out.println(isPowerOfTwo(n));
	}

	@Test // negative
	public void example3() {
		int n=300;
		System.out.println(isPowerOfTwo(n));
	}
	
	@Test // negative
	public void example4() {
		int n=0;
		System.out.println(isPowerOfTwo(n));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

		public boolean isPowerOfTwo(int n) {
	        // Check if n is 0, in which case it cannot be a power of 2, so return false
	        //System.out.println("n value is:"+n);
			if (n == 0) {
	            return false;
	        }
	        
	        // Check if n is 1, in which case it is a power of 2, so return true
	        if (n == 1) {
	            return true;
	        }
	        
	        // Check if n is odd, in which case it cannot be a power of 2, so return false
	        if (n % 2 != 0) {
	            return false;
	        }
	        
	        // If n is even, recursively call the function with n/2 until n becomes 1 or an odd number
	        return isPowerOfTwo(n / 2);
	    }
		
		

}



