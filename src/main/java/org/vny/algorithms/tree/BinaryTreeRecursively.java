package org.vny.algorithms.tree;

public class BinaryTreeRecursively {

  /**
   * get the node count of a binary tree recursively
   *
   * @param t the input binary tree
   * @return the node count of the binary tree
   */
  public int size(Node t) {
    if (t == null) return 0;
    return 1 + size(t.left) + size(t.right);
  }

  /**
   * get the height of a binary tree recursively
   *
   * @param t the input binary tree
   * @return the height of the binary tree
   */
  public int height(Node t) {
    if (t == null) return 0;
    int l = (height(t.left));
    int r = (height(t.right));
    return l > r ? (l + 1) : (r + 1);
  }

  /**
   * pre-order traverse recursively
   *
   * @param t the input binary tree
   */
  public void preOrder(Node t) {
    if (t == null) return;
    System.out.println(t.data);
    preOrder(t.left);
    preOrder(t.right);
  }


  /**
   * in-order traverse recursively
   *
   * @param t the input binary tree
   */
  public void inOrder(Node t) {
    if (t == null) return;
    inOrder(t.left);
    System.out.println(t.data);
    inOrder(t.right);
  }

  /**
   * post-order traverse recursively
   *
   * @param t the input binary tree
   */
  public void postOrder(Node t) {
    if (t == null) return;
    postOrder(t.left);
    postOrder(t.right);
    System.out.println(t.data);
  }
}
