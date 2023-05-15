package week4.May15;

import org.junit.Test;
import java.util.*;

public class BaseballGame {
	
	/*
	 * Question here !!
	 * https://leetcode.com/problems/baseball-game/submissions/950527329/
	 */

	@Test // +ve
	public void example1() {
		String[] str = {"5","2","C","D","+"};
		System.out.println(calPoints(str));
	}

	@Test // edge
	public void example2() {
		String[] str = {"5","-2","4","C","D","9","+","+"};
		System.out.println(calPoints(str));
	}

	@Test // negative
	public void example3() {
		String[] str = {"1","C"};
		System.out.println(calPoints(str));
	}

	 /*pseudocode
    Use for loop for iteration
    If integer, add the integer in stack using push
    if C, delete the previous integer using pop
    if D, multiply the prev integer by 2 using peek
    if +, add prev 2 integer in the stack by using pop and store the value and then use peek to add the prev 2 integer and push the temp and then added value
    finally, add all the integer in the stack using pop until the stack is empty
    */
    public int calPoints1(String[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;

        for(int i=0; i<nums.length; i++){

            if(nums[i].equals("C") && !list.isEmpty()){
                list.remove(list.size()-1);
            }else if(nums[i].equals("D")){
                list.add(2 * list.get(list.size()-1));
            }else if(nums[i].equals("+")){
               list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }else{
                list.add(Integer.parseInt(nums[i]));
            }
        }
        for(int i:list){
            sum=sum+i;
        }
        return sum;
    }
    
    public int calPoints(String[] nums) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;

        for(int i=0; i<nums.length; i++){

            if(nums[i].equals("C") && !stack.isEmpty()){
                stack.pop();
            }else if(nums[i].equals("D")){
                stack.push(2 * stack.peek());
            }else if(nums[i].equals("+")){
                int currentTop=stack.pop();
                int prevTop=stack.peek();
                stack.push(currentTop);
               stack.push(currentTop+prevTop);
            }else{
                stack.push(Integer.parseInt(nums[i]));
            }
        }
        while(!stack.isEmpty()){
            sum=sum+stack.pop();
        }
        return sum;
    }
}