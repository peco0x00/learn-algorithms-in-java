package org.vny.leetcode.problems.p0998;

public class Solution01 implements Main {

  // pay attention
  // you need to see the things beneath the problem!
  @Override
  public TreeNode insertIntoMaxTree(TreeNode root, int val) {
    if (root == null || root.val < val) {
      TreeNode tmp = new TreeNode(val);
      tmp.left = root;
      return tmp;
    }
    root.right = insertIntoMaxTree(root.right, val);
    return root;
  }
}
