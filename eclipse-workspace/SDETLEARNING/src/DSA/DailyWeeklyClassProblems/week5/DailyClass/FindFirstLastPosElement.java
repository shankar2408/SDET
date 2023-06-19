package DSA.DailyWeeklyClassProblems.week5.DailyClass;

import java.util.Arrays;

import org.junit.Test;

public class FindFirstLastPosElement {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-
	 * sorted-array/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 6;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}

	@Test // negative
	public void example3() {
		int[] nums = {};
		int target = 0;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}

	/* PseudoCode:
    intialize left and right pointers
    Temp variable tp store the mid value
    Initialse a boolean flag 

    if mid = target check the flag = false 
    assign the mid value to temp 
    set mid-1 = right 

    else set mid+1 = left and update temp value 

 
   */
 
	public int[] searchRange(int[] nums, int target) {

	       
	      int leftIndex = findIndex(nums,target,false);
	      int rightIndex = findIndex(nums,target,true);
	      

	     return new int[]{leftIndex,rightIndex};

	        
	    }

	    public int findIndex(int[] nums , int target , boolean flag){

	        int left = 0;
	        int right = nums.length-1;
	        int temp = -1 ;

	        while(left<=right){
	         int mid = (left+right)/2;

	         if(nums[mid]==target){
	             temp = mid;
	             if(flag==false) right = mid-1;
	             else left = mid+1;
	         } else if(nums[mid]>target){
	             right = mid-1;
	         }else left = mid+1;

	        }
	      return temp;
	    }
	}
