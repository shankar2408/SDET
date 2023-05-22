package week4.Stack;

import org.junit.Test;
import java.util.*;

public class BackspaceStringCompareMay16 {

	/*
	 * Question here !!
	 * https://leetcode.com/problems/backspace-string-compare/description/
	 */

	@Test // +ve
	public void example1() {
		String s="ab#c";
		String t="ad#c";
		System.out.println(backspaceCompare1(s,t));
	}

	@Test // edge
	public void example2() {
		String s="ab##";
		String t="c#d#";
		System.out.println(backspaceCompare1(s,t));
	}

	@Test // negative
	public void example3() {
		String s="a#c";
		String t="b";
		System.out.println(backspaceCompare1(s,t));
	}
	
	@Test // negative
	public void example4() {
		String s="a##c";
		String t="#a#c";
		System.out.println(backspaceCompare1(s,t));
	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * use stack and for loop
	 * if # & !stack is empty, pop last value
	 * else add it in stack
	 * comapare both s & t are equal and return the boolean
	 */

	//String s="ab#c";
	//String t="ad#c";
    public boolean backspaceCompare(String s, String t) {
		String val1="";
		String val2="";
		
		Stack<Character> stack1=new Stack<>();
		Stack<Character> stack2=new Stack<>();
		for(int i=0; i<s.length(); i++) {
		if(s.charAt(i)!='#') {
			stack1.push(s.charAt(i));
		}else if(s.charAt(i)=='#'&& !stack1.isEmpty()) {
			stack1.pop();
		}	
		}
		
		for(int i=0; i<t.length(); i++) {
			if(t.charAt(i)!='#') {
				stack2.push(t.charAt(i));
			}else if(t.charAt(i)=='#' && !stack2.isEmpty()) {
				stack2.pop();
			}	
			}
		while(!stack1.isEmpty()){
			val1=stack1.pop()+val1;
        }
		System.out.println(val1);
		while(!stack2.isEmpty()){
			val2=stack2.pop()+val2;
        }
		System.out.println(val2);

    	return val1.equals(val2);
	

	}
    
    public boolean backspaceCompare1(String s, String t) {
        return backspaced(s).equals(backspaced(t));
    }

    public String backspaced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            }
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return stack.toString();
    }
}
