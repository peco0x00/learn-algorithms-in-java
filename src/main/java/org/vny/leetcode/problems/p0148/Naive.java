package org.vny.leetcode.problems.p0148;

public class Naive implements Main {

  @Override
  public ListNode sortList(ListNode head) {
    if (head == null) return null;
    return null;
  }

  private ListNode merge(ListNode low, ListNode mid, ListNode high) {
    ListNode res = new ListNode(-1);
    ListNode cur = res, i = low, j = mid.next;
    int val;
    while (i != mid.next || j != high.next) {
      if (i == mid.next) {
        val = j.val;
        j = j.next;
      }
      else if (j == high.next) {
        val = i.val;
        i = i.next;
      }
      else if (i.val < j.val) {
        val = i.val;
        i = i.next;
      }
      else {
        val = j.val;
        j = j.next;
      }
      cur.next = new ListNode(val);
      cur = cur.next;
    }
    return res.next;
  }
}
