package org.vny.algorithms.sort;

public class QuickSort implements Sort {

  @Override
  public void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private void sort(int[] array, int low, int high) {
    if (low < high) {
      int pos = partition(array, low, high);
      sort(array, low, pos - 1);
      sort(array, pos + 1, high);
    }
  }

  private void swap(int[] array, int p, int q) {
    int tmp = array[p];
    array[p] = array[q];
    array[q] = tmp;
  }

  private int partition(int[] array, int low, int high) {
    swap(array, low, (low + high) / 2);
    int pivot = array[low];
    int pos = low;
    for (int i = low + 1; i <= high; i++) {
      if (pivot > array[i] && ++pos != i) {
        swap(array, pos, i);
      }
    }
    swap(array, low, pos);
    return pos;
  }
}
