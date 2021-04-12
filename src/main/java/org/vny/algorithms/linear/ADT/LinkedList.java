package org.vny.algorithms.linear.ADT;

public class LinkedList {

  public int size(Node head) {
    int count = 0;
    Node cur = head.next;
    while (cur != null) {
      cur = cur.next;
      count++;
    }
    return count;
  }

  public void insert(Node head, int val) {
    insert(head, size(head), val);
  }

  public void insert(Node head, int idx, int val) {
    Node cur = head;
    Node newNode = new Node(val);
    for (int i = 0; i < idx; i++) cur = cur.next;
    newNode.next = cur.next;
    cur.next = newNode;
  }

  public int remove(Node head) {
    return remove(head, size(head) - 1);
  }

  public int remove(Node head, int idx) {
    Node cur = head;
    for (int i = 0; i < idx; i++) cur = cur.next;
    int res = cur.next.val;
    cur.next = cur.next.next;
    return res;
  }

  public void reverse(Node head) {
    if (head.next == null) return;
    Node cur = head.next, pre = null, tmp = null;
    while (cur != null) {
      tmp = cur.next;
      cur.next = pre;
      pre = cur;
      cur = tmp;
    }
    head.next = pre;
  }

  public void print(Node head) {
    Node cur = head.next;
    while (cur != null) {
      System.out.printf("%d", cur.val);
      if (cur.next != null) {
        System.out.print("->");
      }
      cur = cur.next;
    }
    System.out.println();
  }
}
