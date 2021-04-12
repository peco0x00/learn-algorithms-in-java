package org.vny.leetcode.problems.p0589;

import java.util.*;

public class Naive implements Main {

  @Override
  public List<Integer> preorder(Node root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;
    Stack<Node> sk = new Stack<>();
    sk.push(root);
    Node cur;
    while (!sk.isEmpty()) {
      cur = sk.pop();
      res.add(cur.val);
      List<Node> children = cur.children;
      if (children != null) {
        for (int i = children.size() - 1; i >= 0; i--) {
          Node c = children.get(i);
          if (c != null) sk.push(c);
        }
      }
    }
    return res;
  }
}
