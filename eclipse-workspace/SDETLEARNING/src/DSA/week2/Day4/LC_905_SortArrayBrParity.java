package DSA.week2.Day4;

import java.util.Arrays;

import org.junit.Test;

public class LC_905_SortArrayBrParity {/*
									 * Question here !! https://leetcode.com/problems/sort-array-by-parity/
									 */

	@Test // +ve
	public void example1() {

		int[] nums = { 3, 1, 2, 4,8,1,9,6};
		System.out.println(Arrays.toString(twoPointer(nums)));
		System.out.println(Arrays.toString(twoPointer1(nums)));


	}

	@Test // edge
	public void example2() {
		int[] nums = { 0 };
		System.out.println(Arrays.toString(twoPointer(nums)));
		System.out.println(Arrays.toString(twoPointer1(nums)));

	}

	@Test // negative
	public void example3() {
		int[] nums = { -3, -1, -2, -4 };
		System.out.println(Arrays.toString(twoPointer(nums)));
		System.out.println(Arrays.toString(twoPointer1(nums)));

	}


	/*
	 * 2 pointer !! Psuedo code here: declare left=0, right=nums.length-1
	 * while(left<nums.length-1) if nums[left]%2!=0 and right is zero swap and left
	 * increment and right decrement else
	 * if nums right is not even right decrement else
	 * if nums left is even left increment
	 * return nums
	 */
	//int[] nums = { 3, 1, 2, 4,8,1,9,6};
	//TC=O(n)
	private int[] twoPointer(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left]%2 != 0 && nums[right]%2 == 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right--;
			} 
			else if (nums[right]%2 != 0) {
				right--;
			} else if (nums[left]%2 == 0) {
				left++;
			}
		}
		return nums;
	}
	
	//TC=O(n)
	private int[] twoPointer1(int[] nums) {
		int[] n = new int[nums.length];
        int l = 0;
        int r = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
                n[l++] = nums[i];
            else
                n[r--] = nums[i];
        }
        return n;
    }
}