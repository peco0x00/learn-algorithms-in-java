package org.vny.algorithms.tree;

public class AVLTree {

  private static final int LIMITED_HEIGHT_DIFFER = 1;

  private int height(Node t) {
    return t == null ? -1 : t.height;
  }

  public Node rotateWithLeftChild(Node k2) {
    Node k1 = k2.left;
    k2.left = k1.right;
    k1.right = k2;
    k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
    k1.height = Math.max(height(k1.left), height(k2)) + 1;
    return k1;
  }

  public Node rotateWithRightChild(Node k1) {
    Node k2 = k1.right;
    k1.right = k2.left;
    k2.left = k1;
    k1.height = Math.max(height(k1.left), height(k1.right)) + 1;
    k2.height = Math.max(height(k1), height(k2.right)) + 1;
    return k2;
  }

  public Node doubleWithLeftChild(Node k3) {
    k3.left = rotateWithRightChild(k3.left);
    return rotateWithLeftChild(k3);
  }

  public Node doubleWithRightChild(Node k1) {
    k1.right = rotateWithLeftChild(k1.right);
    return rotateWithRightChild(k1);
  }

  public Node balance(Node t) {
    if (t == null) return null;
    if (height(t.left) - height(t.right) > LIMITED_HEIGHT_DIFFER) {
      if (height(t.left.left) >= height(t.left.right)) {
        t = rotateWithLeftChild(t);
      } else {
        t = doubleWithLeftChild(t);
      }
    } else if (height(t.right) - height(t.left) > LIMITED_HEIGHT_DIFFER) {
      if (height(t.right.right) >= height(t.right.left)) {
        t = rotateWithRightChild(t);
      } else {
        t = doubleWithRightChild(t);
      }
    }
    t.height = Math.max(height(t.left), height(t.right)) + 1;
    return t;
  }

  public Node findMax(Node t) {
    if (t == null) return null;
    if (t.right == null) return t;
    return findMax(t.right);
  }

  public Node findMin(Node t) {
    if (t == null) return null;
    if (t.left == null) return t;
    return findMin(t.left);
  }

  public Node insert(int value, Node t) {
    if (t == null) return new Node(value);
    if (value < t.data) t.left = insert(value, t.left);
    else if (value > t.data) t.right = insert(value, t.right);
    return balance(t);
  }

  public Node remove(int value, Node t) {
    if (t == null) return null;
    if (value < t.data) {
      t.left = remove(value, t.left);
    }
    else if (value > t.data) {
      t.right = remove(value, t.right);
    }
    else if (t.left != null && t.right != null) {
      t.data = findMin(t.right).data;
      t.right = remove(t.data, t.right);
    } else {
      t = (t.left != null) ? t.left : t.right;
    }
    return balance(t);
  }
}
