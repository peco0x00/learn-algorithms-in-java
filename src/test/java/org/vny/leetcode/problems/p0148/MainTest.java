package org.vny.leetcode.problems.p0148;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void sortList() {
    Main main = new Naive();
    ListNode head = new ListNode(4);
    head.next = new ListNode(2);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(3);

    ListNode res = main.sortList(head);

    ListNode ans = new ListNode(1);
    ans.next = new ListNode(2);
    ans.next.next = new ListNode(3);
    ans.next.next.next = new ListNode(4);

    assertEquals(ans, res);
  }
}
