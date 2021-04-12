package org.vny.leetcode.problems.p1022;

/*
 * using bit operation
 * if new_val == 1:
 *    num = (num << 1) + 1
 * if new_val == 0:
 *    num = (num << 1)
 * so: num = (num << 1) + new_val
 **/
public class Naive02 implements Main {

  // using recursion
  // running time beat 100% of users
  // using space beat 41% of users
  @Override
  public int sumRootToLeaf(TreeNode root) {
    return helper(root, 0);
  }

  private int helper(TreeNode root, int sum) {
    if (root == null) return 0;
    sum = (sum << 1) + root.val;
    if (root.left == null && root.right == null) {
      return sum;
    }
    return helper(root.left, sum) + helper(root.right, sum);
  }
}
