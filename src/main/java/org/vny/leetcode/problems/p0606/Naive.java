package org.vny.leetcode.problems.p0606;

import java.util.Stack;

public class Naive implements Main {

  /*
   * if left != null && right != null:
   *    left = (left)
   *    right = (right)
   * if left != null && right == null:
   *    left = (left)
   * if left == null && right != null:
   *    left = (left)
   *    right = (right)
   * if left == null && right == null:
   *    pass
   **/
  @Override
  public String tree2str(TreeNode t) {
    if (t == null) return "";
    String left = tree2str(t.left);
    String right = tree2str(t.right);
    if (t.right != null) {
      left = "(" + left + ")";
      right = "(" + right + ")";
    } else if (t.left != null) {
      left = "(" + left + ")";
    }
    return t.val + left + right;
  }
}
