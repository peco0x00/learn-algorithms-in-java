package org.vny.datastructure.linear;

import java.util.Iterator;

public class ArrayStack<T> implements Iterable<T> {

  private T[] array;
  private int top;

  public ArrayStack() {
    this(10);
  }

  // top refers to the first element's top of the stack
  public ArrayStack(int size) {
    array = createArray(size);
    top = 0;
  }

  @SuppressWarnings("unchecked")
  private T[] createArray(int size) {
    return (T[]) new Object[size];
  }

  public int size() {
    return top;
  }

  public boolean isEmpty() {
    return top == 0;
  }

  public boolean isFull() {
    return top == array.length;
  }

  public void push(T val) {
    array[top++] = val;
  }

  public T peek() {
    return array[top - 1];
  }

  public T pop() {
    return array[--top];
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder("[");
    for (int i = 0; i < top; i++) {
      res.append(array[i]);
      if (i < top - 1) {
        res.append(", ");
      }
    }
    return res.append("]").toString();
  }

  @Override
  public Iterator<T> iterator() {
    return new ArrayStackIterator();
  }

  private class ArrayStackIterator implements Iterator<T> {

    private int cur;

    public ArrayStackIterator() {
      cur = top - 1;
    }

    @Override
    public boolean hasNext() {
      return cur >= 0;
    }

    @Override
    public T next() {
      return array[cur--];
    }
  }
}

