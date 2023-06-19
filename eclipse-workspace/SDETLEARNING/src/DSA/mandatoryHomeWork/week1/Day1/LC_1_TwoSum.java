package DSA.mandatoryHomeWork.week1.Day1;

import org.junit.Test;
import java.util.*;

public class LC_1_TwoSum {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/two-sum/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {2,7,11,15};
		int k=9;
		System.out.println(Arrays.toString(twoSum(nums,k)));
	}

	@Test // edge
	public void example2() {
		int[] nums = {3,2,4};
		int k=6;
		System.out.println(Arrays.toString(twoSum(nums,k)));
	}

	

	/*Pseudocode
    Using map
    declare hashmap
    use for loop for iterating nums array
    if map contains(target-nums[i])
    return new int {i,map.get(target-nums[i])}
    else map.put(nums[i],i)
    return new int {-1,-1}
    TC=O(1), SC=O(1)
    */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }else{
                map.put(nums[i],i);
            }
        }
       return new int[]{-1,-1};
    }
}