package week1.Day4;

import org.junit.Test;

public class LC_268_MissingNumber {
	
		
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
		        int SumOfNums = (nums.length*(nums.length+1))/2;
		        
		        int missingNum = 0 ;
		        for(int i = 0 ; i<nums.length;i++){
		            missingNum = missingNum+nums[i];
		        }

		        return SumOfNums-missingNum;
		        
		    }

	}

