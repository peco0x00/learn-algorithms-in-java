package org.vny.algorithms.tree;

public class BinarySearchTreeIteratively {

  public Node contains(int value, Node t) {
    if (t == null) return null;
    Node cur = t;
    while (cur != null) {
      if (cur.data > value) cur = cur.left;
      else if (cur.data < value) cur = cur.right;
      else break;
    }
    return cur;
  }

  public Node insert(int value, Node t) {
    Node ins = new Node(value);
    Node cur = t, pre = null;
    while (cur != null) {
      pre = cur;
      if (value < cur.data) cur = cur.left;
      else cur = cur.right;
    }
    if (pre == null) pre = ins;
    if (value < pre.data) pre.left = ins;
    else pre.right = ins;
    return t;
  }

  /**
   * find the parent of the node and node itself
   * */
  public Node remove(int value, Node t) {
    Node cur = t, pre = null;
    int rightOrLeft = -1;
    while (cur != null) {
      if (cur.data > value) {
        pre = cur;
        cur = cur.left;
        rightOrLeft = 0;
      } else if (cur.data < value) {
        pre = cur;
        cur = cur.right;
        rightOrLeft = 1;
      } else {
        break;
      }
    }
    if (cur != null) {
      Node replacement;
      if (cur.right == null && cur.left == null) replacement = null;
      else if (cur.right == null) {
        replacement = cur.left;
        cur.left = null;
      } else if (cur.left == null) {
        replacement = cur.right;
        cur.right = null;
      } else {
        if (cur.right.left == null) {
          cur.data = cur.right.data;
          replacement = cur;
          cur.right = cur.right.right;
        } else {
          Node pre2 = cur.right;
          Node child = cur.right.left;
          while (child.left != null) {
            pre2 = child;
            child = pre2.left;
          }
          cur.data = child.data;
          pre2.left = child.right;
          replacement = cur;
        }
      }
      if (pre == null) {
        t = replacement;
      } else {
        if (rightOrLeft == 0) pre.left = replacement;
        else pre.right = replacement;
      }
    }
    return t;
  }

  public Node findMax(Node t) {
    if (t == null) return null;
    Node cur = t;
    while (cur.right != null) cur = cur.right;
    return cur;
  }

  public Node findMin(Node t) {
    if (t == null) return null;
    Node cur = t;
    while (cur.left != null) cur = cur.left;
    return cur;
  }
}
