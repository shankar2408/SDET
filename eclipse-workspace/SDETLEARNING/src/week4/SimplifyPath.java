package week4;

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