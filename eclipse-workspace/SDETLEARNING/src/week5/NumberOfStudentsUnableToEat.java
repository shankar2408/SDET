package week5;

import org.junit.Test;
import java.util.*;

public class NumberOfStudentsUnableToEat {
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] students = {1,1,0,0};
		int[] sandwiches = {0,1,0,1};

		System.out.println(countStudents(students,sandwiches));
	}

	@Test // edge
	public void example2() {
		int[] students = {1,1,1,0,0,1};
		int[] sandwiches = {1,0,0,0,1,1};

		System.out.println(countStudents(students,sandwiches));
	}


	 public int countStudents(int[] students, int[] sandwiches) {
         Stack<Integer> stack=new Stack<>();
       Deque<Integer> dq=new LinkedList<>();
       // -Pushing Sandwiches in Stack
       for (int i = sandwiches.length-1; i>=0; i--) {
          stack.push(sandwiches[i]);
       }
       // - Created Deque to add from both side
       for (int i = 0; i < students.length; i++) {
           dq.add(students[i]);
       }
       int eaten=0;
//To make sure that we dont get stuck in infinte Loop
       int count= 0;
       while (!stack.isEmpty()){
//If equal then Remove those elements from stack and queue
           if (Objects.equals(stack.peek(), dq.peek())){
               count=0;
               eaten++;
               stack.pop();
               dq.poll();
           }else {
//Else remove the first element and move it to last
               count++;
               int temp = dq.peekFirst();
               dq.pollFirst();
               dq.addLast(temp);
           }
//If this condition hits that means we have checked for all and no more comparisons are required
           if (count==dq.size()){
               break;
           }
       }
       return students.length-eaten;
   }
	 
	 public int countStudents1(int[] students, int[] sandwiches) 
	 {//T-> O(n^2) S->O(n)
		Queue<Integer> line=new LinkedList<Integer>();
		Stack<Integer> menu=new Stack<Integer>();

		for(int i: students)//pushing the students into the queue according to the probleem statement
	        {
		     line.offer(i);
		}

		for(int i=sandwiches.length-1;i>=0;i--)//pushing in reverse order it order to acess the top at first 
	        {
		    menu.push(sandwiches[i]);
		}

		int counter=line.size()*menu.size();//maximum possible iteration possible 
		while(counter-->0)
	        {
			if((!menu.isEmpty())&&line.peek()==menu.peek())//if the student has got the sandwitch he wants 
	                {
			    line.poll();
			    menu.pop();
			}
			else//if the student has not got the sandwitch he wants 
	                {
	                   if(line.size()>0)//waiting for the desired sandwich in the line 
	                   {
			      line.offer(line.remove());//removing from the front of the queue and adding at the rear of the queue 
	                   }
	                   else
	                      return 0;//if line size is zero means every student has got the sandwitch, no one is left to consume sandwitch so returning zero 
			}
	        }
		return line.size();
	 }//Please do vote me, It helps a lot
	
}