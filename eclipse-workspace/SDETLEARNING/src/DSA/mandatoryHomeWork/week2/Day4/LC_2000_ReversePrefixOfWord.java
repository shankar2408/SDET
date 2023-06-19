package DSA.mandatoryHomeWork.week2.Day4;

import org.junit.Test;

public class LC_2000_ReversePrefixOfWord {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/reverse-prefix-of-word/
	 */

	@Test // +ve
	public void example1() {
	String word = "abcdefd";
	char ch = 'd';
	System.out.println(bruteForce(word,ch));
	System.out.println(twoPointer(word,ch));

	
	}

	@Test // edge
	public void example2() {
		String word = "xyxzxe";
		char ch = 'z';
		System.out.println(bruteForce(word,ch));
		System.out.println(twoPointer(word,ch));
	}

	@Test // negative
	public void example3() {
		String word = "abcd";
		char ch = 'z';
		System.out.println(bruteForce(word,ch));
		System.out.println(twoPointer(word,ch));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * find out the index of ch
	 * use for loop to iterate and print from reverse based on index of ch
	 * return updated string
	 * 
	 */

	private String bruteForce(String word, char ch) {
		int index=0;
		String str="";
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == ch) {
				index=i;
				break;
			}
		}
		
		for(int i=index; i>=0; i--) {
			str=str+word.charAt(i);
		}
		
		for(int i=index+1; i<word.length(); i++) {
			str=str+word.charAt(i);
		}
		
		return str;

	}

	private String twoPointer(String word, char ch) {
		int index=0;
		char[] c=word.toCharArray();
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == ch) {
				index=i;
				break;
			}
			}
		int left=0, right=index;
			while(left<right) {
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;
				right--;	
			}
		return new String(c);
}

	
}
