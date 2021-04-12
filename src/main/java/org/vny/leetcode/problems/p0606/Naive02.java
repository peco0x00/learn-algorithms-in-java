package org.vny.leetcode.problems.p0606;

import java.util.Stack;
import java.util.Set;
import java.util.HashSet;

public class Naive02 implements Main {

  // in order to add `()`, we need a set to store visited nodes
  @Override
  public String tree2str(TreeNode t) {
    if (t == null) return "";
    Stack<TreeNode> sk = new Stack<>();
    sk.push(t);
    Set<TreeNode> visited = new HashSet<>();
    StringBuilder s = new StringBuilder();
    while (!sk.isEmpty()) {
      t = sk.peek();
      if (visited.contains(t)) {
        sk.pop();
        s.append(")");
      } else {
        visited.add(t);
        s.append("(").append(t.val);
        if (t.left == null && t.right != null) {
          s.append("()");
        }
        if (t.right != null) {
          sk.push(t.right);
        }
        if (t.left != null) {
          sk.push(t.left);
        }
      }
    }
    return s.substring(1, s.length() - 1).toString();
  }
}
