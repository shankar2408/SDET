package sdet.practice;

import java.util.Arrays;

import org.junit.Test;

/*
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 */


/*
 * 1) Did I understand the problem? Yes 
 * 		-> If yes, go to next step !!
 * 
 *    What is the input(s)? -> int[] -> +, - , zeros, dups & k (target)
 *    What is the expected output? -> indices of the matching value
 *    Do I have constraints to solve the problem? -> exact solution, cannot use same element (index) twice
 *    Do I have all informations to go to next step!! yes
 *    How big is your test data set will be? -> untold (simple)
 *    
 *  2) Test data set
 *  	
 *  	Minimum of 3 data set !! Positive, Edge, Negative 
 *      Validate with the interviewer if the data set is fine by his/her assumptions
 * 
 * 3) Do I know how to solve it?
 * 		
 * 		Yes - great, is there an alternate?
 *  
 * 5) Do I know alternate solutions as well? No
 * 
 * 		No - That is still fine, proceed to solve by what you know !!
 * 
 * 
 * 7) Start always with Psuedo code 
 * 
 * 8) Implement them in the code (editor)
 * 
 * 9) Test against the different data set 
 * 
 * 10) If it fails, debug them to solve it !!
 * 
 */


public class TwoSum {

	@Test
	public void example1() {
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(bruteForce(nums, target)));
		System.out.println(Arrays.toString(twoPointer(nums, target)));
	}
	
	@Test
	public void example2() {
		int[] nums = {2,3,4};
		int target = 6;
		System.out.println(Arrays.toString(bruteForce(nums, target)));
		System.out.println(Arrays.toString(twoPointer(nums, target)));

	}
	
	@Test
	public void example3() {
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
		int target = 1;
		System.out.println(Arrays.toString(bruteForce(nums, target)));
		System.out.println(Arrays.toString(twoPointer(nums, target)));


	}

	// You can improve the performance of this solution O[N2]
	private int[] bruteForce(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) { // O[N]
			for (int j = i + 1; j < nums.length; j++) { // O[N]
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j }; // O[1]
				}
			}
		}
		return new int[] {-1, -1};
	}
	
	// O[N2] => Time complexity => o[2N] => O[N] => O[N/2]
	// O[1]  => Space complexity
	
	/*
	 * Psuedocode:
		 * Traverse from left to right (one number at a time)
		 * Pick the value of the number and subtract that from the target (k)
			 *  Traverse from the next number to the right
			 *  If the difference value found by the traverse path, 
			 *  	get the index and stop the loop
			 *  Else continue until the end
			 * 
		 * Iterate the rest of the value until you find the matches
		 * If you find matches, we need the index (2 indices) !!
		 * return indices
	 */	
	
	/*
	 *  Psuedocode:
	 *  Left + Right = Sum (You got it, Return the indices)
		Left + Right > Sum (Move Right towards Left  Decrement Right)
		Left + Right < Sum (Move Left towards Right  Increment Left)

	 */
	
	/*
	 * O[N] 
	 * 
	 * Two pointer approach => Traversing on opposite direction
	 * 
	 * Worst case for time complexity => O[N]
	 * Space complexity => O[1]
	 * 
	 */
	
	private int[] twoPointer(int[] nums, int target) {
		
		int left = 0, right = nums.length-1;		
		while(left < right) {
			if(nums[left]+nums[right] ==  target) 
				return new int[] {left, right};
			else if(nums[left]+nums[right] > target) right--;
			else left++;
		}
		return new int[] {-1, -1};
		
	}
	
	
	
	
	

}
