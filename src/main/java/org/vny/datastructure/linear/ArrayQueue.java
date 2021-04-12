package org.vny.datastructure.linear;

import java.util.Iterator;

public class ArrayQueue<T> implements Iterable<T> {

  private T[] array;
  private int head;
  private int tail;

  public ArrayQueue() {
    this(10);
  }

  public ArrayQueue(int size) {
    array = createArray(size);
    head = tail = 0;
  }

  @SuppressWarnings("unchecked")
  private T[] createArray(int size) {
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

  public void enqueue(T val) {
    if (isFull()) return;
    tail = (tail + 1) % array.length;
    array[tail] = val;
  }

  public T dequeue() {
    if (isEmpty()) return null;
    head = (head + 1) % array.length;
    return array[head];
  }

  public T peek() {
    if (isEmpty()) return null;
    return array[(head + 1) & array.length];
  }

  @Override
  public Iterator<T> iterator() {
    return new ArrayQueueIterator();
  }

  private class ArrayQueueIterator implements Iterator<T> {

    private int cur;
    private int modCount;

    public ArrayQueueIterator() {
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

