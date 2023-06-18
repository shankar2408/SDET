package DSA.week5.Queue;

public class DequeExample {
    public static void main(String[] args) {
        Deque dq = new Deque();
        dq.addFirst(10);
        dq.addFirst(9);
        System.out.println(dq);
        dq.addFirst(8);
        dq.addFirst(7);
        System.out.println(dq);

        System.out.println(dq.removeFirst());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq);
        System.out.println(dq.removeFirst());
        System.out.println(dq);
        
        dq.addLast(10);
        dq.addLast(9);
        System.out.println(dq);
        dq.addLast(8);
        dq.addLast(7);
        System.out.println(dq);

        System.out.println(dq.removeLast());
        System.out.println(dq);
        System.out.println(dq.removeLast());
        System.out.println(dq);
        System.out.println(dq.removeLast());
        System.out.println(dq);
        System.out.println(dq.removeLast());
        System.out.println(dq);
    }
}

class Deque {
    class Node{
        int value;
        Node next = null;
        Node previous = null;
    }

    private Node start = null;
    private Node end = null;
    private int size = 0;

    void addFirst (int no) {
        Node node = new Node();
        node.value = no;

        // Adding the 1st no
        if (start == null) {
            start = node;
            end = node;
        }

        // We are doing a regular addition
        else {
            node.next = start;
            start.previous = node;
            start = node;
        }
        size++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = start;
        while (current != null) {
            sb.append(current.value + ", ");
            current = current.next;
        }
        sb.append("] --> Size: " + size);
        return sb.toString();
    }

    int removeFirst() {
        // The deque is empty
        if (start == null) {
            throw new NullPointerException("The Deque is already empty");
        }

        Node temp = start;
        // If there is only one element
        if (start == end) {
            start = null;
            end = null;
        }
        // Regular removal
        else {
            start.next.previous = null;
            start = start.next;
        }
        size--;
        return temp.value;
    }
    
    int removeLast() {
        // if The deque is empty
        if (start== null) {
            throw new NullPointerException("The Deque is already empty");
        }

        //if dq has only one element
        Node temp = start;
        if (start == end) {
            start = null;
            end = null;
        }
        // Regular removal
        else {
            end=end.previous;
            end.next =null;
        }
        size--;
        return temp.value;
    }
    
    void addLast (int no) {
        Node node = new Node();
        node.value = no;

        // adding at the 1st place
        if (end == null) {
            start = node;
            end = node;
        }

        // if we are doing an insertion for non 1st element in the dequeue
        else {
        	node.previous=end;
        	end.next=node;
        	end=node;
        }
        size++;
    }
}