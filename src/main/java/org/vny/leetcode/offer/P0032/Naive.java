package org.vny.leetcode.offer.P0032;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Naive implements Main {

  @Override
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if (root == null) return res;
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(root);
    TreeNode cur;
    while (!q.isEmpty()) {
      List<Integer> lst = new LinkedList<>();
      for (int i = q.size(); i > 0; i--) {
        cur = q.remove();
        lst.add(cur.val);
        if (cur.left != null) q.offer(cur.left);
        if (cur.right != null) q.offer(cur.right);
      }
      res.add(lst);
    }
    return res;
  }
}
