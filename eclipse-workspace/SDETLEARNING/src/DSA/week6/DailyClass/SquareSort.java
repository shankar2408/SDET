package DSA.week6.DailyClass;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquareSort {

	@Test // +ve
	public void example1() {
		int[] nums = {2,3,4,4,5};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), 
				new int[] {4, 9, 16, 16, 25}));
	
	}

	@Test // edge
	public void example2() {
		int[] nums = {-9, -5, 1, 4, 7};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), 
				new int[] {1, 16, 25, 49, 81}));
		
	}

	@Test // negative
	public void example3() {
		int[] nums = {};
		Assert.assertEquals(true, Arrays.equals(squareAndSort(nums), 
				new int[] {}));
	}

	
	
	private int[] bruteForce(int[] nums) {
		int c=0;
		for(int i=0; i<nums.length; i++) {
			nums[c++]=nums[i]*nums[i];
		}
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}

		return nums;
		

	}
	
	private int[] squareAndSort(int[] nums) {
		int[] squared = new int[nums.length];
		int left=0, right=nums.length-1;
		int index=nums.length-1;
		while(index>=0) {
			if(Math.abs(nums[left])<Math.abs(nums[right])) {
				squared[index--]=nums[right]*nums[right--];
			}else {
				squared[index--]=nums[left]*nums[left++];

			}
		}
		System.out.println(Arrays.toString(squared));
		return squared;
	}
	
}
