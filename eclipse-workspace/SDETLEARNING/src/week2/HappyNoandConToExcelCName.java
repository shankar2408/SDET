package week2;

import org.junit.Test;

public class HappyNoandConToExcelCName {
	/*
	 * Question here !!
	 * 1.https://leetcode.com/problems/excel-sheet-column-title/description/
	 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 

2.https://leetcode.com/problems/happy-number/
	 */

	@Test // +ve
	public void example1() {
		int columnNumber=30;
		int n=19;
		System.out.println(convertToTitle(columnNumber));
		System.out.println(isHappy(n));

	}

	

	public String convertToColumnTitle(int columnNumber) {
        String ans = "";
        while (columnNumber>0){
            columnNumber--;
            ans = (char) ('A'+ (columnNumber%26)) + ans;
            columnNumber = columnNumber/26;
        }
        return ans;
    }
	
	 public String convertToTitle(int columnNumber) {
	        String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        StringBuilder sb=new StringBuilder();

	        while(columnNumber>0){
	            int remVal=(columnNumber-1)%26;//1
	            sb.append(alpha.charAt(remVal));//B
	           columnNumber=(columnNumber-1)/26;//(1-1)/26=0
	        }
	        return sb.reverse().toString();//AB

	 }

		
	public boolean isHappy(int n) {
		       if(n == 1 || n == 7){
		           return true;
		       }
		       if(n < 10){
		           return false;
		       }
		       int sum = 0;

		       while(n != 0){
		           sum += (n % 10) * (n % 10);
		           n /= 10;
		       }
		       return isHappy(sum);
		    }
		}
