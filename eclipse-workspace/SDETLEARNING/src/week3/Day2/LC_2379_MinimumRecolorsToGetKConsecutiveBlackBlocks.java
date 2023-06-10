package week3.Day2;

import org.junit.Test;

public class LC_2379_MinimumRecolorsToGetKConsecutiveBlackBlocks {
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
		System.out.println(windowSliding(blocks,k));
	}
	
	@Test
	public void TC2() {
		String blocks = "WBWBBBW";
		int k = 2;
		System.out.println(windowSliding(blocks,k));
	}
	
	
	public int minimumRecolors(String blocks, int k) {
	       int ans = 0 ;
	       int sum = Integer.MAX_VALUE ;
	       int left = 0 ;
	      for(int i = 0 ; i<blocks.length();i++){
	          if(blocks.charAt(i)=='W') 
	        	  ans++ ;
	          if(i-left+1==k){
	              sum = Math.min(sum,ans);
	              if(blocks.charAt(left)=='W') 
	            	  ans--;
	              left++;
	          }
	      }
	      return sum ;
	    }
	
	 private int windowSliding(String input, int window){
	        int index = 0, whiteMinimum = 0;

	        //First window and collect number of whites in it
	        while(index < window){
	            if(input.charAt(index++) == 'W')
	                whiteMinimum++;
	        }

	        int tempWhiteMinimum = whiteMinimum;

	        //second window
	        while(index < input.length()){
	            if(input.charAt(index-window) == 'W')
	                tempWhiteMinimum--;

	            if(input.charAt(index++) == 'W')
	                tempWhiteMinimum++;

	            whiteMinimum = Math.min(whiteMinimum, tempWhiteMinimum);
	        }
	        return whiteMinimum;
	    }

	    private void bruteForce(String input, int k){

	        int minimum = Integer.MAX_VALUE;

	        for(int i =0; i <= input.length()-k;i++){
	            int currentWhite = 0;
	            for(int j = i ; j <= k+i-1;j++){
	                if(input.charAt(j) == 'W')
	                    currentWhite++;
	            }
	            minimum = Math.min(minimum, currentWhite);
	        }
	        System.out.println(minimum);
	    }
	    
	    public int minimumRecolors1(String blocks, int k) {
	        int count=0; int min=Integer.MAX_VALUE;
	        for(int i=0; i<=blocks.length()-k; i++){
	            count=0;
	            for(int j=i; j<k+i; j++){
	            if(blocks.charAt(j)=='W'){
	                count++;
	            }
	        }
	            if(count<min){
                    min=count;
                }
	        } 
	        return min; 
	    }
	}