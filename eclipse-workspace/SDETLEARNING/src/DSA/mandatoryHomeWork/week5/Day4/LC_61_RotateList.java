package DSA.mandatoryHomeWork.week5.Day4;
//package week5.Day4;
//
//public class LC_61_RotateList {
//	
//	@Test
//	public void TC1() {
//		int[] arr = {1,2,3};
//		int left = 2000000000;
//		ListNode h = SingleLinkedList.create(arr);
//		ListNode ans = rotateRight(h, left);
//		
//		while(ans!=null) {
//			System.out.println(ans.val);
//			ans = ans.next;		
//		}
//
//}
//	
//	public ListNode rotateRight(ListNode head, int k) {
//        int size = sizeOfNode(head);
//        
//        k = k%size;
//        return recurse(head, k);
//
//    }
//	
//	public ListNode recurse(ListNode head, int k) {
//        if(head == null || k == 0 || head.next == null) return head;
//        ListNode temp = head.next;
//        ListNode prev = head;
//
//        while(temp.next != null){
//            prev = prev.next;
//            temp = temp.next;
//        }
//
//        temp.next = head;
//        prev.next = null;
//        head = temp;
//
//        return rotateRight(head, k-1);
//
//    }
//	
//	public int sizeOfNode(ListNode root){
//        int size = 0;
//
//        while(root != null){
//            root = root.next;
//            size++;
//        }
//
//        return size;
//    }
//}