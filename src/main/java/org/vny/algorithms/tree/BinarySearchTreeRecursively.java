package org.vny.algorithms.tree;

public class BinarySearchTreeRecursively {

  private Node root;

  public BinarySearchTreeRecursively() {
    root = null;
  }

  public boolean contains(int value) {
    return root == contains(value, root);
  }

  public void insert(int value) {
    root = insert(value, root);
  }

  public void remove(int value) {
    root = remove(value, root);
  }

  public int findMax() {
    return findMax(root).data;
  }

  public int findMin() {
    return findMin(root).data;
  }

  public Node contains(int value, Node t) {
    if (t == null) return null;
    if (t.data > value) {
      t.left = contains(value, t.left);
    } else if (t.data < value) {
      t.right = contains(value, t.right);
    }
    return t;
  }

  public Node insert(int value, Node t) {
    if (t == null) return new Node(value);
    if (t.data > value) {
      t.left = insert(value, t.left);
    } else if (t.data < value) {
      t.right = insert(value, t.right);
    }
    return t;
  }

  public Node remove(int value, Node t) {
    if (t == null) return null;
    if (t.data > value) {
      t.left = remove(value, t.left);
    } else if (t.data < value) {
      t.right = remove(value, t.right);
    } else {
      t = t.left != null ? t.left : t.right;
    }
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
}
