package org.vny.leetcode.interview.p0403;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void listOfDepth() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.left.left.left = new TreeNode(8);
    root.right.right = new TreeNode(7);

    Main main = new Solution01();
    ListNode[] res = main.listOfDepth(root);
    for (ListNode re : res) {
      ListNode cur = re;
      while (cur != null) {
        System.out.printf("%d, ", cur.val);
        cur = cur.next;
      }
      System.out.println();
    }
  }
}
