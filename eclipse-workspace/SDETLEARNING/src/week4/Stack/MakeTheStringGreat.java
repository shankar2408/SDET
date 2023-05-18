package week4.Stack;

import org.junit.Test;
import java.util.*;

public class MakeTheStringGreat {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/make-the-string-great/description/
	 */

	@Test
	public void example1() {
		String s = "LeEeetcode";
		System.out.println(makeGood(s));

	}

	@Test
	public void example2() {
		String s = "abBAcC";
		System.out.println(makeGood(s));

	}

	@Test
	public void example3() {
		String s = "Pp";
		System.out.println(makeGood(s));


	}
	

    public String makeGood(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i=0; i<s.length(); i++){
                if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32) {          
                  stack.pop();
                }
                else
                    stack.push(s.charAt(i));
                
            }
            
            StringBuilder ans = new StringBuilder();
            for(char c:stack){
                ans.append(c);
            }
            return ans.toString();
        }
    }