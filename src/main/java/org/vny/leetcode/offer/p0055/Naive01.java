package org.vny.leetcode.offer.p0055;

public class Naive01 implements Main {

  // solve this by myself! awesome!
  // running time beat 100% of users
  // using space beat 91% of users
  @Override
  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    int left = height(root.left);
    int right = height(root.right);
    if (Math.abs(left - right) > 1) {
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }

  private int height(TreeNode root) {
    if (root == null) return 0;
    return Math.max(height(root.left), height(root.right)) + 1;
  }
}
