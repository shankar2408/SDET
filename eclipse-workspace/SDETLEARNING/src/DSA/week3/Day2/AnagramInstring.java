package DSA.week3.Day2;

import java.util.Arrays;

import org.junit.Test;

public class AnagramInstring {
	
	/*
	 * Given two strings s1 & s2, return true if s1 is an anagram of s2

example: 
String s1="abb";
String s2="eidbdooobab";
Output => true since s2 contains s1 (bab is => abb)

Example 2: 
String s1="ab";
String s2="eidboaoo";
Output => false => since ab is not part of any combination in s2
	 * 
	 */
	
	/*
	 * Question here !!
	 * 
	 */

	@Test
	public void TC1() {
		String s1 = "abb";
		String s2 = "eidbdooobab";
		System.out.println(solve(s1, s2));
	}
	
	@Test
	public void TC2() {
		String s1 = "ab";
		String s2 = "eidboaoo";
		System.out.println(solve(s1, s2));
	}

	private boolean solve(String s1, String s2) {

		int[] f1 = new int[26];
		int k = s1.length();
		int[] f2 = new int[26];
		int l = 0;

		for (int i = 0; i < s1.length(); i++) {
			int alpa = (s1.charAt(i) - 'a');
			f1[alpa]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			f2[(s2.charAt(i) - 'a')]++;
			if ((i - l + 1) == k) {
				
				if (Arrays.equals(f2, f1)) {
					return true;
				}else {
				f2[(s2.charAt(l++) - 'a')]--;
				}
			}
		}

		return false;

	}

}