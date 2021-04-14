package org.vny.algorithms.sort;

public class TopDownMergeSort implements Sort {

  private int[] aux;

  @Override
  public void sort(int[] array) {
    aux = new int[array.length];
    sort(array, 0, array.length - 1);
  }

  private void sort(int[] a, int lo, int hi) {
    if (hi<= lo) return;
    int mid = (lo + hi) / 2;
    sort(a, lo, mid);
    sort(a, mid + 1, hi);
    merge(a, lo, mid, hi);
  }

  private void merge(int[] a, int lo, int mid, int hi) {
    int i = lo, j = mid + 1;
    for (int k = lo; k <= hi; k++) {
      aux[k] = a[k];
    }
    for (int k = lo; k <= hi; k++) {
      if (i > mid) a[k] = aux[j++];
      else if (j > hi) a[k] = aux[i++];
      else if (aux[j] < aux[i]) a[k] = aux[j++];
      else a[k] = aux[i++];
    }
  }
}
