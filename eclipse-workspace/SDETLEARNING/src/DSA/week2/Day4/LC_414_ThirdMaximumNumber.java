package DSA.week2.Day4;

import java.util.Arrays;

import org.junit.Test;

public class LC_414_ThirdMaximumNumber {
	/*
	 * Question here !! https://leetcode.com/problems/third-maximum-number/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {3,2,-2147483648};
		System.out.println(bruteForce(nums));
		System.out.println(bruteForce1(nums));

	}

	@Test // edge
	public void example2() {
		int[] nums = { 1, 2 };
		System.out.println(bruteForce(nums));
		System.out.println(bruteForce1(nums));

	}

	@Test // negative
	public void example3() {
		int[] nums = { 2, 2, 3, 1 };
		System.out.println(bruteForce(nums));
		System.out.println(bruteForce1(nums));

	}

	/*
	 * Brute force !! Psuedo code here: declare max1=0 max2=0 max3=0 use for loop
	 * for iteration if(num>max1), max1=num; return max 3 if no max 3 then return
	 * max1
	 */
//O(n)
	//leetcode answer
	private int bruteForce(int[] nums) {
		Integer max1 = null;
		Integer max2 = null;
		Integer max3 = null;
		for (Integer n : nums) {
			if (n.equals(max1) || n.equals(max2) || n.equals(max3))
				continue;
			if (max1 == null || n > max1) {
				max3 = max2;
				max2 = max1;
				max1 = n;
			} else if (max2 == null || n > max2) {
				max3 = max2;
				max2 = n;
			} else if (max3 == null || n > max3) {
				max3 = n;
			}
		}
		return max3 == null ? max1 : max3;
	}
	//int[] nums = { 2, 2, 3, 1 };
	private int bruteForce1(int[] nums) {
		int n=nums.length;
        long firstmax=Long.MIN_VALUE;   
        long secondmax=Long.MIN_VALUE;   
        long thirdmax=Long.MIN_VALUE;   
        for(int i=0;i<n;i++)
        {
            if(nums[i]>firstmax)
            {
                thirdmax=secondmax;
                secondmax=firstmax;
                firstmax=nums[i];
            }
            else if(nums[i]>secondmax &&nums[i]<firstmax)
            {
                thirdmax=secondmax;
                secondmax=nums[i];
            }
            else if(nums[i]>thirdmax && nums[i]<secondmax)
            {
                thirdmax=nums[i];
            }
        }
        return (int) (thirdmax==Long.MIN_VALUE ? firstmax : thirdmax);
        
    }

	}