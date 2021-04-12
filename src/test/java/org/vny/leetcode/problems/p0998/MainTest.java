package org.vny.leetcode.problems.p0998;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void insertIntoMaxTree() {

    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(2);
    int value = 5;

    Main main = new Solution01();
    TreeNode res = main.insertIntoMaxTree(root, value);
    System.out.println(res.val);
    System.out.println(res.left.val);
    System.out.println(res.left.left.val);
    System.out.println(res.left.right.val);
    System.out.println(res.left.right.left.val);

  }
}
