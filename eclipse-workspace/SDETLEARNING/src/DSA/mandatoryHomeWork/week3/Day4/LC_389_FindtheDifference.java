package DSA.mandatoryHomeWork.week3.Day4;

import org.junit.Test;

public class LC_389_FindtheDifference {
	
	@Test // +ve
	public void example1() {
		String s1 ="abcd", s2 = "abcde";
		System.out.println(findTheDifference(s1,s2));
	}

	

	@Test // +ve
	public void example2() {
		String s1 ="", s2 = "y";
		System.out.println(findTheDifference(s1,s2));
	}


	
	/*
	 * https://leetcode.com/problems/find-the-difference/
	1.Convert the string s and t to an integer array with size of 26
	2.traverse through the integer array s, and find the occurences the array indices and update the array
	3. traverse through the integer array t, and find the occurences the array indices and update the array
	4. compare the two integer array using if loop and find the index that is not matching
	5. add the index to the ASCII of alphabet a to find the added element 
	6. return the newly added element 
	*/


	    public char findTheDifference(String s, String t) {
	        int[] x= new int[26];
	        int[] y=new int[26];
	        char ch='a';
	        for(int i=0;i<s.length();i++)
	        {
	            x[s.charAt(i)-'a']++;
	            y[t.charAt(i)-'a']++;
	        }
	         y[t.charAt(t.length()-1)-'a']++;

	        for(int j=0;j<x.length;j++)
	        {

	            if(x[j]!=y[j])
	            {
	                ch = (char)(j+'a');
	            }
	        }
	return ch;
	        
	    }
	}

