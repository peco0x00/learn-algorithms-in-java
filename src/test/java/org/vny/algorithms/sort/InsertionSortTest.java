package org.vny.algorithms.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

  @Test
  public void insertionSort() {
    int[] a = {10, 9, 2, 8, 23, 1, 45, 2, 24, 5};
    // Sort sort = new InsertionSort();
    // Sort sort = new SelectionSort();
    // Sort sort = new ShellSort();
    // Sort sort = new HeapSort();
    // Sort sort = new MergeSort();
    // Sort sort = new QuickSort();
    Sort sort = new CountingSort();
    sort.sort(a);
    int[] ans = {1, 2, 2, 5, 8, 9, 10, 23, 24, 45};
    assertArrayEquals(ans, a);
  }
}
