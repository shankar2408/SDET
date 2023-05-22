package week5.QueueMay20;

public class QueueImplementation {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		System.out.println(queue);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue);
		queue.enqueue(40);
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		
		
	}
}
class Queue {
	class Node {
		int number;
		Node next;
	}
	private Node start;
	private Node end;
	private int size = 0;
	void enqueue(int no) {
		// Created a new Node
		Node node = new Node();
		node.number = no;
		// Handling the insertion of 1st element
		if (start == null) {
			start = node;
			end = node;
		}
		// Handling the case of regular insertion at end.
		else {
			end.next = node;
			end = node;
		}
		size++;
	}


	@Override
	public String toString () {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		Node current = start;
		while (current != null) {
			sb.append(current.number + ", ");
			current = current.next;
		}
		sb.append("] --> " + "size: " + size);
		return sb.toString();
	}
	int dequeue() {
		// Handling if the queue is empty
		if(start==null) {
			throw new NullPointerException("Queue is already empty");
		}
		// Handling the case where we have only one element in the queue
		int temp=start.number;
		if(start==end) {
			start=null;
			end=null;
		}
		// Handle the case of a regular removal
		else {
			start=start.next;
		}
		size--;
		return temp;
	}

}

