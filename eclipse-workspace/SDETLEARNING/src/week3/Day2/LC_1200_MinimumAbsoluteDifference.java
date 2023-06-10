package week3.Day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class LC_1200_MinimumAbsoluteDifference {
	
	/**
	 * https://leetcode.com/problems/minimum-absolute-difference/description/
	 * 
	 * TC - O(nlogn)
	 * SC - 0(1)
	 * 
	 * sort the array
	 * Find the minimum diff using for or while loop and save the minimum in ans
	 * another loop if 1st and second element diff is == ans add to List 
	 * then add the temp list to output list 
	 * 
	 * 
	 * 
	 */
	
	
	@Test
	public void TC1() {
		int[] arr = {4,2,1,3};
		System.out.println(minimumAbsDifference(arr));
	}
	
	@Test
	public void TC2() {
		int[] arr = {1,3,6,10,15};
		System.out.println(minimumAbsDifference(arr));
	}
	
	@Test
	public void TC3() {
		int[] arr = {3,8,-10,23,19,-4,-14,27};
		System.out.println(minimumAbsDifference(arr));
	}
	
	


	 public List<List<Integer>> minimumAbsDifference(int[] arr) {

		 List<List<Integer>> res = new ArrayList<>();
	        //sort elements
	        Arrays.sort(arr);
	        //init our min difference value
	        int min = Integer.MAX_VALUE;
	        //start looping over array to find real min element. Each time we found smaller difference
	        //we reset resulting list and start building it from scratch. If we found pair with the same
	        //difference as min - add it to the resulting list
	        for (int i = 0; i < arr.length - 1; i++) {
	            int diff = arr[i + 1] - arr[i];
	            if (diff < min) {
	                min = diff;
	                res.clear();
	                res.add(Arrays.asList(arr[i], arr[i + 1]));
	            } else if (diff == min) {
	                res.add(Arrays.asList(arr[i], arr[i + 1]));
	            }
	        }
	        return res;
	    }
}