package org.vny.leetcode.problems.p0589;

import java.util.LinkedList;
import java.util.List;

public class Solution02 implements Main {

  // solve this by myself!
  @Override
  public List<Integer> preorder(Node root) {
    List<Integer> res = new LinkedList<>();
    preorder(root, res);
    return res;
  }

  public void preorder(Node root, List<Integer> list) {
    if (root == null) return;
    list.add(root.val);
    if (root.children != null) {
      for (Node child : root.children) {
        preorder(child, list);
      }
    }
  }
}
