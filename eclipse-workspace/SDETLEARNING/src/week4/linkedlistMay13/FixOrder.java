package week4.linkedlistMay13;

public class FixOrder {

  public static void main(String[] args) {
    LinkedList ll  = new LinkedList();
    ll.add("1");
    ll.add("2");
    ll.add("3");
    ll.add("a");
    ll.add("b");
    ll.add("c");
    System.out.println(ll);

    LinkedList.Node numbers = ll.start;
    LinkedList.Node alpha = ll.start;
    int pos = ll.size / 2;
    int count = 1;
    while (count < pos) {
      alpha = alpha.next;
      count ++;
    }
    System.out.println(alpha.data);
    // Loop

    while (alpha.next.next != null) {
      LinkedList.Node temp = alpha.next;
      alpha.next = temp.next;
      temp.next = numbers.next;
      numbers.next = temp;
      numbers = numbers.next.next;
    }
    System.out.println(ll);
  }
}
