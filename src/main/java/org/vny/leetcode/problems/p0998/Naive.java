package org.vny.leetcode.problems.p0998;

import java.util.Stack;

public class Naive implements Main {

  // so sad, I didn't solve this by myself...
  @Override
  public TreeNode insertIntoMaxTree(TreeNode root, int val) {
    if (root == null) return new TreeNode(val);
    int count = 0;
    Stack<TreeNode> sk = new Stack<>();
    sk.push(root);
    TreeNode cur;
    while (!sk.isEmpty()) {
      cur = sk.pop();
      count++;
      if (cur.left != null) sk.push(cur.left);
      if (cur.right != null) sk.push(cur.right);
    }
    Integer[] array = new Integer[count + 1];
    int idx = 0;
    sk.push(root);
    while (!sk.isEmpty()) {
      cur = sk.pop();
      array[idx++] = cur.val;
      if (cur.left != null) sk.push(cur.left);
      if (cur.right != null) sk.push(cur.right);
    }
    array[idx] = val;
    return construct(array, 0, array.length - 1);
  }

  public TreeNode construct(Integer[] array, int low, int high) {
    if (array == null)  return null;
    int max = Integer.MIN_VALUE, maxIdx = low;
    for (int i = low; i <= high; i++) {
      if (array[i] != null && array[i] > max) {
        max = array[i];
        maxIdx = i;
      }
    }
    if (max == Integer.MIN_VALUE) return null;
    TreeNode root = new TreeNode(max);
    root.left = construct(array, low, maxIdx - 1);
    root.right = construct(array, maxIdx + 1, high);
    return root;
  }
}
