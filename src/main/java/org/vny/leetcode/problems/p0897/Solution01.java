package org.vny.leetcode.problems.p0897;

public class Solution01 implements Main {

  TreeNode head, cur;

  @Override
  public TreeNode increasingBST(TreeNode root) {
    head = new TreeNode(-1);
    cur = head;
    inc(root);
    return head.right;
  }

  public void inc(TreeNode root) {
    if (root == null) return;
    inc(root.left);
    cur.right = new TreeNode(root.val);
    cur = cur.right;
    inc(root.right);
  }
}
