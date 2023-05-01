package week2;

import org.junit.Test;

public class ReverseString {
	
	/*
	 * Question here !!
	 * input: Welcome To Testleaf
	 * output: emocleW oT faeltseT
	 */

	@Test // +ve
	public void example1() {
		String str="Welcome To Testleaf";
		System.out.println(reverseString(str));
	}

	@Test // edge
	public void example2() {

	}

	@Test // negative
	public void example3() {

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * 
	 */

	private String reverseString(String str) {
	String[] s=str.split(" ");
	for(int i=0; i<s.length; i++) {
		char[] c=s[i].toCharArray();
	int left=0;	int right=c.length-1;
	while(left<right) {
		char temp=c[left];
		c[left]=c[right];
		c[right]=temp;
		left++;
		right--;
	}
	s[i]=new String(c);
	}
		
    return String.join(" ",s);
	}

}
