package week1.daily.practice;

import org.junit.Test;

public class MissingNumber {
	
	 @Test
	 public void TC1() {
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));
	 }
	
	 @Test
	 public void TC2() {
		int[] nums = {0,1};
		System.out.println(missingNumber(nums));
	 }
	
	 @Test
	 public void TC3() {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	 }
	
	
		public int missingNumber(int[] nums) {
			int arr[] = new int[nums.length + 1];
	        for(int i=0;i<nums.length;i++)
	        {
	            arr[nums[i]] = 1;
	        }
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i] == 0)
	            {
	                return i;
	            }
	        }
	        return 0;

}
}


