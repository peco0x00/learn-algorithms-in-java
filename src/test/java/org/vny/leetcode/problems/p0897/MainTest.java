package org.vny.leetcode.problems.p0897;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void increasingBST() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(6);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);
    root.left.left.left = new TreeNode(1);
    root.right.right = new TreeNode(8);
    root.right.right.left = new TreeNode(7);
    root.right.right.right = new TreeNode(9);

    Main main = new Solution01();
    TreeNode res = main.increasingBST(root);
    while (res != null) {
      System.out.printf("%d, ", res.val);
      res = res.right;
    }
  }
}
