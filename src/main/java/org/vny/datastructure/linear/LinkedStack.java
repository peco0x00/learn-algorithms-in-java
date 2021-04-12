package org.vny.datastructure.linear;

import java.util.Iterator;

public class LinkedStack<T> implements Iterable<T>{

  private Node<T> top;
  private int count;

  public LinkedStack() {
    top = new Node<>(null);
    count = 0;
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void push(T val) {
    Node<T> newNode = new Node<>(val);
    newNode.next = top.next;
    top.next = newNode;
    count++;
  }

  public T peek() {
    if (isEmpty()) return null;
    return top.next.val;
  }

  public T pop() {
    if (isEmpty()) return null;
    T res = top.next.val;
    top.next = top.next.next;
    count--;
    return res;
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder("[");
    Node<T> cur = top.next;
    while (cur != null) {
      res.append(cur.val);
      if (cur.next != null) {
        res.append(", ");
      }
      cur = cur.next;
    }
    return res.append("]").toString();
  }

  @Override
  public Iterator<T> iterator() {
    return new LinkedStackIterator();
  }

  private class LinkedStackIterator implements Iterator<T> {

    private Node<T> cur;

    public LinkedStackIterator() {
      cur = top;
    }

    @Override
    public boolean hasNext() {
      return cur.next != null;
    }

    @Override
    public T next() {
      cur = cur.next;
      return cur.val;
    }
  }
}

