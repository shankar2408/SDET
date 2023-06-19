package DSA.mandatoryHomeWork.week5.Day5;
//package week5.Day5;
//
//public class LC_92_ReverseLinkedListII {
//
//	@Test
//	public void TC1() {
//		int[] arr = { 1, 3};
//		int left = 2;
//		int right = 2;
//		ListNode h = SingleLinkedList.create(arr);
//		ListNode ans = reverseBetween(h, left, right);
//
//		while (ans != null) {
//			System.out.println(ans.val);
//			ans = ans.next;
//		}
//
//	}
//
//	public ListNode reverseBetween(ListNode head, int left, int right) {
//		if(head == null) return head;
//		int i = 0;
//		ListNode root = head;
//		ListNode first = null;
//		
//		while(root != null && i+1 < left) {
//			first = root;
//			root = root.next;
//			i++;
//		}
//		
//		if(left != 1) first.next = null;
//		
//		ListNode last = null;
//		ListNode revNode = root;
//		
//		while(revNode != null && i+1 < right) {
//			i++;
//			revNode = revNode.next;
//		}
//		
//		if(revNode.next != null) last = revNode.next;
//		revNode.next = null;
//		
//		root = reverse(root);
//		
//		if(first != null) {
//			first.next = root;
//		}
//		ListNode temp = root;
//		while(temp.next != null) {
//			temp = temp.next;
//		}
//		
//		if(temp != null) temp.next = last;
//		return first == null ? root : head; 
//	}
//
//	public ListNode reverse(ListNode head) {
//		if (head == null)
//			return head;
//		ListNode temp = head;
//		ListNode prev = null;
//
//		while (temp != null) {
//			ListNode nn = temp.next;
//			temp.next = prev;
//			prev = temp;
//			temp = nn;
//		}
//
//		return prev;
//	}
//
//}