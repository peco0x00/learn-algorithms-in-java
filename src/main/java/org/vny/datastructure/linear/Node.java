package org.vny.datastructure.linear;

public class Node<T> {

  T val;
  Node<T> next;
  Node<T> prev;
  int nextIdx;

  public Node() {
  }

  public Node(T val) {
    this.val = val;
  }

  public Node(T val, Node<T> next) {
    this.val = val;
    this.next = next;
  }

  public Node(T val, Node<T> next, Node<T> prev) {
    this.val = val;
    this.next = next;
    this.prev = prev;
  }
}
