package sdet.practice;

import java.util.Arrays;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;


public class TwoPointerPractice {
	
	@Test
	public void twoPointer() {
		System.out.println("2 pointer");
		int[] nums= {1,2,2,5,5,7};
		System.out.println(removeDuplicates(nums));
	}
	
	
	public List<Integer> removeDuplicates(int[] nums) {
	    
//	    int i = 0;
//	    for (int j = 1; j < nums.length; j++) {
//	        if (nums[i] != nums[j]) {
//	            i++;
//	            nums[i] = nums[j];
//	        }
//	    }
//	    i++;
        List<Integer> list = new ArrayList<Integer>();

		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]!=nums[j]) {
					list.add(nums[i]);
					
					
				}
			}
		}
	    return list;
	}
	
}
