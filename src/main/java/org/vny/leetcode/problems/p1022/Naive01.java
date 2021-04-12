package org.vny.leetcode.problems.p1022;

import java.util.Queue;
import java.util.LinkedList;

public class Naive01 implements Main {

  // using bfs
  // running time beat 7% of users
  // using space beat 5% of users
  // awful...
  @Override
  public int sumRootToLeaf(TreeNode root) {
    int sum = 0;
    Queue<TreeNode> q = new LinkedList<>();
    Queue<String> qv = new LinkedList<>();
    TreeNode cur = root;
    q.add(cur);
    qv.add("" + cur.val);
    while (!q.isEmpty()) {
      cur = q.remove();
      String tmp = qv.remove();
      if (cur.left == null && cur.right == null) {
        sum += Integer.valueOf(tmp, 2);
      }
      if (cur.left != null) {
        q.add(cur.left);
        qv.add(tmp + cur.left.val);
      }
      if (cur.right != null) {
        q.add(cur.right);
        qv.add(tmp + cur.right.val);
      }
    }
    return sum;
  }
}
