package week1.Day5;

import java.util.Arrays;
import java.util.*;

import org.junit.Test;

public class DistinctNumber {
	
	/*
	 * Question here !!
	 * Find distinct number
	 */

	@Test // +ve
	public void example1() {
		int arr[]= {1,2,3,3,3,4,9,9};
		bruteForce(arr);
		

	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * use for loop for iteration 
	 * if(num[i]!=num[i+1]), sysout nums[i]
	 * After the for loop, sysout num.length-1 to print the last value
	 * 
	 * TC: O(n)
	 * SC: O(1)
	 */
	
	

	private void bruteForce(int[] num) {
		if(num.length<=1) {
			System.out.println(Arrays.toString(num));
		}
		
		for(int i=0; i<num.length-1; i++) {
			if(num[i]!=num[i+1]) {
				System.out.println(num[i]);
			}
				
			
		}
		System.out.println(num[num.length-1]);

	}
	
	private void bf(int[] num) {
		Set<Integer> set=new TreeSet<>();
		for(int i=0; i<num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set);
		
	}

}



