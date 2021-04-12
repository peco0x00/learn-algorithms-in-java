package org.vny.leetcode.problems.p0110;

import java.util.Stack;

public class Naive implements Main {

  // the balanced binary tree is:
  // for node in binary tree:
  //   abs(height(node.left) - height(node.right)) <= 1
  // too slow, could be better
  public boolean isB(TreeNode root) {
    if (root == null) return true;
    TreeNode cur = root;
    Stack<TreeNode> sk = new Stack<>();
    sk.push(cur);
    while (!sk.isEmpty()) {
      cur = sk.pop();
      if (Math.abs(height(cur.left) - height(cur.right)) > 1) {
        return false;
      }
      if (cur.left != null) sk.push(cur.left);
      if (cur.right != null) sk.push(cur.right);
    }
    return true;
  }

  // solve this by myself! beat 99.96% users!
  @Override
  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    if (root.left != null && root.right != null) {
      if (Math.abs(height(root.left) - height(root.right)) > 1) {
        return false;
      }
      return isBalanced(root.left) && isBalanced(root.right);
    } else if (root.left == null) {
      return height(root.right) <= 1;
    }
    return height(root.left) <= 1;
  }

  public int height(TreeNode node) {
    if (node == null) return 0;
    return Math.max(height(node.left), height(node.right)) + 1;
  }
}
