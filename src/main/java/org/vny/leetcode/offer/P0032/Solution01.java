package org.vny.leetcode.offer.P0032;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution01 implements Main {

  @Override
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new LinkedList<>();
    if (root == null) return res;
    levelOrder(root, 0, res);
    return res;
  }

  public void levelOrder(TreeNode root, int depth, List<List<Integer>> res) {
    if (root == null) return;
    if (res.size() == depth) {
      res.add(new LinkedList<>());
    }
    res.get(depth).add(root.val);
    levelOrder(root.right, depth + 1, res);
    levelOrder(root.left, depth + 1, res);
  }
}
