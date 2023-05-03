package week2;

import java.util.Arrays;

import org.junit.Test;

public class DIStirngMatch {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/di-string-match/description/
	 */

	@Test // +ve
	public void example1() {
		String s = "IDID";
		System.out.println(Arrays.toString(bruteForce(s)));

	}

	@Test // edge
	public void example2() {
		String s = "III";
		System.out.println(Arrays.toString(bruteForce(s)));
	}

	@Test // negative
	public void example3() {
		String s = "DDI";
		System.out.println(Arrays.toString(bruteForce(s)));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	//leetcode answer
	private int[] bruteForce(String s) {
		 int[] result = new int[s.length() + 1];
	        int end = result.length - 1, start = 0;
	        int index = 0;
	        while(index < s.length()){
	            if(s.charAt(index) == 'I'){
	                result[index] = start;   
	                start++;
	            }else{
	                result[index] = end;
	                end--;
	            }
	            index++;
	        }
	        result[result.length - 1] = start;
	        return result;
	    }
	}