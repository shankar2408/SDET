package week5.Day5;

import org.junit.Test;

public class LC_1221_SplitAStringInBalancedStrings {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
	 */

	@Test // +ve
	public void example1() {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
	}

	@Test // edge
	public void example2() {
		String s = "RLRRRLLRLL";
		System.out.println(balancedStringSplit(s));
	}

	@Test // negative
	public void example3() {
		String s = "LLLLRRRR";
		System.out.println(balancedStringSplit(s));
	}

	
	 public int balancedStringSplit(String s) {
		 int sum=0,ans=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='L'){
	                sum++;
	            }else{
	                sum--;
	            }
	            //System.out.println("Sum:"+sum);
	            if(sum==0){
	                ans++;
	            }
	        }
	        return ans;
	    }
	}