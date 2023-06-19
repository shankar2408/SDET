package DSA.mandatoryHomeWork.week6.Day2;

import org.junit.Test;

public class LC_2540_MinimumCommonValue {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/minimum-common-value/
	 */

	@Test // +ve
	public void example1() {
		int[] nums1 = {1,2};
		int[] nums2 = {2};
		System.out.println(optimised(nums1,nums2));
	}

	@Test // edge
	public void example2() {
		int[] nums1 = {1,2,3,6};
		int[] nums2 = {2,3,4,5};
		System.out.println(optimised(nums1,nums2));
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * use 2 for loops and compare nums value with nums1
	 * if matched return the index
	 * 
	 */

	 public int getCommon(int[] nums1, int[] nums2) {
		 for(int i=0; i<nums1.length; i++) {
			 for(int j=0; j<nums2.length; j++) {
				 if(nums1[i]==nums2[j]) {
					 return nums1[i];
				 }
			 }
		 }
		 return -1;
	        
	    }
	 
	 public int optimised(int[] nums1, int[] nums2) {
	     int i=0, j=0;
			 
			 while(i<nums1.length && j<nums2.length) {
				 if(nums1[i]==nums2[j]) {
					 return nums1[i];
				 }else if(nums1[i]>nums2[j]) {
					 j++;
				 }else {
					 i++;
				 }
			 }
			return -1;    
		    }
		}