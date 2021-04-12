package org.vny.leetcode.problems.p0110;

public class Solution01 implements Main {

  // official solution
  // bottom-to-top recursion
  // check from the bottom nodes, then go up
  @Override
  public boolean isBalanced(TreeNode root) {
    return height(root) >= 0;
  }

  // return -1 if node t is not balanced
  // return the height of the node t if t is balanced
  public int height(TreeNode t) {
    if (t == null) return 0;
    int leftHeight = height(t.left);
    int rightHeight = height(t.right);
    if (leftHeight == -1 || rightHeight == -1 ||
        Math.abs(leftHeight - rightHeight) > 1) {
      return -1;
    } else {
      return Math.max(leftHeight, rightHeight) + 1;
    }
  }
}
