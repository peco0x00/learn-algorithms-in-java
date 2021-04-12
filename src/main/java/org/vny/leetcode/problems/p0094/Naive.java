package org.vny.leetcode.problems.p0094;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Naive implements Main {

  @Override
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    if (root == null) return res;
    Stack<TreeNode> sk = new Stack<>();
    TreeNode cur = root;
    while (cur != null || !sk.isEmpty()) {
      if (cur != null) {
        sk.push(cur);
        cur = cur.left;
      } else {
        cur = sk.pop();
        res.add(cur.val);
        cur = cur.right;
      }
    }
    return res;
  }
}

