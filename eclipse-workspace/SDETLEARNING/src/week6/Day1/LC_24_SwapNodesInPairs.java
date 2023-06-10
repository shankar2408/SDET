//package week6.Day1;
//
//public class LC_24_SwapNodesInPairs {
//	ListNode out;
//	
//	@Test
//	public void TC1() {
//		int[] arr = {3, 5, 6, 7};
//		int left = 1;
//		int right = 2;
//		ListNode h = SingleLinkedList.create(arr);
//		ListNode ans = recurse(h);
//		
//		while(ans!=null) {
//			System.out.println(ans.val);
//			ans = ans.next;		
//		}
//
//}
//	
//	public ListNode recurse(ListNode root) {
//		if(root == null || root.next == null) return root;
//		
//		ListNode prev = root;
//		ListNode cur = root.next;
//		if(root.next.next == null) {
//			ListNode temp = prev;
//			cur.next = prev;
//			prev.next = null;
//			return cur;
//		}
//		ListNode last = root.next.next;
//		cur.next = last;
//		
//		return recurse(cur);
//	}
//
//}