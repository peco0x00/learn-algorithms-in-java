package org.vny.leetcode.problems.p0002;

public class Naive implements Main {

  @Override
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(-1);
    ListNode ret = head;
    int a, b, c = 0;
    ListNode p1 = l1, p2 = l2;
    while (p1 != null || p2 != null) {
      int v1 = p1 == null ? 0 : p1.val;
      int v2 = p2 == null ? 0 : p2.val;
      a = v1 + v2 + c;
      b = a >= 10 ? a - 10 : a;
      c = a >= 10 ? 1 : 0;
      head.next = new ListNode(b);
      head = head.next;
      p1 = p1 == null ? null : p1.next;
      p2 = p2 == null ? null : p2.next;
    }
    if (c > 0) head.next = new ListNode(c);
    return ret.next;
  }
}
