package week3.May11;

import org.junit.Test;

public class SortingtheSentence {
	/*
	 * 1859. Sorting the Sentence
	 * https://leetcode.com/problems/sorting-the-sentence/
	 */

	@Test
	public void example() {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence(s));

	}

	@Test
	public void example1() {
		String s = "Myself2 Me1 I4 and3";
		System.out.println(sortSentence(s));

	}

	
	
	 public String sortSentence(String s) {
	        String[] arr = s.split(" ");
	        String[] sorted = new String[arr.length];

	        for (String str : arr) {
	            int len = str.length();
	            int index = str.charAt(len - 1) - '0';
	            sorted[index - 1] = str.substring(0, len - 1);
	        }
	        return String.join(" ", sorted);
	    }
	}