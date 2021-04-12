package org.vny.leetcode.offer.p0055;

public class Solution01 implements Main {

  // post order tarverse + pruning
  @Override
  public boolean isBalanced(TreeNode root) {
    return recur(root) != -1;
  }

  // if balanced, return height
  // if not, return -1
  private int recur(TreeNode root) {
    if (root == null) return 0;
    int left = recur(root.left);
    if (left == -1) return -1;
    int right = recur(root.right);
    if (right == -1) return -1;
    return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
  }
}
