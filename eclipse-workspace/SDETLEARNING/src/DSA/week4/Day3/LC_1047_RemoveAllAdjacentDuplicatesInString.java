package DSA.week4.Day3;

import org.junit.Test;
import java.util.*;

public class LC_1047_RemoveAllAdjacentDuplicatesInString {
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
	
	/*
	 * pseudocode:
	 * convert string to char
	 * declare output string
	 * use for loop for iteration
	 * if not stack is empty and current and prev value is same, pop the stack
	 * else push the value to stack
	 * use while loop if not stack it empty, use pop to get value and store it in the output
	 * return output string
	 */

	
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
