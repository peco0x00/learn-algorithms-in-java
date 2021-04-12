package org.vny.datastructure.linear;

import java.util.Iterator;

public class ArrayDeque<T> {

  private T[] array;
  private int head;
  private int tail;

  public ArrayDeque(int size) {
    array = createArray(size);
    head = tail = 0;
  }

  @SuppressWarnings("unchecked")
  public T[] createArray(int size) {
    return (T[]) new Object[size];
  }

  public boolean isEmpty() {
    return head == tail;
  }

  public boolean isFull() {
    return head == (tail + 1) % array.length;
  }

  public int size() {
    return (tail - head + array.length) % array.length;
  }

  public void addFirst(T val) {
    if (isFull()) return;
    array[head] = val;
    head = (head - 1 + array.length) % array.length;
  }

  public void addLast(T val) {
    if (isFull()) return;
    tail = (1 + tail) % array.length;
    array[tail] = val;
  }

  public T removeFirst() {
    if (isEmpty()) return null;
    head = (head + 1) % array.length;
    return array[head];
  }

  public T removeLast() {
    if (isEmpty()) return null;
    T res = array[tail];
    tail = (tail - 1 + array.length) % array.length;
    return res;
  }

  public T getFirst() {
    return array[(head + 1) & array.length];
  }

  public T getLast() {
    return array[tail];
  }

  private class ArrayDequeIterator implements Iterator<T> {

    private int cur;
    private int modCount;

    public ArrayDequeIterator() {
      cur = head;
      modCount = 0;
    }

    @Override
    public boolean hasNext() {
      return modCount < size();
    }

    @Override
    public T next() {
      cur = (cur + 1) & array.length;
      modCount++;
      return array[cur];
    }
  }
}


