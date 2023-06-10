package week6.Day2;

import org.junit.Test;

public class LC_917_ReverseOnlyLetters {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/reverse-only-letters/
	 */

	@Test // +ve
	public void example1() {
		String s = "ab-cd";
		System.out.println(reverseOnlyLetters(s));
	}

	@Test // edge
	public void example2() {
		String s = "a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(s));
	}

	@Test // negative
	public void example3() {
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * convert string to character array
	 * declare left right =s.length-1
	 * while left< right, if both are aplhabetic swap left and right
	 * else if left is not alphabet, left++
	 * else right--
	 * return char array to new string
	 */

	public String reverseOnlyLetters(String s) {
        char[] c=s.toCharArray();
        int left=0; int right=s.length()-1;
        while(left<right){
            if(Character.isLetter(c[left]) && Character.isLetter(c[right]) ) {
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
            }else if(!Character.isLetter(c[left])) {
            	left++;
            }else if(!Character.isLetter(c[right])) {
            	right--;
            }
        }
        return new String(c);
    }
}