package org.vny.algorithms.sort;

public class CountingSort implements Sort {

  @Override
  public void sort(int[] array) {
    int k = 50;
    sort(array, k);
  }

  private void sort(int[] array, int k) {
    int[] b = new int[array.length];
    int[] c = new int[k + 1];
    for (int i : array) {
      c[i]++;
    }
    // c[i] contains the number of elements equal to i
    for (int i = 1; i <= k; i++) {
      c[i] += c[i - 1];
    }
    // c[i] now contains the number of elements less than
    // or equal to i
    for (int i = array.length - 1; i >= 0; i--) {
      b[c[array[i]] - 1] = array[i];
      c[array[i]]--;
    }
    System.arraycopy(b, 0, array, 0, b.length);
  }
}
