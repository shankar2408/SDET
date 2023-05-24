package week5;

import java.util.Arrays;
import java.util.*;

import org.junit.Test;

public class FindAllAnagramInstring {
	
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
	 */

	@Test
	public void TC1() {
		String s1 = "abc";
		String s2 = "cbaebabacd";
		System.out.println(solve(s1, s2));
	}
	
	@Test
	public void TC2() {
		String s1 = "ab";
		String s2 = "abab";
		System.out.println(solve(s1, s2));
	}

	
	private List<Integer> solve(String s1, String s2) {

		List<Integer> ls=new ArrayList<>();
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
					ls.add(l);
				}
				f2[(s2.charAt(l++) - 'a')]--;
			}
		}

		return ls;

	}

}