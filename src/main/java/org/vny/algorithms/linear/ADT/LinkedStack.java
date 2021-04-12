package org.vny.algorithms.linear.ADT;

public class LinkedStack {

  public void push(Node top, int val) {
    if (top == null) return;
    Node newNode = new Node(val);
    newNode.next = top.next;
    top.next = newNode;
  }

  public int pop(Node top) {
    if (top == null) return -1;
    int res = top.next.val;
    top.next = top.next.next;
    return res;
  }

  public int peek(Node top) {
    if (top == null) return -1;
    return top.next.val;
  }

  public void print(Node top) {
    if (top == null) return;
    Node cur = top.next;
    while (cur != null) {
      System.out.print(cur.val);
      if (cur.next != null) {
        System.out.print(", ");
      }
      cur = cur.next;
    }
  }
}
