package org.vny.datastructure.linear;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayList<T> implements Iterable<T> {

  private T[] array;
  private int count;
  private static final int DEFAULT_CAPACITY = 10;

  public ArrayList() {
    this(DEFAULT_CAPACITY);
  }

  public ArrayList(int size) {
    array = createArray(size);
    count = 0;
  }

  @SuppressWarnings("unchecked")
  private T[] createArray(int size) {
    return (T[]) new Object[size];
  }

  public int size() {
    return count;
  }

  public boolean isEmpty() {
    return count == 0;
  }

  private void ensureCapacity(int newSize) {
    if (newSize < array.length) return;
    T[] old = array;
    array = createArray(newSize);
    System.arraycopy(old, 0, array, 0, old.length);
  }

  // using Arrays.copyOf method
  private void ensureCapacity2(int newSize) {
    if (newSize < array.length) return;
    array = Arrays.copyOf(array, newSize);
  }

  public T get(int idx) {
    if (idx < 0 || idx >= count) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return array[idx];
  }

  public void set(int idx, T val) {
    if (idx < 0 || idx >= count) {
      throw new ArrayIndexOutOfBoundsException();
    }
    array[idx] = val;
  }

  public void trimToSize() {
    ensureCapacity(count);
  }

  public void add(int idx, T val) {
    if (idx < 0 || idx > count) {
      throw new ArrayIndexOutOfBoundsException();
    }
    if (count + 1 >= array.length) {
      ensureCapacity(2 * array.length + 1);
    }
    for (int i = count - 1; i >= idx; i--) {
      array[i + 1] = array[i];
    }
    array[idx] = val;
    count++;
  }

  public void add(T val) {
    add(count, val);
  }

  public T remove(int idx) {
    if (idx < 0 || idx >= count) {
      throw new ArrayIndexOutOfBoundsException();
    }
    T res = array[idx];
    for (int i = idx; i < count; i++) {
      array[i] = array[i + 1];
    }
    count--;
    return res;
  }

  public T remove() {
    return remove(count - 1);
  }

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder("[");
    for (int i = 0; i < count; i++) {
      res.append(array[i]);
      if (i < count - 1) res.append(", ");
    }
    return res.append("]").toString();
  }

  @Override
  public Iterator<T> iterator() {
    return new ArrayListIterator();
  }

  private class ArrayListIterator implements Iterator<T> {
    private int curIdx;

    public ArrayListIterator() {
      curIdx = 0;
    }

    @Override
    public boolean hasNext() {
      return curIdx < count;
    }

    @Override
    public T next() {
      return array[curIdx++];
    }
  }
}
