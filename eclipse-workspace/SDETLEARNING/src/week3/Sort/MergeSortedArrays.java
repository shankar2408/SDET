package week3.Sort;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortedArrays {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,8};

		System.out.println(Arrays.toString(merge(arr1,arr2)));
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	public int[] merge(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length+nums2.length];
        
        int left = 0;
        int right = 0 ;
        int k = 0 ;
        while(left<nums1.length && right<nums2.length){
        	if(nums1[left]<nums2[right]) temp[k++] = nums1[left++];
        	else temp[k++] = nums2[right++];       
        }
        while(left < nums1.length) 
        	temp[k++] = nums1[left++];
        
        while(right < nums2.length) 
        	temp[k++] = nums2[right++];
        
		return temp;
       
   }
}