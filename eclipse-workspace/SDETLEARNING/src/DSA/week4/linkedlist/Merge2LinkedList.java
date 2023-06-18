package DSA.week4.linkedlist;

import org.junit.Test;
import java.util.*;

public class Merge2LinkedList {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    ListNode head = null, tail =null;

    public ListNode addAll(int[] input){
        for(int value: input)
            if(head == null)
                head = tail = new ListNode(value);
            else
                tail = tail.next = new ListNode(value);
        return head;
    }

    @Override
    public String toString(){
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        return list.toString();
    }

    private ListNode mergeList(ListNode head1, ListNode head2){


        ListNode head , tail;

        if(head1.val < head2.val){
            tail = head = new ListNode(head1.val);
            head1 = head1.next;
        }else{
            tail = head = new ListNode(head2.val);
            head2 = head2.next;
        }


        while(head1 != null & head2 !=null){
            if(head1.val < head2.val){
                tail = tail.next =  new ListNode(head1.val);
                head1 = head1.next;
            }else{
                tail = tail.next =  new ListNode(head2.val);
                head2 = head2.next;
            }
        }
        if(head1 != null)
            tail.next = head1;
        else
            tail.next = head2;
       
        return head;
    }



    @Test
    public void test(){
        ListNode head1 = new Merge2LinkedList().addAll(new int[]{1,2,4,5,6,8}),
                head2 = new Merge2LinkedList().addAll(new int[]{1,3,4});

       ListNode newHead = mergeList(head1, head2);
       print(newHead);
    }


    private void print(ListNode node){
        while(node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }





}