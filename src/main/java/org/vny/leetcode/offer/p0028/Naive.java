package org.vny.leetcode.offer.p0028;

import java.util.Stack;

public class Naive implements Main {

  // solve this by myself!
  // running time beat 100% of users
  // using space beat 11% of users
  // awesome! (kind of)
  @Override
  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    return helper(root.left, root.right);
  }

  // return true if t1 and t2 is symmetric
  private boolean helper(TreeNode t1, TreeNode t2) {
    if (t1 == null ^ t2 == null) return false;
    if (t1 == null && t2 == null) return true;
    if (t1.val != t2.val) return false;
    return helper(t1.left, t2.right) && helper(t1.right, t2.left);
  }
}

