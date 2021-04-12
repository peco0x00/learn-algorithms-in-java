package org.vny.leetcode.offer.p0054;

import java.util.Stack;

public class Naive01 implements Main {

  int count = 0;
  int res = 0;

  // using right-first inorder traverse recursively
  // running time beat 100% of users
  // using space beat 85.16% of users
  @Override
  public int kthLargest(TreeNode root, int k) {
    helper(root, k);
    return res;
  }

  private void helper(TreeNode root, int k) {
    if (root == null) return;
    helper(root.right, k);
    if (++count == k) {
      res = root.val;
      return;
    }
    helper(root.left, k);
  }
}
