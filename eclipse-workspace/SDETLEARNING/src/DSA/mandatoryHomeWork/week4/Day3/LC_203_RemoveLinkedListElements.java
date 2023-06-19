package DSA.mandatoryHomeWork.week4.Day3;
//package week4.Day3;
//
//import org.junit.Test;
//
//public class LC_203_RemoveLinkedListElements {
//		
//		
//		@Test
//		public void TC1() {
//			int[] arr = {1,2,6, 3, 4, 5, 6};
//			int no = 6;
//			ListNode h = SingleLinkedList.create(arr);
//			ListNode ans = removeElements(h,no);
//			
//			while(ans!=null) {
//				System.out.println(ans.val);
//				ans = ans.next;		
//			}
//
//	}
//
//		private ListNode removeElements(ListNode head, int val) {
//			
//			if(head==null) return head;
//			
//			ListNode current = head;
//			ListNode prev = current;
//			
//			while(current!=null) {
//				if(current.val ==  val) {
//					prev.next = current.next;
//					current = prev;
//				}
//				prev = current;
//				current = current.next;
//			}
//			
//			if(head.val == val) head = head.next;
//			
//			return head;
//		}
//	}