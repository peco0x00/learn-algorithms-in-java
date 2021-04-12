package org.vny.datastructure.linear;

import java.util.Iterator;

public class SinglyLinkedList<T> implements Iterable<T>{

  private final Node<T> head;
  private int count;

  public SinglyLinkedList() {
    head = new Node<>(null);
    count = 0;
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  private Node<T> find(int idx) {
    assert idx >= -1 && idx < count;
    Node<T> cur = head;
    for (int i = -1; i < idx; i++) {
      cur = cur.next;
    }
    return cur;
  }

  private boolean indexInvalid(int idx, int low, int high) {
    return idx < low || idx > high;
  }

  public void add(int idx, T val) {
    if (indexInvalid(idx, 0, count)) {
      throw new IndexOutOfBoundsException();
    }
    Node<T> newNode = new Node<>(val);
    Node<T> prev = find(idx - 1);
    newNode.next = prev.next;
    prev.next = newNode;
    count++;
  }

  public void add(T val) {
    add(count, val);
  }

  public T remove(int idx) {
    if (indexInvalid(idx, 0, count - 1)) {
      throw new IndexOutOfBoundsException();
    }
    Node<T> cur = find(idx - 1);
    T res = cur.next.val;
    cur.next = cur.next.next;
    count--;
    return res;
  }

  public T remove() {
    return remove(count - 1);
  }

  @Override
  public Iterator<T> iterator() {
    return new LinkedListIterator();
  }

  private class LinkedListIterator implements Iterator<T> {

    private Node<T> curNode;

    public LinkedListIterator() {
      curNode = head;
    }

    @Override
    public boolean hasNext() {
      return curNode.next != null;
    }

    @Override
    public T next() {
      curNode = curNode.next;
      return curNode.val;
    }
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder("[");
    Node<T> cur = head.next;
    while (cur != null) {
      res.append(cur.val);
      if (cur.next != null) {
        res.append(", ");
      }
      cur = cur.next;
    }
    return res.append("]").toString();
  }
}
