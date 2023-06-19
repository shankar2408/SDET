package DSA.mandatoryHomeWork.week2.Day2;

import org.junit.Test;

public class LC_168_ExcelSheetColumnTitle {
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

	 */

	@Test // +ve
	public void example1() {
		int columnNumber=30;
		System.out.println(convertToTitle(columnNumber));

	}
	
	/*
	 * Pseudocode
	 * declare empty string ans
	 * while(n>0), reduce column number by n-- for every iteration because to startwith 'A' ascii value
	 * string ans =('A'+n%26)+ans to store the last char
	 * n=n/26
	 * after the iteration fails
	 * return ans
	 * 
	 * TC-O(logn)
	 * SC-O(1)
	 */

	

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

		
}