package org.vny.leetcode.offer.P0032;

import java.util.List;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int x) {
    val = x;
  }
}

public interface Main {

  List<List<Integer>> levelOrder(TreeNode root);
}
