package org.vny.datastructure.tree;

public class TreeNode<T> {

  T val;
  TreeNode<T> left;
  TreeNode<T> right;

  public TreeNode(T val) {
    this.val = val;
  }

  public TreeNode(T val, TreeNode<T> left, TreeNode<T> right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
