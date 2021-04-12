package org.vny.leetcode.problems.p0617;

public class Naive implements Main {

  // solve this by myself!
  // running time beat 100% of users
  // using space beat 38% of users
  @Override
  public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root2 == null) return root1;
    if (root1 == null) {
      // return mergeTrees(root2, root1);
      return root2;
    }
    root1.val += root2.val;
    root1.left = mergeTrees(root1.left, root2.left);
    root1.right = mergeTrees(root1.right, root2.right);
    return root1;
  }
}
