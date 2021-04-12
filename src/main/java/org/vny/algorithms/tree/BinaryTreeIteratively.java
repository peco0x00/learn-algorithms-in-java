package org.vny.algorithms.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeIteratively {

  /**
   * get the node count of a binary tree iteratively
   *
   * @param t the input binary tree
   * @return the node count of the binary tree
   */
  public int size(Node t) {
    if (t == null) return 0;
    Queue<Node> qe = new LinkedList<>();
    int count = 0;
    Node cur = t;
    qe.offer(t);
    while (!qe.isEmpty()) {
      cur = qe.poll();
      count++;
      if (cur.left != null) qe.offer(cur.left);
      if (cur.right != null) qe.offer(cur.right);
    }
    return count;
  }

  /**
   * get the height of a binary tree iteratively
   * level-order required
   * count the node number in each level, increase height meanwhile
   * return the height if the node count of current level is zero.
   * @param t the input binary tree
   * @return the height of the binary tree
   */
  public int height(Node t) {
    if (t == null) return 0;
    Queue<Node> qe = new LinkedList<>();
    int height = 0;
    qe.offer(t);
    while (true) {
      int nodeCount = qe.size();
      if (nodeCount == 0) return height;
      height++;
      while (nodeCount > 0) {
        Node tmp = qe.remove();
        if (tmp.left != null) qe.offer(tmp.left);
        if (tmp.right != null) qe.offer(tmp.right);
        nodeCount--;
      }
    }
  }
  /**
   * get the height of a binary tree iteratively
   * level-order required
   * count the node number in each level, increase height meanwhile
   * return the height if the node count of current level is zero.
   * the same as method height.
   * @param t the input binary tree
   * @return the height of the binary tree
   */
  public int getHeight(Node t) {
    if (t == null) return 0;
    Queue<Node> qe = new LinkedList<>();
    int height = 0, nodeCount;
    qe.offer(t);
    while ((nodeCount = qe.size()) > 0) {
      height++;
      while (nodeCount > 0) {
        Node tmp = qe.remove();
        if (tmp.left != null) qe.offer(tmp.left);
        if (tmp.right != null) qe.offer(tmp.right);
        nodeCount--;
      }
    }
    return height;
  }

  /**
   * pre-order traverse iteratively
   * @param t the input binary tree
   */
  public void preOrder(Node t) {
    if (t == null) return;
    Stack<Node> stk = new Stack<>();
    stk.push(t);
    Node cur;
    while (!stk.isEmpty()) {
      cur = stk.pop();
      System.out.println(cur.data);
      if (cur.right != null) stk.push(cur.right);
      if (cur.left != null) stk.push(cur.left);
    }
  }

  /**
   * in-order traverse iteratively
   * @param t the input binary tree
   * */
  public void inOrder(Node t) {
    if (t == null) return;
    Stack<Node> stk = new Stack<>();
    Node cur = t;
    while (cur != null || !stk.isEmpty()) {
      if (cur != null) {
        stk.push(cur);
        cur = cur.left;
      } else {
        cur = stk.pop();
        System.out.println(cur.data);
        cur = cur.right;
      }
    }
  }
  /**
   * post-order traverse iteratively
   * @param t the input binary tree
   * */
  public void postOrder(Node t) {
    if (t == null) return;
    Stack<Node> stk = new Stack<>();
    Node cur = t, prev = null;
    stk.push(cur);
    while (!stk.isEmpty()) {
      cur = stk.peek();
      // visit cur node if cur has no child
      // or one of its child has been visited (prev)
      if (cur.left == null && cur.right == null
          || prev != null && (cur.left == prev || cur.right == prev)) {
        Node tmp = stk.pop();
        System.out.println(tmp.data);
        prev = tmp;
      } else {
        if (cur.right != null) stk.push(cur.right);
        if (cur.left != null) stk.push(cur.left);
      }
    }
  }

  public void postOrder01(Node t) {
    if (t == null) return;
    Stack<Node> sk = new Stack<>();
    Node pre = null;
    while (t != null || !sk.isEmpty()) {
      while (t != null) {
        sk.push(t);
        t = t.left;
      }
      t = sk.pop();
      if (t.right == null || t.right == pre) {
        System.out.println(t.data);
        pre = t;
        t = null;
      } else {
        sk.push(t);
        t = t.right;
      }
    }
  }

  /**
   * level-order traverse iteratively
   * @param t the input binary tree
   * */
  public void levelOrder(Node t) {
    if (t == null) return;
    Queue<Node> qe = new LinkedList<>();
    Node cur = t;
    qe.offer(cur);
    while (!qe.isEmpty()) {
      cur = qe.poll();
      System.out.println(cur.data);
      if (cur.left != null) qe.offer(cur.left);
      if (cur.right != null) qe.offer(cur.right);
    }
  }
}


