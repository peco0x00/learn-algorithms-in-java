package org.vny.leetcode.offer.p0054;

import java.util.Stack;

public class Naive implements Main {

  // using right-first inorder traverse
  // running time beat 41.44% of users
  // using space beat 61.04% of users
  @Override
  public int kthLargest(TreeNode root, int k) {
    Stack<TreeNode> sk = new Stack<>();
    sk.push(root);
    TreeNode cur = root;
    int count = 0;
    while (cur != null || !sk.isEmpty()) {
      if (cur != null) {
        sk.push(cur);
        cur = cur.right;
      } else {
        cur = sk.pop();
        if (++count == k) {
          return cur.val;
        }
        cur = cur.left;
      }
    }
    return 0;
  }
}
