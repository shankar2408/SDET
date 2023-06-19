package DSA.DailyWeeklyClassProblems.week6.DailyClass;

import org.junit.Test;

public class BinarySearch {
	

	@Test // +ve
	public void example1() {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int k=10;
		System.out.println(binarySearch(nums,k));
	}



	private int binarySearch(int[] nums, int k) {
		int left=0, right=nums.length-1;
		
		
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==k) {
				return mid;
			}
			
			if(nums[mid]>k) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;

	}

}
