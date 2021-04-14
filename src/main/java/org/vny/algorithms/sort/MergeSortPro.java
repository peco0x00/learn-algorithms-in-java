package org.vny.algorithms.sort;

public class MergeSortPro implements Sort {

  private int[] aux;

  @Override
  public void sort(int[] array) {
    int n = array.length;
    aux = new int[n];
    for (int sz = 1; sz < n; sz *= 2) {
      for (int lo = 0; lo + sz < n; lo += 2 * sz) {
        merge(array, lo, lo + sz - 1, Math.min(lo + sz + sz - 1, n - 1));
      }
    }
  }

  private void merge(int[] a, int lo, int mid, int hi) {
    int i = lo, j = mid + 1;
    if (a[mid] <= a[mid + 1]) { // a[lo, hi] has been sorted
      return;
    }
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
