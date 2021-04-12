package org.vny.leetcode.interview.p0403;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Naive implements Main {

  @Override
  public ListNode[] listOfDepth(TreeNode tree) {
    List<ListNode> res = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();
    TreeNode cur;
    q.offer(tree);
    while (!q.isEmpty()) {
      ListNode p = new ListNode(-1);
      ListNode head = p;
      for (int i = q.size(); i > 0; i--) {
        cur = q.remove();
        p.next = new ListNode(cur.val);
        p = p.next;
        if (cur.left != null) q.offer(cur.left);
        if (cur.right != null) q.offer(cur.right);
      }
      res.add(head.next);
    }
    return res.toArray(new ListNode[0]);
  }
}
