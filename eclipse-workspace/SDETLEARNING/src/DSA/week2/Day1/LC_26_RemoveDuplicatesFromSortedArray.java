package DSA.week2.Day1;

import java.util.Arrays;

import org.junit.Test;

public class LC_26_RemoveDuplicatesFromSortedArray {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
	 *
	 */

	@Test // +ve
	public void example1() {
      int[] nums = {0,0,1,1,1,2,2,3,3,4};
    System.out.println(twoPointer(nums));
	//System.out.println(Arrays.toString(bruteForce(nums)));
	//System.out.println(removeDuplicates(nums));

	}

	@Test // edge
	public void example2() {
		int[] nums = {1,1,2};
	    System.out.println(twoPointer(nums));
		//System.out.println(Arrays.toString(bruteForce(nums)));

	}

	@Test // negative
	public void example3() {
		int[] nums = {-1,-1,2};
	    System.out.println(twoPointer(nums));
		//System.out.println(Arrays.toString(bruteForce(nums)));

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * use for loop for i iteration
	 * declare unique=0;
	 * if num[i]!=num[i+1] then add in num[unique++]=num[i]
	 * return unique for count and for array add new array and pass the unique value and print output
	 * TC-O(n)
	 * SC-O(n)
	 */

	private int[] bruteForce(int[] nums) {
		int unique=0;
		int j=0;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]!=nums[i+1]) {
				unique++;
			}
		}unique++;
		int[] op=new int[unique];
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]!=nums[i+1]) {
				op[j++]=nums[i];
			}
		}
		op[j]=nums[nums.length-1];
		
		
		return op;

	}
	
	//leetcode answer TC-O(n), SC-O(1)
	public int removeDuplicates(int[] nums) {
		
		        
		        int addIndex = 1; //index that unique characters will be inserted at

		        for(int i = 0; i < nums.length - 1; i++) {
		            
		            if(nums[i] != nums[i + 1]){ //if true, num[i + 1] is a new unique number
		              nums[addIndex++] = nums[i + 1];
		            }
		        }
		        return addIndex;
		    }
		
//      int[] nums = {0,0,1,1,1,2,2,3,3,4};

	private int twoPointer(int[] nums) {
		int index=1;
		int left=0;
		for(int right=0; right<nums.length-1; right++) {
			if(nums[left]!=nums[right+1]) {
				nums[index++]=nums[right+1];
				left++;
			}else{
				left++;
			}
		}
		
		return index;

	}

}
