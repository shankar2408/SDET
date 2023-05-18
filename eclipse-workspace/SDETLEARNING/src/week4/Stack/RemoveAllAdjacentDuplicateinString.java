package week4.Stack;

import org.junit.Test;
import java.util.*;

public class RemoveAllAdjacentDuplicateinString {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
	 * description/
	 */

	@Test // +ve
	public void example1() {
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}

	@Test // edge
	public void example2() {
		String s = "azxxzy";
		System.out.println(removeDuplicates(s));
	}

	
	public String removeDuplicates(String s) {
		Stack<Character> stack = new Stack<>();
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && s.charAt(i)== stack.peek()) {
				stack.pop();
			}else {
				stack.push(s.charAt(i));
			}

		}
		while (!stack.isEmpty()) {
			output = stack.pop()+output;
		}

		return output;
	}
}
