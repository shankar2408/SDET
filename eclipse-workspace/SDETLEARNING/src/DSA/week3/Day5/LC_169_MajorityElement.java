package DSA.week3.Day5;

import java.util.Arrays;

import org.junit.Test;

public class LC_169_MajorityElement {
	/*
	 * Question here !! https://leetcode.com/problems/majority-element/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 3, 2, 3 };
		System.out.println(majorityElement(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));
	}

	/*
	 * Brute force !! Psuedo code here:
	 * 
	 * 
	 */

	public int majorityElementFormula(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		Arrays.sort(nums);
		return nums[nums.length / 2];
	}

	public int majorityElement(int[] nums) {
		int count = 0, maxElement = 0;
		for (int num : nums) {
			if (count == 0) {
				maxElement = num;
			}
			if (num == maxElement) {
				count++;
			} else {
				count--;
			}
		}

		return maxElement;
	}
	
	public int majorityElementBF(int[] nums) {
        int count=0;
        int max=0;
        int val=-1;
        for(int i=0; i<nums.length; i++){
            count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    
                    count++;
                    if(count>max){
                        max=count;
                        val=nums[i];
                    }
                }
            }
        }
        return val;
    }

}
