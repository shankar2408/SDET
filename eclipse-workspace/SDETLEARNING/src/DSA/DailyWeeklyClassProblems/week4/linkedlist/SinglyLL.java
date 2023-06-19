package DSA.DailyWeeklyClassProblems.week4.linkedlist;

public class SinglyLL {

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.add("5");
    ll.add("23");
    ll.add("7");
    ll.add("13");
    System.out.println(ll);

    ll.insert(3, "11");
    System.out.println(ll);
    ll.insert(1, "1");
    System.out.println(ll);
    ll.insert(7, "100");
    System.out.println(ll);
    ll.insert(2, "11");
    System.out.println(ll);

    ll.removeElement("11");
    System.out.println(ll);
    ll.removeElement("100");
    System.out.println(ll);
    ll.removeElement("1");
    System.out.println(ll);
    ll.removeElement("5");
    System.out.println(ll);
    ll.removeElement("23");
    System.out.println(ll);
    ll.removeElement("7");
    System.out.println(ll);
    ll.removeElement("13");
    System.out.println(ll);

  }
}

class LinkedList {
  class Node {
    String data = null;
    Node next = null;
  }

  Node start = null;
  int size = 0;

  void insert (int index, String data) {
    if(index > size + 1 || index < 1) {
      throw new IndexOutOfBoundsException("Index : " + index + " size : " + size);
    }

    Node node = new Node();
    node.data = data;

    if(index == 1) {
      node.next = start;
      start = node;
      size ++;
      return;
    }

    int count = 1;
    Node current = start;
    while (count < index - 1) {
      current = current.next;
      count ++;
    }
    node.next = current.next;
    current.next = node;

    size ++;
  }

  void removeElement (String number) {
    while (start != null && start.data.equals(number)) {
      start = start.next;
      size --;
    }

    if(start == null || start.next == null) {
      return;
    }
    Node current = start.next;
    Node previous = start;
    while (current != null) {
      if (current.data.equals(number)) {
        previous.next = current.next;
        size--;
      }
      previous = current;
      current = current.next;
    }
  }

  void add (String data) {
    Node node = new Node();
    node.data = data;
    if (start == null) {
      start = node;
    } else {
      Node current = start;
      while (current.next != null) {
        current = current.next;
      }
      current.next = node;
    }
    size ++;
  }

  @Override
  public String toString () {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    Node current = start;
    while (current != null) {
      sb.append(current.data + ", ");
      current = current.next;
    }
    sb.append("] --> " + size);
    return sb.toString();
  }
}