package org.vny.leetcode.problems.p0094;

import java.util.LinkedList;
import java.util.List;

public class Solution01 implements Main {

  @Override
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new LinkedList<>();
    inorderTraversal(root, res);
    return res;
  }

  public void inorderTraversal(TreeNode root, List<Integer> lst) {
    if (root == null) return;
    inorderTraversal(root.left, lst);
    lst.add(root.val);
    inorderTraversal(root.right, lst);
  }
}
