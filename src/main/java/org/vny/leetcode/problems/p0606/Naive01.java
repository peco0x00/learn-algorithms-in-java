package org.vny.leetcode.problems.p0606;

import java.util.Stack;

public class Naive01 implements Main {

  // running time beat 51% of users
  // using space beat 46% of users
  @Override
  public String tree2str(TreeNode t) {
    return helper(t).toString();
  }

  private StringBuilder helper(TreeNode t) {
    if (t == null) return new StringBuilder();
    StringBuilder left = helper(t.left);
    StringBuilder right = helper(t.right);
    if (t.right != null) {
      left.insert(0, "(").append(")");
      right.insert(0, "(").append(")");
    } else if (t.left != null) {
      left.insert(0, "(").append(")");
    }
    return new StringBuilder("" + t.val).append(left).append(right);
  }
}
