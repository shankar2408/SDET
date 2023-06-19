package DSA.DailyWeeklyClassProblems.week4.linkedlist;

public class DoublyLL {

  public static void main(String[] args) {
    DoublyLinkedList dl = new DoublyLinkedList();
    dl.add("10");
    dl.add("20");
    dl.add("30");
    dl.add("40");
    System.out.println(dl);

    dl.insert(3, "11");
    System.out.println(dl);
    dl.insert(1, "1");
    System.out.println(dl);
    dl.insert(7, "100");
    System.out.println(dl);
    dl.insert(2, "11");
    System.out.println(dl);

    dl.removeElement("11");
    System.out.println(dl);
    dl.removeElement("100");
    System.out.println(dl);
    dl.removeElement("1");
    System.out.println(dl);
    dl.removeElement("10");
    System.out.println(dl);
    dl.removeElement("40");
    System.out.println(dl);
    dl.removeElement("20");
    System.out.println(dl);
    dl.removeElement("30");
    System.out.println(dl);
  }
}
class DoublyLinkedList {
  class Node {
    String data = null;
    Node next = null;
    Node previous = null;
  }

  Node start = null;
  int size = 0;

  void removeElement (String number) {

    while (start != null && start.data.equals(number)) {
      start = start.next;
      if(start != null) {
        start.previous = null;
      }
      size --;
    }

    Node current = start;
    while (current != null) {
      if(current.data.equals(number)) {
        current.previous.next = current.next;
        if (current.next != null) {
          current.next.previous = current.previous;
        }
        current.previous = null;
        size --;
      }
      current = current.next;
    }
  }

  void insert (int index, String data) {
    if (index > size + 1 || index < 1) {
      throw new IndexOutOfBoundsException("Index: " + index + " size: " + size);
    }
    Node node = new Node();
    node.data = data;

    if (index == 1) {
      node.next = start;
      start.previous = node;
      start = node;
      size ++;
      return;
    }
    Node current = start;
    int count = 1;
    while (count < index -1) {
      current = current.next;
      count += 1;
    }
    node.next = current.next;
    node.previous = current;
    if (current.next != null) {
      current.next.previous = node;
    }
    current.next = node;
    size ++;
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
      node.previous = current;
    }
    size ++;
  }

  @Override
  public String toString () {
    StringBuffer sb = new StringBuffer();
    sb.append("[");
    Node current = start;
    while (current != null) {
      sb.append(current.data + "(" + (current.previous != null ? current.previous.data : null) + "," + (current.next != null ? current.next.data : null) + ")");
      current = current.next;
      if(current != null) {
        sb.append(", ");
      }
    }
    sb.append("] --> " + size);
    return sb.toString();
  }
}