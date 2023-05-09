package week3.May9;

import org.junit.Test;

public class MinRecolors {
	/**
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
	 * 
	 * TC - O(n)
	 * SC - O(1)
	 * 
	 * Sliding window apprach 
	 * count no of W in the given window , and campare the counts in each window and return the ans
	 * 
	 */
	
	@Test
	public void TC1() {
		String blocks = "WBBWWBBWBW";
		int k = 7;
		System.out.println(minimumRecolors(blocks,k));
	}
	
	@Test
	public void TC2() {
		String blocks = "WBWBBBW";
		int k = 2;
		System.out.println(minimumRecolors(blocks,k));
	}
	
	
	public int minimumRecolors(String blocks, int k) {
	       int ans = 0 ;
	       int sum = Integer.MAX_VALUE ;
	       int left = 0 ;
	      for(int i = 0 ; i<blocks.length();i++){
	          if(blocks.charAt(i)=='W') ans++ ;
	          if(i-left+1==k){
	              sum = Math.min(sum,ans);
	              if(blocks.charAt(left)=='W') ans--;
	              left++;
	          }
	      }
	      return sum ;
	    }

}