package org.vny.leetcode.problems.p0112;

import java.util.Stack;

public class Solution01 implements Main {

  // turn targetSum into the remain sum of the node's value
  @Override
  public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) return false;
    if (root.left == null && root.right == null) {
      return root.val == targetSum;
    }
    return hasPathSum(root.left, targetSum - root.val) ||
          hasPathSum(root.right, targetSum - root.val);
  }
}


