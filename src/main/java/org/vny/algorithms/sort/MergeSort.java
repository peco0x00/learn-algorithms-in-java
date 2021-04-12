package org.vny.algorithms.sort;

public class MergeSort implements Sort {

  @Override
  public void sort(int[] array) {
    sort(array, 0, array.length - 1);
  }

  private void sort(int[] array, int low, int high) {
    if (low < high) {
      int mid = (high + low) / 2;
      sort(array, low, mid);
      sort(array, mid + 1, high);
      merge(array, low, mid, high);
    }
  }

  private void merge(int[] array, int p, int q, int r) {
    int n1 = q - p + 1, n2 = r - q;
    int[] left = new int[n1], right = new int[n2];
    for (int i = 0; i < n1; i++) {
      left[i] = array[i + p];
    }
    for (int i = 0; i < n2; i++) {
      right[i] = array[q + i + 1];
    }
    int i = 0, j = 0, k = p;
    while (i < n1 && j < n2) {
      if (left[i] < right[j]) {
        array[k++] = left[i++];
      } else {
        array[k++] = right[j++];
      }
    }
    while (i < n1) {
      array[k++] = left[i++];
    }
    while (j < n2) {
      array[k++] = right[j++];
    }
  }
}
