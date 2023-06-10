package week4.Day5;

import java.util.Stack;

import org.junit.Test;

public class LC_1598_CrawlerLogFolder {
	/*
	 * Question here !!
	 * https://leetcode.com/problems/crawler-log-folder/description/
	 */

	@Test
	public void example1() {
		String[] s = {"d1/","d2/","../","d21/","./"};
		System.out.println(minOperations1(s));

	}

	@Test
	public void example2() {
		String[] s = {"d1/","d2/","./","d3/","../","d31/"};
		System.out.println(minOperations1(s));
	}

	@Test
	public void example3() {
		String[] s = {"d1/","../","../","../"};
		System.out.println(minOperations1(s));
	}
	
	@Test
	public void example4() {
		String[] s = {"./","../","./"};
		System.out.println(minOperations1(s));

	}
	

	public int minOperations(String[] logs) {
        Stack<String> stack=new Stack<>();
        for(String l:logs){
            if(!stack.isEmpty() && l.equals("../")){
                stack.pop();
            }else  if(stack.isEmpty() && l.equals("../") ){
                continue;
            }
            else if(!stack.isEmpty() && l.equals("./")){
                continue;
            }else if(stack.isEmpty() && l.equals("./")){
                continue;
            }
            else{
            	System.out.println(l);
                stack.add(l);
            }
        }
        int count=0;
        while(!stack.isEmpty()){
            stack.pop();
            count++;
        }
        return count;
    }
	
	 public int minOperations1(String[] logs) {
	        Stack<String> stack=new Stack<>();
        for(String log : logs){
            if(log.equals("../")){
                if(!stack.empty())
                    stack.pop();
            }else if(log.equals("./")){

            }else{
                stack.push(log);
            }
        }
        return stack.size();
    }
}
