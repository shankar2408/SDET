package DSA.mandatoryHomeWork.week5.Day2;

import org.junit.Test;
import java.util.*;

public class LC_1678_GoalParserInterpretation {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		String s="G()(al)";
		System.out.println(interpret(s));
	}

	@Test // edge
	public void example2() {
		String s="G()()()()(al)";
		System.out.println(interpret(s));
	}

	@Test // negative
	public void example3() {
		String s="(al)G(al)()()G";
		System.out.println(interpret(s));
	}


	 public String interpret(String command) {
	     Stack<Character> stack=new Stack<>(); 
	     String str="";
	     for(int i=0; i<command.length(); i++) {
	    	 if(command.charAt(i)=='G') {
	    		 stack.add(command.charAt(i));
	    	 }else if(command.charAt(i)=='(' && command.charAt(i+1)==')') {
	    		stack.add('o'); 
	    	 }else if(command.charAt(i)=='(' && command.charAt(i+1)=='a') {
	    		 stack.add('a');
	    		 stack.add('l');
	    	 }
	    	 
	     }
		 while(!stack.isEmpty()) {
			 str=stack.pop()+str;
		 }
	     
		 return str;
	    }
	 
	 public String interpret1(String command) {
	        StringBuilder sb = new StringBuilder("");
	        for(int i=0;i<command.length();i++){
	            if(command.charAt(i)=='G'){
	                sb.append("G");
	            }
	            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
	                sb.append("o");
	            }
	            if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
	                sb.append("al");
	            }
	        }
	        
	        return sb.toString();
	    }
	}
