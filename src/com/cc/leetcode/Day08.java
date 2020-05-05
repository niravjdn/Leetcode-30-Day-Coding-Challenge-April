package com.cc.leetcode;

// Middle of LinkedList
public class Day08 {
  public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = slow;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }

    return slow;
  }
}
