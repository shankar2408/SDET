package DSA.week3.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class MathematicalSlidingWindow {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums = {10,15,-5,15,-10,5};
		//int[] nums = {10,15,-5,15,-10,10,-3};
		int k=5;
		System.out.println(Arrays.toString(slidingWindowUsingHash(nums,k)));
	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	private int[] slidingWindowUsingHash(int[] ar, int k) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
	    int sum = 0;
	    for(int i = 0; i < ar.length; i++){
	    	if(ar[i]==k) return new int[] {i};
	        sum=sum+ar[i];
	        if(hm.containsKey(sum-k)){
	        	System.out.println(ar[hm.get(sum-k)+1]+" "+ar[i]);
	            return new int[] {hm.get(sum-k)+1,i};
	        }
	        hm.put(sum, i);
	    }
		return ar;

}
	}