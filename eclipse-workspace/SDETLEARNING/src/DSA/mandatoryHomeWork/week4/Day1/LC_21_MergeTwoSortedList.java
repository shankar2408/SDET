package DSA.mandatoryHomeWork.week4.Day1;
//package week4.May15;
//
//import org.junit.Test;
//import java.util.*;
//
//public class Merge2SortedListUsingLinkedList {
//	/*
//	 * Question here !!
//	 * https://leetcode.com/problems/merge-two-sorted-lists/description/
//	 */
//
//	@Test // +ve
//	public void example1() {
//		int[] nums1= {1,2,4};
//		int[] nums2= {1,2,4};
//		System.out.println(mergeTwoLists(nums1,nums2));
//	}
//
//	
//	/**
//	 * Definition for singly-linked list.
//	 * public class ListNode {
//	 *     int val;
//	 *     ListNode next;
//	 *     ListNode() {}
//	 *     ListNode(int val) { this.val = val; }
//	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//	 * }
//	 */
//
//	 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//
//	        if(list1!=null && list2!=null){
//	        if(list1.val<list2.val){
//	            list1.next=mergeTwoLists(list1.next,list2);
//	            return list1;
//	            }
//	            else{
//	                list2.next=mergeTwoLists(list1,list2.next);
//	                return list2;
//	        }
//	        }
//	        if(list1==null)
//	            return list2;
//	        return list1;
//	    }
//	}