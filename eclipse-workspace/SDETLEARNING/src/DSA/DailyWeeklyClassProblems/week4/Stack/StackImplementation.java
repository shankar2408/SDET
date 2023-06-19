package DSA.DailyWeeklyClassProblems.week4.Stack;

import java.util.EmptyStackException;
import java.util.*;

public class StackImplementation {
	
	
	public static void main(String[] args) {
	stack stack=new stack();
	stack.push('A');
	stack.push('B');
	stack.push('C');
	stack.push('D');
	System.out.println(stack);
	System.out.println(stack.pop());
	System.out.println(stack);
	System.out.println(stack.peek());
	System.out.println(stack);
	
	}

}

class stack{
	private int size=50;
	private Character stack[]=new Character[size];
	private int top=0;
	
	ArrayList<Integer> list=new ArrayList<>();
	
	boolean push(Character element) {
		if(top<size) {
			stack[top]=element;
			top++;
			//System.out.println(Arrays.toString(stack));
			return true;
		}
		return false;
	}
	
	Character pop() {
		Character element=null;
		if(top!=0) {
			element=stack[top-1];
			top--;
		}else {
			throw new EmptyStackException();
		}
		return element;
	}
	
	Character peek() {
		Character element =null;
		if(top!=0) {
			element=stack[top-1];
		}
		return element;
	}
	
	int getSize() {
		return top;
	}
	
	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		sb.append("[");
		for(int i=0; i<top; i++) {
			sb.append(stack[i] + ",");
		}
		sb.append("] -->"+getSize());
		return sb.toString();
	}
}
