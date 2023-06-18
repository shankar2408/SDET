package DSA.week4.Day5;
//package week4.Day5;
//
//public class LC_234_PalindromeLinkedList {
//
//	@Test
//	public void TC1() {
//		int[] arr = { 1, 1, 2, 1};
//		ListNode h = SingleLinkedList.create(arr);
//		boolean ans = PalindromeLL(h);
//		System.out.println(ans);
//	}
//
//	private boolean PalindromeLL(ListNode head) {
//		
//		if(head==null) return true;
//		ListNode h1 = createNode(head);
//		ListNode h2 = reverseLL(head);
//		
//		while(h2 != null) {
//			if(h2.val != h1.val) return false;
//			h2 = h2.next;
//			h1 = h1.next;
//		}
//
//		return true;
//	}
//
//	private ListNode reverseLL(ListNode head) {
//
//		if (head == null)
//			return null;
//
//		ListNode prev = head;
//		head = head.next;
//		prev.next = null;
//
//		while (head != null) {
//			ListNode temp = head.next;
//			head.next = prev;
//			prev = head;
//			head = temp;
//		}
//
//		return prev;
//	}
//	
//	public ListNode createNode(ListNode head) {
//		ListNode temp = new ListNode(head.val);
//		ListNode prev = temp;
//		head = head.next;
//		
//		while(head != null) {
//			ListNode nm = new ListNode(head.val);
//			temp.next = nm;
//			temp = temp.next;
//			head = head.next;
//		}
//		
//		return prev;
//		
//	}
//} 