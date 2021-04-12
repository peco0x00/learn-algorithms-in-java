package org.vny.datastructure.linear;

import java.lang.reflect.Array;

// TODO motherfxxking complicated!
public class StaticLinkedList<T> {

  private T[] array;
  private int[] ptr;
  private int count;

  public StaticLinkedList(int size) {
    array = createArray(size + 2);
    ptr = new int[size + 2];
    ptr[0] = 1;
    for (int i = 1; i < size + 2; i++) {
      ptr[i] = i + 1;
    }
    ptr[size] = ptr[size + 1] = 0;
    count = 0;
  }

  @SuppressWarnings("unchecked")
  private T[] createArray(int size) {
    return (T[]) new Object[size];
  }

  public boolean isFull() {
    return count == array.length - 2;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  public void add(T val) {
    if (isFull()) return;
    array[ptr[0]] = val;
    ptr[0] = ptr[ptr[0]];
    count++;
  }

  public T remove() {
    if (isEmpty()) return null;
    return null;
  }

  public int size() {
    return count;
  }
}
