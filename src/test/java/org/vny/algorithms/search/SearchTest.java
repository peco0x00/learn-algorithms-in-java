package org.vny.algorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

  @Test
  public void search() {
    int[] array = {10, 20, 30, 50, 52, 60};
    int key1 = 60;
    int key2 = 10;
    int key3 = 30;
    int key4 = 40;
    // Search search = new LinearSearch();
    Search search = new BinarySearch();
    int res1 = search.search(array, key1), ans1 = 5;
    int res2 = search.search(array, key2), ans2 = 0;
    int res3 = search.search(array, key3), ans3 = 2;
    int res4 = search.search(array, key4), ans4 = -1;
    assertEquals(ans1, res1);
    assertEquals(ans2, res2);
    assertEquals(ans3, res3);
    assertEquals(ans4, res4);
  }
}
