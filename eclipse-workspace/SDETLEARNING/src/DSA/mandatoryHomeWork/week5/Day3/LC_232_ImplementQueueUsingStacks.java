package DSA.mandatoryHomeWork.week5.Day3;

import java.util.Stack;

public class LC_232_ImplementQueueUsingStacks {
	
	 Stack<Integer> st;
		Stack<Integer> q;

	    public LC_232_ImplementQueueUsingStacks() {
	        this.st =  new Stack<Integer>();
	        this.q = new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        st.push(x);
	    }
	    
	    public int pop() {
	        int ans;
			while(!st.isEmpty()) {
				q.push(st.pop());
			}
			ans = q.pop();
			
			while(!q.isEmpty()) {
				st.push(q.pop());
			}
			
			return ans;
	    }
	    
	    public int peek() {
	       int ans;
			while(!st.isEmpty()) {
				q.push(st.pop());
			}
			
			ans = q.pop();
			st.push(ans);
			
			while(!q.isEmpty()) {
				st.push(q.pop());
			}
			
			return ans;
	    }
	    
	    public boolean empty() {
	        return q.isEmpty() && st.isEmpty();
	    }

}