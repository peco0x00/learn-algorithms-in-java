package org.vny.algorithms.linear.ADT;

public class DoublyLinkedList {

  public int size(Node head, Node tail) {
    int res = 0;
    Node cur = head;
    while (cur != tail) {
      cur = cur.next;
      res++;
    }
    return res;
  }

  public Node find(Node head, Node tail, int idx) {
    int size = size(head, tail);
    if (idx < -1 || idx > size) return null;
    int mid = size / 2, point;
    Node res;
    if (idx >= mid) {
      point = size;
      res = tail;
      while (res != null && point > idx) {
        res = res.prev;
        point--;
      }
    } else {
      point = -1;
      res = head;
      while (res != null && point < idx) {
        res = res.next;
        point++;
      }
    }
    return res;
  }

  public void insert(Node head, Node tail, int idx, int val) {
    if (head == null || tail == null) return;
    Node pre = find(head, tail, idx - 1);
    Node newNode = new Node(val);
    newNode.next = pre.next;
    pre.next.prev = newNode;
    newNode.prev = pre;
    pre.next = newNode;
  }

  public int remove(Node head, Node tail, int idx) {
    if (head == null || tail == null) return -1;
    Node res = find(head, tail, idx);
    res.prev.next = res.next;
    res.next.prev = res.prev;
    return res.val;
  }

  public void reverse(Node head, Node tail) {
    if (head == null || tail == null || head.next == tail) {
      return;
    }
    Node cur = head.next, pre = head, tmp = null;
    Node ori = head.next;
    while (cur != tail) {
      tmp = cur.next;
      cur.next = pre;
      cur.prev = tmp;
      pre = cur;
      cur = tmp;
    }
    ori.next = tail;
    tail.prev = ori;
    head.next = pre;
    pre.prev = head;
  }

  public void print(Node head, Node tail) {
    if (head == null || tail == null || head.next == tail) {
      return;
    }
    Node cur = head.next;
    while (cur != tail && cur != null) {
      System.out.print(cur.val);
      if (cur.next != tail) {
        System.out.print(", ");
      }
      cur = cur.next;
    }
    System.out.println();
  }
}

