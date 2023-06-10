package week5.Day2;

import org.junit.Test;

public class LC_392_IsSubsequence {
	/*
	 * Question here !! https://leetcode.com/problems/is-subsequence/description/
	 */

//	@Test // +ve
//	public void example1() {
//		String s1 = "abc";
//		String s2 = "ahbgdc";
//		System.out.println(twoPointer(s1, s2));
//	}
//	
//	@Test // edge
//	public void example2() {
//		String s1 = "axc";
//		String s2 = "ahbgdc";
//		System.out.println(twoPointer(s1, s2));
//	}

	@Test // edge
	public void example3() {
		String s1 = "ab";
		String s2 = "baab";
		System.out.println(twoPointer(s1, s2));
	}

	public boolean isSubsequence(String s, String t) {
		int index = 0;
		int min = Integer.MIN_VALUE;
		boolean flag = false;
		if (s.length() == 0) {
			return true;
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			flag = false;
			for (int j = 0; j < t.length(); j++) {
				if (c == t.charAt(j)) {
					index = j;
					flag = true;
					if (min < index) {
						min = index;
					} else {
						return false;
					}
				}
			}
			if (!flag) {
				return false;
			}

		}

		return flag;
	}

	public boolean twoPointer(String s, String t) {
		int i = 0, j = 0;
		while (i < s.length() && j < t.length()) {
			if (s.charAt(i) == t.charAt(j)) {
				i++;
			}
			j++;
		}
		return i == s.length();
	}
}