package org.vny.leetcode.problems.p0589;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution01 implements Main {

  @Override
  public List<Integer> preorder(Node root) {
    LinkedList<Node> sk = new LinkedList<>();
    List<Integer> res = new LinkedList<>();
    if (root == null) return res;
    Node cur;
    sk.add(root);
    while (!sk.isEmpty()) {
      cur = sk.pollLast();
      res.add(cur.val);
      if (cur.children != null) {
        Collections.reverse(cur.children);
        sk.addAll(cur.children);
      }
    }
    return res;
  }
}
