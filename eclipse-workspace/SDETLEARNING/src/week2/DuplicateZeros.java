package week2;

import java.util.Arrays;

import org.junit.Test;

public class DuplicateZeros {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/duplicate-zeros/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums= {1,0,2,3,0,4,5,0};
		bruteForce(nums);
		

	}

	@Test // edge
	public void example2() {
		int[] nums= {1,2,3};
		bruteForce(nums);
		
	}

	@Test // negative
	public void example3() {
		int[] nums= {0,0,1};
		bruteForce(nums);
		
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * decalre new array output and count=0
	 *    create an new int array - length as original array 
    iterate the original 
    if arr[i] == 0 , update output[count++]=nums[i] and output[count++] = 0
    else update output[count++]=nums[i]
    use while loop to iterate and store the output value to nums
	 * 
	 */
/*
 * 
Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
 */
	
	//Time complexity-O(n)
	private void bruteForce(int[] nums) {

		int[] output=new int[nums.length];
		int count=0;
		for(int i=0; i<nums.length; i++) {
			if(count>=nums.length) {
				break;
			}
			if(nums[i]==0) {
				output[count++]=nums[i];
				if(count>=nums.length) {
					break;
				}
				output[count++]=0;
			}else {
				output[count++]=nums[i];
			}
			
			
		}

		int i=0;
		while(i<nums.length) {
			nums[i]=output[i];
			i++;
		}
		System.out.println(Arrays.toString(nums));

	}

	

}
