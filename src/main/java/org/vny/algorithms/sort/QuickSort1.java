package org.vny.algorithms.sort;

public class QuickSort1 implements Sort {

  @Override
  public void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private void sort(int[] a, int lo, int hi) {
    if (hi <= lo) return;
    int mid = partition(a, lo, hi);
    sort(a, lo, mid - 1);
    sort(a, mid + 1, hi);
  }

  private int partition(int[] a, int lo, int hi) {
    int i = lo, j = hi + 1;
    int pivot = a[lo];
    while (true) {
      while (a[++i] < pivot) if (i == hi) break;
      while (pivot < a[--j]) if (j == lo) break;
      if (i >= j) break;
      swap(a, i, j);
    }
    swap(a, lo, j);
    return j;
  }

  private void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
}
