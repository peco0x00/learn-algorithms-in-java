package org.vny.algorithms.linear.ADT;

public class ArrayList {

  private int[] array;
  private int count;

  public ArrayList() {
    this(10);
  }

  public ArrayList(int size) {
    array = new int[size];
    count = 0;
  }

  public void ensureCapacity(int newSize) {
    if (newSize <= array.length) return;
    int[] old = array;
    array= new int[newSize];
    for (int i = 0; i < old.length; i++) {
      array[i] = old[i];
    }
  }

  public void insert(int val) {
    insert(count, val);
  }

  public void insert(int idx, int val) {
    if (idx < 0 || idx > count) return;
    if (count >= array.length) {
      ensureCapacity(count * 2 + 1);
    }
    for (int i = count; i > idx; i--) {
      array[i] = array[i - 1];
    }
    array[idx] = val;
    count++;
  }

  public int remove() {
    return remove(count - 1);
  }

  public int remove(int idx) {
    if (idx < 0 || idx >= count) return -1;
    int res = array[idx];
    for (int i = idx; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }
    count--;
    return res;
  }

  public void reverse() {
    for (int i = 0; i < count / 2; i++) {
      int tmp = array[i];
      array[i] = array[count - i - 1];
      array[count - i - 1] = tmp;
    }
  }

  public void print() {
    for (int i = 0; i < count; i++) {
      System.out.print(array[i]);
      if (i < count - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();
  }
}
