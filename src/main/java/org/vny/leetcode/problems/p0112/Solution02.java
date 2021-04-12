package org.vny.leetcode.problems.p0112;

import java.util.Queue;
import java.util.LinkedList;

public class Solution02 implements Main {

  @Override
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    Queue<TreeNode> q = new LinkedList<>();
    Queue<Integer> sumq = new LinkedList<>();
    TreeNode cur = root;
    q.add(cur);
    sumq.add(cur.val);
    while (!q.isEmpty()) {
      cur = q.remove();
      int tmp = sumq.remove();
      if (cur.left == null && cur.right == null && tmp == targetSum) {
        return true;
      }
      if (cur.left != null) {
        q.add(cur.left);
        sumq.add(cur.left.val + tmp);
      }
      if (cur.right != null) {
        q.add(cur.right);
        sumq.add(cur.right.val + tmp);
      }
    }
    return false;
  }
}

