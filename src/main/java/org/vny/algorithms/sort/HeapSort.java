package org.vny.algorithms.sort;

public class HeapSort implements Sort {

  @Override
  public void sort(int[] array) {
    for (int i = array.length / 2 - 1; i >= 0; i--) {
      percolateDown(array, i, array.length);
    }
    for (int i = array.length - 1; i > 0; i--) {
      int tmp = array[0];
      array[0] = array[i];
      array[i] = tmp;
      percolateDown(array, 0, i);
    }
  }

  private int leftChild(int i) {
    return 2 * i + 1;
  }

  private void percolateDown(int[] array, int i, int n) {
    int child, key;
    for (key = array[i]; leftChild(i) < n; i = child) {
      child = leftChild(i);
      if (child != n - 1 && array[child] < array[child + 1]) {
        child++;
      }
      if (key < array[child]) {
        array[i] = array[child];
      } else {
        break;
      }
    }
    array[i] = key;
  }
}
