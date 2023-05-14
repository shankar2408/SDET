package week4;

import java.util.Stack;

import org.junit.Test;

public class EncodeDecodeStringUsingStack {
	
	@Test
	public void example7() {
		String encoded = "3[a2[bc]]";
		System.out.println(decoded(encoded));
	}

	public String decoded(String str) {
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<str.length(); i++) {
			//1.if you see a ]
			if(str.charAt(i)==']') {
			String s="";
			Character ch=stack.pop();
			//1.a, pop out the character till you see [
			while(ch !='[') {
				s=ch+s;
				ch=stack.pop();
			}
			//1.b, The next character that you pop will be the no. of times to repeat
			ch=stack.pop();
			int repeat=ch - '0';
			//1.c, compute the repeated string
			String s1="";
			for(int j=1; j<=repeat; j++) {
				s1=s1+s;
			}
			//1.d, Add the computed string into stack
			for(int j=0; j<s1.length(); j++) {
				stack.push(s1.charAt(j));
			}
			
			}
			//2. Add the character in the stack
			else {
				stack.push(str.charAt(i));
			}
		}
		String output="";
		while(stack.size() !=0){
			output=stack.pop()+output;
		}
		
		return output;	
	}


}
