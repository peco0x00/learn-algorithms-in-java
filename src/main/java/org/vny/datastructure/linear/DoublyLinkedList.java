package org.vny.datastructure.linear;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {

  private final Node<T> head;
  private final Node<T> tail;
  private int count;

  public DoublyLinkedList() {
    head = new Node<>(null);
    tail = new Node<>(null);
    head.next = tail;
    tail.prev = head;
    count = 0;
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public boolean indexValid(int idx, int low, int high) {
    return idx >= low && idx <= high;
  }

  public T get(int idx) {
    if (!indexValid(idx, 0, count - 1)) {
      throw new IndexOutOfBoundsException();
    }
    return find(idx).val;
  }

  public void set(int idx, T val) {
    if (!indexValid(idx, 0, count - 1)) {
      throw new IndexOutOfBoundsException();
    }
    find(idx).val = val;
  }

  // head.index = -1
  // tail.index = count
  private Node<T> find(int idx) {
    if (!indexValid(idx, -1, count)) {
      throw new IndexOutOfBoundsException();
    }
    Node<T> cur;
    int mid = count / 2;
    if (idx < mid) {
      cur = head;
      for (int i = -1; i < idx; i++) {
        cur = cur.next;
      }
    } else {
      cur = tail;
      for (int i = count; i > idx; i--) {
        cur = cur.prev;
      }
    }
    return cur;
  }

  public void add(int idx, T val) {
    if (!indexValid(idx, 0, count)) {
      throw new IndexOutOfBoundsException();
    }
    Node<T> newNode = new Node<>(val);
    Node<T> pre = find(idx - 1);
    newNode.next = pre.next;
    pre.next.prev = newNode;
    pre.next = newNode;
    newNode.prev = pre;
    count++;
  }

  public void add(T val) {
    add(count, val);
  }

  public T remove(int idx) {
    if (!indexValid(idx, 0, count - 1)) {
      throw new IndexOutOfBoundsException();
    }
    Node<T> tar = find(idx);
    T res = tar.val;
    tar.next.prev = tar.prev;
    tar.prev.next = tar.next;
    count--;
    return res;
  }

  public T remove() {
    return remove(count - 1);
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder("[");
    Node<T> cur = head.next;
    while (cur != tail) {
      res.append(cur.val);
      if (cur.next != tail) {
        res.append("->");
      }
      cur = cur.next;
    }
    return res.append("]").toString();
  }

  public void reverse() {
    Node<T> cur = head.next, pre = head, tmp = null;
    Node<T> ori = head.next;
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

  @Override
  public Iterator<T> iterator() {
    return new DoublyLinkedListIterator();
  }

  private class DoublyLinkedListIterator implements Iterator<T> {

    private Node<T> curNode;

    public DoublyLinkedListIterator() {
      curNode = head;
    }

    @Override
    public boolean hasNext() {
      return curNode.next != tail;
    }

    @Override
    public T next() {
      curNode = curNode.next;
      return curNode.val;
    }
  }
}

