package org.vny.leetcode.offer.p0055;

public class Naive implements Main {

  // awful...
  // running time beat 6.7% of users
  // using space beat 6.46% of users
  @Override
  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    boolean left = isBalanced(root.left);
    boolean right = isBalanced(root.right);
    if (!(left && right)) return false;
    return Math.abs(height(root.left) - height(root.right)) <= 1;
  }

  private int height(TreeNode root) {
    if (root == null) return 0;
    return Math.max(height(root.left), height(root.right)) + 1;
  }
}
