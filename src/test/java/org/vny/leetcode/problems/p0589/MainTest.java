package org.vny.leetcode.problems.p0589;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void preorder() {
    Node root = new Node(1);
    Node c1 = new Node(3);
    Node c2 = new Node(2);
    Node c3 = new Node(4);
    root.children = Arrays.asList(c1, c2, c3);
    Node c4 = new Node(5);
    Node c5 = new Node(6);
    root.children.get(0).children = Arrays.asList(c4, c5);

    Main main = new Solution02();
    List<Integer> res = main.preorder(root);
    for (Integer re : res) {
      System.out.println(re);
    }
  }
}
