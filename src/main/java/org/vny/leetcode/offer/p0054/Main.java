package org.vny.leetcode.offer.p0054;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public interface Main {

  int kthLargest(TreeNode root, int k);
}
