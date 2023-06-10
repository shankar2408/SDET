package week4.DailyClass;

import org.junit.Test;
import java.util.*;

public class TwoSum {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/two-sum/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {2,7,11,15};
		int target=9;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}

	@Test // edge
	public void example2() {
		int[] nums = {3,2,4};
		int target=6;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}

	@Test // negative
	public void example3() {
		int[] nums = {3,3};
		int target=6;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}

	

	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                return new int[]{hash.get(target-nums[i]),i};
            }else{
                hash.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}