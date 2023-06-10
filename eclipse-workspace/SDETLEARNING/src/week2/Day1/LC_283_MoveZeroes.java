package week2.Day1;

import java.util.Arrays;

import org.junit.Test;

public class LC_283_MoveZeroes {
	
	/*
	 * Question here !!
	 * move all zeros to right of the number array by maintaining the order
	 */

	@Test // +ve
	public void example1() {
		int[] num= {0,1,0,3,12};
		System.out.println(Arrays.toString(twoPointer(num)));
		System.out.println(Arrays.toString(bruteForce(num)));

	}

	@Test // edge
	public void example2() {
		int[] num= {0};
		System.out.println(Arrays.toString(twoPointer(num)));
		System.out.println(Arrays.toString(bruteForce(num)));
	}

	@Test // negative
	public void example3() {
		int[] num= {4,2,4,0,0,3,0,5,1,0};
		System.out.println(Arrays.toString(twoPointer(num)));
		System.out.println(Arrays.toString(bruteForce(num)));

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * decalre j=0
	 * use for loop for i iteration
	 * if num[i] is not equal to 0 -> add it in num[j++] array (if value is not filled in array, it will convert it as 0)
	 * return num
	 */

	private int[] bruteForce(int[] num) {
		int j=0;
		for(int i=0; i<num.length-1; i++) {
			if(num[i]!=0) {
				num[j++]=num[i];
			}
		}

		return num;

	}
	/* 
	 * 2 pointer !!
	 * Psuedo code here:
	 * declare left=0 and right in for loop iteration
	 * if right is not zero then swap left and right and do left increment
	 * 
	 * print num
	 */
	
	private int[] twoPointer(int[] num) {
		int left=0;
		for(int right=0; right<num.length; right++) {
			if(!(num[right]==0)) {
				int temp = num[left];
				num[left]=num[right];
				num[right]=temp;
				left++;
			}	
		}
		return num;

	}

}


