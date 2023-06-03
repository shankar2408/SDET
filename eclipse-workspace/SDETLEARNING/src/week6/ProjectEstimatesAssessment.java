package week6;

import org.junit.Test;
import java.util.*;

public class ProjectEstimatesAssessment {
	/*
	 * Question here !!
	 * A number of bids are being taken for a project. Determine the number
of distinct pairs of project costs where their absolute difference is some target value. Two pairs are distinct if they differ in at least one
value.
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {1,3,5};
		int target=2;
		System.out.println(matchTarget(nums,target));
	}

	@Test // edge
	public void example2() {
		int[] nums = {2, 4, 6, 8, 10, 12};
		int target=2;
		System.out.println(matchTarget(nums,target));
	}

	@Test // negative
	public void example3() {
		int[] nums = {1, 5, 3, 4, 2};
		int target=2;
		System.out.println(matchTarget(nums,target));
	}


	private int bruteForce(int[] nums, int target) {
		int count=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(Math.abs(nums[i]-nums[j])==target) {
					count++;
				}
			}
		}
		return count;
	}

	public int matchTarget(int[] ar,int target){

		 int ans = 0;
		    HashSet<Integer> set = new HashSet<>();

		    for(int i = 0; i < ar.length; i++){
		        set.add(ar[i]);
		    }

		    for(int i = 0; i < ar.length; i++){
		        if(set.contains(ar[i]+target)){
		            ans++;
		        }
		    }

		    return ans;
		}
}
