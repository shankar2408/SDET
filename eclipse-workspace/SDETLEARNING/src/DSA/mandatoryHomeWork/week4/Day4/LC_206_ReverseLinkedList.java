package DSA.mandatoryHomeWork.week4.Day4;
//package week4.Day4;
//
//public class LC_206_ReverseLinkedList {
//
//	@Test
//	public void TC1() {
//		int[] arr = {1, 1, 2, 1};
//		ListNode h = SingleLinkedList.create(arr);
//		ListNode ans = createNode(h);
//		while(ans!=null) {
//			System.out.println(ans.val);
//			ans = ans.next;		
//		}
//}
//
//	private ListNode reverseLL(ListNode head) {
//		
//		if(head == null) return null;
//		
//		ListNode prev = head;
//        head = head.next;
//		prev.next = null;
//		
//		while(head != null) {
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
