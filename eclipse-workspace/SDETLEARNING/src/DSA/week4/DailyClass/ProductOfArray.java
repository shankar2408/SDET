package DSA.week4.DailyClass;

import java.util.Arrays;

import org.junit.Test;

public class ProductOfArray {

	/*
	 * Question here !!
	 * https://leetcode.com/problems/product-of-array-except-self/description/
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {4, 6, 2, 5};
		System.out.println(Arrays.toString(productExceptSelf0(nums)));
	}

	@Test // edge
	public void example2() {
		int[] nums = { 1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf0(nums)));
	}

	@Test // negative
	public void example3() {
		int[] nums = {-1,1,0,-3,3 };
		System.out.println(Arrays.toString(productExceptSelf0(nums)));
	}

	
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    pro = pro * nums[j];
                }
            }
            ans[i] = pro;
        }

        return ans;
    }
	
	 public int[] productExceptSelf0(int[] nums) {
	        int[] temp1=new int[nums.length];
	        temp1[0]=1;
	        int product=1;
	        for(int i=0; i<nums.length-1; i++){
	            temp1[i+1]=temp1[i] * nums[i];
	        }
	      
	        for(int i=nums.length-1; i>=0; i--){
	            temp1[i]=temp1[i] * product;
	            product=nums[i]*product;
	        }
	        return temp1;
	        
	    }
// *-------------------------------------------------------------------

/**
 * ? Method-02 :- Using Division Operator (Not Work For '0').
 * ! Time Complexity = O(N).
 * ? Space Complexity = O(1).
 */
    public static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int pro = 1;
        for (int num : nums) {
            pro *= num;
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
// *-------------------------------------------------------------------

/**
 * ? Method-03 :- Using Prefix & Suffix Products In 2 Different Arrays.
 * ! Time Complexity = O(N).
 * ? Space Complexity = O(N).
 */
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] pre_pro = new int[n];
        int[] suf_pro = new int[n];

        pre_pro[0] = 1;
        suf_pro[n - 1] = 1;

        // * Calculate Prefix Product.
        for (int i = 1; i < n; i++) {
            pre_pro[i] = pre_pro[i - 1] * nums[i - 1];
        }

        // * Calculate Suffix Product.
        for (int i = n - 2; i >= 0; i--) {
            suf_pro[i] = suf_pro[i + 1] * nums[i + 1];
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre_pro[i] * suf_pro[i];
        }
        return ans;
    }
// *-------------------------------------------------------------------

/**
 * ? Method-04 :- Using Prefix & Suffix Products Using Only Answer Array.
 * ! Time Complexity = O(N).
 * ? Space Complexity = O(1).
 */
    public static int[] productExceptSelf3(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = 1;

        // * Calculate Prefix Product.
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // * Calculate Suffix Product.
        int temp = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * temp;
            temp = temp * nums[i];
        }

        return ans;
    }
    }