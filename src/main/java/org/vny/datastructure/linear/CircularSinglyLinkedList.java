package org.vny.datastructure.linear;

public class CircularSinglyLinkedList<T> {

  private Node<T> head;
  private int count;

  public CircularSinglyLinkedList() {
    head = new Node<>(null);
    count = 0;
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void add(T val) {
    Node<T> newNode = new Node<>(val);
    Node<T> cur = head;
    while (cur.next != head) cur = cur.next;
    newNode.next = cur.next;
    cur.next = newNode;
    count++;
  }
}
