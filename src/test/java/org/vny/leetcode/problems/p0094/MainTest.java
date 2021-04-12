package org.vny.leetcode.problems.p0094;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void inorderTraversal() {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    Main main = new Solution01();
    List<Integer> res = main.inorderTraversal(root);
    System.out.println(res);
  }
}
