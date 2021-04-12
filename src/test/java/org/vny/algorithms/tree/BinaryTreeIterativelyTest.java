package org.vny.algorithms.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeIterativelyTest {

  @Test
  public void test() {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    BinaryTreeIteratively main = new BinaryTreeIteratively();
    main.postOrder(root);
    System.out.println("---------------------");
    main.postOrder01(root);
  }
}
