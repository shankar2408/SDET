package week3.Day3;

import org.junit.Test;

//https://leetcode.com/problems/valid-palindrome-ii/description/
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

public class Palindrome {
	@Test
	public void TC1() {
		String A = "abcdba";
		System.out.println(validPalindrome(A));
	
	}

	        
	      

	   public boolean validPalindrome(String s) {
	        int left = 0 ; 
	        int right = s.length() - 1;
	        
	        while(left<right){
	            if(s.charAt(left) == s.charAt(right)){
	                left++;
	                right--;
	            } else{
	                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
	            }
	        }
	        
	        return true ;
	    }
	    
	    public boolean isPalindrome(String s , int left , int right){
	        while(left<right){
	        if(s.charAt(left) == s.charAt(right)){
	                left++;
	                right--;
	          } else{
	            return false ;
	            }
	       }
	        
	        return true ;
	    }
	    
	    
	}
	
