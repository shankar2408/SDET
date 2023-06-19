package DSA.mandatoryHomeWork.week2.Day3;

import java.util.Arrays;

import org.junit.Test;

public class LC_942_DIStringMatch {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/di-string-match/description/
	 */

	@Test // +ve
	public void example1() {
		String s = "IDID";
		System.out.println(Arrays.toString(bruteForce(s)));
		System.out.println(Arrays.toString(match(s)));

	}

	@Test // edge
	public void example2() {
		String s = "III";
		System.out.println(Arrays.toString(bruteForce(s)));
		System.out.println(Arrays.toString(match(s)));

	}

	@Test // negative
	public void example3() {
		String s = "DDI";
		System.out.println(Arrays.toString(bruteForce(s)));
		System.out.println(Arrays.toString(match(s)));

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * declare a new array with s.length+1
	 * declare i,j,index
	 * while index<s.length
	 * if s.charAt(index)=='I', result index=start else end
	 * index++
	 * result[length-1]=start or end
	 * return result
	 * 
	 * TC=O(n) SC=O(n)
	 */

	//leetcode answer
	private int[] bruteForce(String s) {
		 int[] result = new int[s.length() + 1];
	        int end = s.length(), start = 0;
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
	

public int[] match(String s) {
	 int[] temp = new int[s.length()+1];
     
     int start = 0;
     int end = s.length();
     for(int i =0; i < s.length();i++){
         if(s.charAt(i)=='I'){
             temp[i] = start++;
             
         } else if(s.charAt(i)=='D'){
            temp[i] = end--;
            
         }

     }
     temp[s.length()] = start;  
     
   return temp;
 }
}