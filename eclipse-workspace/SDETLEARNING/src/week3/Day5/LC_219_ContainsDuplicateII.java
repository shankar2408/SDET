package week3.Day5;

import org.junit.Test;
import java.util.*;

public class LC_219_ContainsDuplicateII {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/contains-duplicate-ii/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {1,2,3,1};
		int k=3;
		System.out.println(containsNearbyDuplicate1(nums,k));
		System.out.println(containsNearbyDuplicate2(nums,k));
		System.out.println(containsNearbyDuplicate3(nums,k));

	}

	@Test // edge
	public void example2() {
		int[] nums = {1,0,1,1};
		int k=1;
		System.out.println(containsNearbyDuplicate1(nums,k));
		System.out.println(containsNearbyDuplicate2(nums,k));
		System.out.println(containsNearbyDuplicate3(nums,k));
	}

	@Test // negative
	public void example3() {
		int[] nums = {1,2,3,1,2,3};
		int k=2;
		System.out.println(containsNearbyDuplicate1(nums,k));
		System.out.println(containsNearbyDuplicate2(nums,k));
		System.out.println(containsNearbyDuplicate3(nums,k));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	//Approach 1: Brute Force ~ TLE

	// Time complexity: O(n²)
	// Space complexity: O(1)

	public boolean containsNearbyDuplicate1(int[] nums, int k) {
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j <= i + k && j < nums.length; j++) {
				if (nums[i] == nums[j]) 
					return true;
			}
		}

		return false;
	}
	//Apporoach 2: Sliding Window

	// Time complexity: O(n)
	// Space complexity: O(n)

	public boolean containsNearbyDuplicate2(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			if (i > k) 
				set.remove(nums[i-k-1]); 
			
			if (!set.add(nums[i])) 
				return true; 
		}
		
		return false;
	}
	//Approach 3: Using HashMap

	// Time complexity: O(n)
	// Space complexity: O(n)

	public boolean containsNearbyDuplicate3(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				if (i - map.get(nums[i]) <= k)
					return true;
			}

			map.put(nums[i], i);
		}

		return false;	
	}

}
