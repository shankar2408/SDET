package DSA.week4.Stack;

import org.junit.Test;
import java.util.*;

public class ValidParanthesisStack {

	@Test
	public void example1() {
		String s = "[{}]";
		System.out.println(checkParentheses(s));
		System.out.println(isValid(s));

	}

	@Test
	public void example2() {
		String s = "(()())";
		System.out.println(checkParentheses(s));
		System.out.println(isValid(s));

	}

	@Test
	public void example3() {
		String s = "{]";
		System.out.println(checkParentheses(s));
		System.out.println(isValid(s));


	}

	@Test
	public void example4() {
		String s = "[()]))()";
		System.out.println(checkParentheses(s));
		System.out.println(isValid(s));


	}

	@Test
	public void example5() {
		String s = ")";
		System.out.println(checkParentheses(s));
		System.out.println(isValid(s));


	}

	@Test
	public void example6() {
		String s = "(((";
		System.out.println(checkParentheses(s));
		System.out.println(isValid(s));


	}

	@Test
	public void example7() {
		String s = "[]{}({})";
		System.out.println(checkParentheses(s));
		System.out.println(isValid(s));


	}
	
	/*
	 * Logic:
	 * 1.when you see opening bracket, insert into stack
	 * 2.When you see a closing bracket, 
	 * a.pop the top element from the stack b.Check if the brackets from the stack is in pair with bracket in string
	 */

	public boolean checkParentheses(String s) {

		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

	public boolean isValid(String s) {
		if (s.length() < 2)
			return false;

		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');

		Stack<Character> stack = new Stack<>();

		for (Character ch : s.toCharArray()) {
			if (map.containsKey(ch)) {
				if (!stack.isEmpty() && stack.peek() == map.get(ch)) {
					stack.pop();
				} else
					return false;
			} else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}
}