package org.vny.leetcode.problems.p0110;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void isBalanced() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.left.left = null;
    root.left.right = null;
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);
    Main main = new Naive();
    boolean res = main.isBalanced(root);
    boolean ans = true;
    assertEquals(res, ans);
  }

  @Test
  public void test() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.right = new TreeNode(3);
    Main main = new Naive();
    System.out.println(main.isBalanced(root));
  }
}
