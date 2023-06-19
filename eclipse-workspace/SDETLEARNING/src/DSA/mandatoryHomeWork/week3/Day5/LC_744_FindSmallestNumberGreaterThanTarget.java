package DSA.mandatoryHomeWork.week3.Day5;

import org.junit.Test;

public class LC_744_FindSmallestNumberGreaterThanTarget {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
	 */

	@Test // +ve
	public void example1() {
		char[] letters = {'c','f','j'};
		char target = 'a';
		System.out.println(nextGreatestLetter(letters,target));
	}

	@Test // edge
	public void example2() {
		char[] letters = {'c','f','j'};
		char target = 'c';
		System.out.println(nextGreatestLetter(letters,target));
	}

	@Test // negative
	public void example3() {
		char[] letters = {'x','x','y','y'};
		char target = 'z';
		System.out.println(nextGreatestLetter(letters,target));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	public char bf(char[] letters, char target) {
        for(int i=0; i<letters.length; i++){
            if(target<letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }

	
	public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
           int mid=start+(end-start)/2;
            if(target<letters[mid])
            {
                
                 
                end=mid-1;
            }
            else
            {
                start=mid+1;
             
                
            }
        }
        return letters[start%letters.length];
        }

}
