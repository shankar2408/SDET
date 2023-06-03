package week6;

import org.junit.Test;

public class MonotonicArray {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/monotonic-array/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {1,2,2,3};
		System.out.println(isMonotonic1(nums));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 6,5,4,4};
		System.out.println(isMonotonic1(nums));
	}

	@Test // negative
	public void example3() {
		int[] nums = { 1,3,2,6};
		System.out.println(isMonotonic1(nums));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * if nums.length is equal to 1 return true
	 * declare boolean increase decrease as true
	 * use for loop for iterating nums
	 * if nums of current index is greater than next index, set increase as false
	 * if nums of current index is lesser than next index, set decrease as false
	 * return the boolean value either of increase or decrease if come as true
	 */

	public boolean isMonotonic(int[] nums) {
        if(nums.length==1){
            return true;
        }
            boolean increase=true;
            boolean decrease=true;
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i]>nums[i+1])
            increase=false;

            if(nums[i]<nums[i+1])
            decrease=false;
            
        }

        return (increase || decrease);
           
        
    }
	
	public boolean isMonotonic1(int[] nums) {
        if(nums.length==1){
            return true;
        }
            boolean increase=false;
            boolean decrease=false;
        for(int i=0; i<nums.length-1; i++){
            
            if(nums[i]<=nums[i+1]){
                increase=true;
            }else 
            {
                increase=false;
                break;
            }
        }

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>=nums[i+1]){
                decrease=true;
            }else 
            {
                decrease=false;
                break;
            }
        }

        if(increase || decrease){
            return true;
        }else return false;
        
	}
}