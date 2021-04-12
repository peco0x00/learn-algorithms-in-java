package org.vny.leetcode.offer.P0032;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void levelOrder() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    Main main = new Solution01();
    List<List<Integer>> res = main.levelOrder(root);
    for (List<Integer> lst : res) {
      for (Integer integer : lst) {
        System.out.printf("%d ", integer);
      }
      System.out.println();
    }
  }
}
