package org.vny.algorithms.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {

  @Test
  public void sort() {
    // Sort s = new BottomUpMergeSort();
    // Sort s = new TopDownMergeSort();
    // Sort s = new MergeSortPro();
    Sort s = new QuickSort1();
    int[] a = {1, 10, 9, 4, 8, 1, 7, 12, 44};
    int[] ans = {1, 1, 4, 7, 8, 9, 10, 12, 44};
    s.sort(a);
    assertArrayEquals(ans, a);
  }
}
