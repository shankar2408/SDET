package week3.Day1;

import org.junit.Test;

public class LC_1876_SubstringsOfSizeThreeWithDistinctCharacters {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 */

	@Test // +ve
	public void example1() {
		String s = "xyzzaz";
		System.out.println(bruteForce(s));
	}

	@Test // edge
	public void example2() {
		String s = "aababcabc";
		System.out.println(bruteForce(s));
	}


	/*
	 * Psuedo code here: 
	 * 
	 */
	
	public int countGoodSubstrings(String s) {
	      int n = s.length();
	        if(n<3) return 0;
	        int c=0;
	        for(int i =0;i<=n-3;i++){
	            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i)!=s.charAt(i+2)){
	                c++;
	            }  
	        }
	        return c;
	    }

	private int bruteForce(String s) {
		int i=0, j=0, count=0;
        while(j<s.length()){
            if(j-i+1==3){
                if(s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) 
                && s.charAt(i+2) != s.charAt(i)){
                    count++;
                }
                i++;
            }
            j++;
        }
        return count;
    }
}