package DSA.mandatoryHomeWork.week5.Day2;
//package week5.Day2;
//
//public class LC_19_RemoveNthNodeFromEndOfList {
//	
//	
//	@Test
//	public void TC1() {
//		int[] arr = {1,2};
//		int no = 3;
//		ListNode h = SingleLinkedList.create(arr);
//		ListNode ans = removeNthFromEnd(h,no);
//		
//		while(ans!=null) {
//			System.out.println(ans.val);
//			ans = ans.next;		
//		}
//
//}
//
//	public ListNode removeNthFromEnd(ListNode head, int n) {
//		if(head == null) return head;
//		int size = sizeOfNode(head);
//		if(size == n) {
//			head = head.next;
//			return head;
//		}
//		if(n > size) return head;
//	
//		
//		ListNode current = head;
//		
//
//		while (current != null && size-1>n) {
//			current = current.next;
//			size--;
//		}
//
//		current.next = current.next.next;
//		
//		
//		return head;
//	}
//
//	 public int sizeOfNode(ListNode root){
//	        int size = 0;
//
//	        while(root != null){
//	            root = root.next;
//	            size++;
//	        }
//
//	        return size;
//	    }
//}