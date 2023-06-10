package week6.Day1;

import org.junit.Test;

public class LC_28_FindTheIndexOfTheFirstOccurenceInAString {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
	 */

//	@Test // +ve
//	public void example1() {
//		String haystack = "sadbutsad", needle = "sad";
//		System.out.println(strStr2(haystack, needle));
//	}

	@Test // edge
	public void example2() {
		String haystack = "leetcode", needle = "leeto";
		System.out.println(strStr(haystack, needle));
	}

	

	public int strStr(String haystack, String needle) {

		int m = needle.length();
		int n = haystack.length();

		for (int i = 0; i <= n - m; i++) {
			int count = 0;
			for (int j = 0; j < m; j++) {
				if (haystack.charAt(i + j) == needle.charAt(j)) {
					count++;
				} else {
					break;
				}
			}

			if (count == m) {
				return i;
			}
		}
		return -1;
	}

	public int strStr1(String haystack, String needle) {
		int n = haystack.length();
		int m = needle.length();
		for (int i = 0; i < n - m + 1; i++) {
			if (haystack.charAt(i) == needle.charAt(0)) {
				if (needle.equals(haystack.substring(i, i + m))) {
					return i;
				}
			}
		}
		return -1;
	}

	public int strStr2(String haystack, String needle) {
		int hLen = haystack.length();
		int nLen = needle.length();
		int nIndex = 0;
		for (int i = 0; i < hLen; i++) {
			// as long as the characters are equal, increment needleIndex
			if (haystack.charAt(i) == needle.charAt(nIndex)) {
				nIndex++;
			} else {
				// start from the next index of previous start index
				i = i - nIndex;
				// needle should start from index 0
				nIndex = 0;
			}
			// check if needleIndex reached needle length
			if (nIndex == nLen) {
				// return the first index
				return i - nLen + 1;
			}
		}
		return -1;
	}
}