package org.vny.leetcode.offer.p0055;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode (int x) { val = x; }
}

public interface Main {

  boolean isBalanced(TreeNode root);
}
