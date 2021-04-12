package org.vny.leetcode.problems.p0897;

import java.util.Stack;

public class Naive implements Main {

  @Override
  public TreeNode increasingBST(TreeNode root) {
    TreeNode head = new TreeNode(-1);
    TreeNode curNode = head;
    Stack<TreeNode> sk = new Stack<>();
    TreeNode cur = root;
    while (!sk.isEmpty() || cur != null) {
      if (cur != null) {
        sk.push(cur);
        cur = cur.left;
      } else {
        cur = sk.pop();
        curNode.right = new TreeNode(cur.val);
        curNode = curNode.right;
        cur = cur.right;
      }
    }
    return head.right;
  }
}
