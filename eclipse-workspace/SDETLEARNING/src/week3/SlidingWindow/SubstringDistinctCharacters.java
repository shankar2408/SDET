package week3.SlidingWindow;

import org.junit.Test;

public class SubstringDistinctCharacters {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-
	 * characters/description/
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