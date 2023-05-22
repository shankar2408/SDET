package week4.linkedlistMay13;

import org.junit.Test;

public class Merge2LinkedList {

//	@Test
//	public void TC1() {
//		ListNode ll1 = [ 1, 2, 4 ];
//		ListNode ll2 = [ 1, 2, 4 ];
//		mergeTwoLists(ll1, ll2);
//	}
	
	 
	// Definition for singly-linked list.
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null && list2 == null)
			return null;
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		ListNode h1 = null;
		ListNode h2 = null;

		if (list1.val <= list2.val) {
			h1 = list1;
			h2 = list2;

		} else {
			h2 = list1;
			h1 = list2;
		}

		ListNode prev = null;
		ListNode head = h1;

		while (h1 != null && h2 != null) {
			if (h1.val <= h2.val) {
				prev = h1;
				h1 = h1.next;
			} else {
				prev.next = h2;
				ListNode temp = h2;
				h2 = h2.next;
				temp.next = h1;
				prev = temp;
			}
		}

		if (h1 == null) {
			prev.next = h2;
		}
		if (h2 == null)
			prev.next = h1;

		return head;

	}
}
