package org.vny.algorithms.search;

public class RightBoundBinarySearch implements Search {

  @Override
  public int search(int[] array, int key) {
    if (array.length == 0) return 0;
    int left = 0, right = array.length;
    while (left < right) {
      int mid = (right + left) / 2;
      if (array[mid] == key) {
        left = mid + 1;
      } else if (array[mid] < key) {
        left = mid + 1;
      } else if (array[mid] > key) {
        right = mid;
      }
    }
    return left - 1;
  }
}
