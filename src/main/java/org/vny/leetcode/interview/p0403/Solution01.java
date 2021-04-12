package org.vny.leetcode.interview.p0403;

public class Solution01 implements Main{

  @Override
  public ListNode[] listOfDepth(TreeNode tree) {
    if (tree == null) return new ListNode[0];
    ListNode[] listNodes = new ListNode[height(tree)];
    listOfDepth(tree, 0, listNodes);
    return listNodes;
  }

  // return the height of binary tree
  public int height(TreeNode root) {
    if (root == null) return 0;
    return Math.max(height(root.left), height(root.right)) + 1;
  }

  // top-to-bottom recursion
  public void listOfDepth(TreeNode tree, int depth, ListNode[] listNodes) {
    if (tree == null) return;
    ListNode rootNode = new ListNode(tree.val);
    if (listNodes[depth] == null) listNodes[depth] = rootNode;
    else {
      rootNode.next = listNodes[depth];
      listNodes[depth] = rootNode;
    }
    listOfDepth(tree.right, depth + 1, listNodes);
    listOfDepth(tree.left, depth + 1, listNodes);
  }
}
