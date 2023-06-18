package DSA.week1.Day4;

import org.junit.Test;

public class LC_268_MissingNumber {
	
		
		 @Test
		 public void TC1() {
			int[] nums = {3,0,1};
			System.out.println(findmissingNumber(nums));
		 }
		
		 @Test
		 public void TC2() {
			int[] nums = {0,1};
			System.out.println(findmissingNumber(nums));
		 }
		
		 @Test
		 public void TC3() {
			int[] nums = {9,6,4,2,3,5,7,0,1};
			System.out.println(findmissingNumber(nums));
		 }
		 
		 /*
		  * Pseudocode:
		  * create new array output with length+1
		  * use for loop for iteration and pass the nums value in the output array index and change it value to 1
		  * use for loop for iterating the output index and if(output[i]==0) return i
		  * 
		  * TC:O(n)
		  * SC:O(n)
		  */
		
		 public int findmissingNumber(int[] nums) {
				
			 int[] op=new int[nums.length+1];
			 
			 for(int i=0; i<nums.length; i++) {
				 op[nums[i]]=1;
			 }
			 
			 for(int i=0; i<op.length; i++){
				if(op[i]==0) {
					return i;
				} 
			 }
			 return 0;
			  
		 }
		
			public int missingNumber(int[] nums) {
				//(n*(n+1))/2
		        int SumOfNums = (nums.length*(nums.length+1))/2;
		        
		        int missingNum = 0 ;
		        for(int i = 0 ; i<nums.length;i++){
		            missingNum = missingNum+nums[i];
		        }

		        return SumOfNums-missingNum;
		        
		    }
			

	}

