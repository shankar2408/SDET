package week5.Day4;

import java.util.LinkedList;
import java.util.Queue;

public class LC_225_ImplementStackUsingQueues {
	
	 Queue<Integer> q;

		public LC_225_ImplementStackUsingQueues() {
			this.q =  new LinkedList<>();
		}

		public void push(int x) {
			if(q.isEmpty()) q.add(x);
			else {
				int size = q.size();
				while(size > 0) {
					q.add(q.poll());
					size--;
				}
				q.add(x);
				
				size = q.size()-1;
				while(size > 0) {
					q.add(q.poll());
					size--;
				}
			}
		}

		public int pop() {
			return q.poll();
		}

		public int top() {
			return q.peek();

		}

		public boolean empty() {
			return q.isEmpty();
		}

}