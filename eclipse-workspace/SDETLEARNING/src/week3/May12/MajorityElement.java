package week3.May12;

import java.util.Arrays;

import org.junit.Test;

public class MajorityElement {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/majority-element/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {3,2,3};
		System.out.println(majorityElement(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = {2,2,1,1,1,2,2 };
		System.out.println(majorityElement(nums));
	}

	

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	public int majorityElementFormula(int[] nums) {
        if (nums.length == 1) 
        {
            return nums[0];
        }
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
	
	public int majorityElement(int[] nums) {
        int majority_index = 0;
        int count = 1;
        for (int i=1; i < nums.length; i++){
            count += nums[i] == nums[majority_index] ? 1 : -1;

            if (count == 0){
                majority_index = ++i;
                count++;
            }
        }
        return nums[majority_index];
    }

}
