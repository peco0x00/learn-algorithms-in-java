package org.vny.leetcode.offer.p0028;

import java.util.Stack;

public class Naive01 implements Main {

  @Override
  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    return helper(root.left, root.right);
  }

  private boolean helper(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 == null) return true;
    if (t1 == null || t2 == null || t1.val != t2.val) {
      return false;
    }
    return helper(t1.left, t2.right) && helper(t1.right, t2.left);
  }
}

