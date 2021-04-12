package org.vny.leetcode.interview.p0403;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  public TreeNode(int x) {
    val = x;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

public interface Main {

  ListNode[] listOfDepth(TreeNode tree);
}
