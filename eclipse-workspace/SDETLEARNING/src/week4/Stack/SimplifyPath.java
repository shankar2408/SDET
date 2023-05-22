package week4.Stack;

import java.util.Stack;

import org.junit.Test;

public class SimplifyPath {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/simplify-path/description/
	 */

	@Test
	public void example1() {
		String s = "/home/";
		System.out.println(simplifyPath(s));

	}

	@Test
	public void example2() {
		String s = "/../";
		System.out.println(simplifyPath(s));

	}

	@Test
	public void example3() {
		String s = "/home//foo/";
		System.out.println(simplifyPath(s));


	}
	
	@Test
	public void example4() {
		String s = "/a/./b/../../c/";
		System.out.println(simplifyPath(s));


	}
	
	/*
	 * create stack and split the string using /
	 * use for each for iteration
	 * if condition equals "." or is empty continue the loop
	 * else if condition equals ".." and stack is not empty, stack.pop
	 * else push the value into stack
	 * return start with / and use string join with / for returning the string of value 
	 */
	

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();    
        String[] directories = path.split("/"); 
        for (String dir : directories)
        { 
            if (dir.equals(".") || dir.isEmpty())
            { 
                continue;
            }
            else if (dir.equals(".."))
            { 
                if (!stack.isEmpty())
                { 
                    stack.pop();
                }
            }
            else
            { 
                stack.push(dir);
            }
        }
        return "/" + String.join("/", stack); 
    }
}