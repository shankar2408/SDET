package DSA.mandatoryHomeWork.week2.Day2;

import org.junit.Test;

public class LC_1768_MergeStringsAlternately {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/merge-strings-alternately/description/
	 */

	@Test // +ve
	public void example1() {
		String word1 = "abc";
		String word2 = "xyz";
		System.out.println(bruteForce(word1, word2));

	}

	@Test // edge
	public void example2() {
		String word1 = "ab";
		String word2 = "pqrs";
		System.out.println(bruteForce(word1, word2));
	}

	@Test // negative
	public void example3() {
		String word1 = "abcd";
		String word2 = "pq";
		System.out.println(bruteForce(word1, word2));
	}

	/*
	 * Brute force !! Psuedo code here: declare empty string declare i and j=0 use
	 * while loop for iterating based on word1 and word2 length condition if word1
	 * length condition matched print word1 char in output string and if word2
	 * length condition matched print word2 char by using charAt to output string
	 * increment both i and j return output after the end of loop
	 */
//Time complexity-O(n), SC=O(1)
	private String bruteForce(String word1, String word2) {
		String output = "";
		int i = 0, j = 0;

		while (i < word1.length() || j < word2.length()) {
			if (i < word1.length()) {
				output = output + word1.charAt(i);
			}
			if (j < word2.length()) {
				output = output + word2.charAt(j);
			}
			i++;
			j++;
		}
		return output;

	}
}
