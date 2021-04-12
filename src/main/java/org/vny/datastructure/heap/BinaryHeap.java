package org.vny.datastructure.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryHeap<T extends Comparable<? super T>> {

  private T[] array;
  private int count;

  public BinaryHeap() {
    this(10);
  }

  public BinaryHeap(int size) {
    array = createArray(size);
    count = 0;
  }

  public BinaryHeap(T[] array) {
    count = array.length;
    this.array = createArray((count + 2) * 11 / 10);
    for (int i = 0; i < count; i++) {
      this.array[i] = array[i];
    }
    buildHeap();
  }

  private void buildHeap() {
    for (int i = count / 2; i > 0; i--) {
      percolateDown(i);
    }
  }

  @SuppressWarnings("unchecked")
  private T[] createArray(int size) {
    return (T[]) new Comparable[size];
  }

  private void ensureCapacity(int newSize) {
    if (newSize < array.length) return;
    array = Arrays.copyOf(array, newSize);
  }

  public boolean isEmpty() {
    return count == 0;
  }

  // create an empty hole
  // then bubble up the hole
  public void insert(T val) {
    if (count == array.length) {
      ensureCapacity(array.length * 2 + 1);
    }
    int hole = ++count;
    for (array[0] = val; val.compareTo(array[hole / 2]) < 0; hole /= 2) {
      array[hole] = array[hole / 2];
    }
    array[hole] = val;
  }

  public T deleteMin() {
    if (isEmpty()) return null;
    T res = findMin();
    array[1] = array[count--];
    percolateDown(1);
    return res;
  }

  private void percolateDown(int hole) {
    int child;
    T tmp = array[hole];
    for (; hole * 2 <= count; hole = child) {
      child = hole * 2;
      if (child != count && array[child + 1].compareTo(array[child]) < 0) {
        child++;
      }
      if (array[child].compareTo(tmp) < 0) {
        array[hole] = array[child];
      } else {
        break;
      }
    }
    array[hole] = tmp;
  }

  public T findMin() {
    return array[1];
  }
}
