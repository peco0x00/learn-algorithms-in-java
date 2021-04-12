package org.vny.algorithms.dp.LIS;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void lengthOfLIS() {
    int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
    // Main main = new Naive();
    Main main = new BinarySearch();
    int res1 = main.lengthOfLIS(nums1);
    int ans1 = 4;
    assertEquals(res1, ans1);

    int[] nums2 = {0, 1, 0, 3, 2, 3};
    int res2 = main.lengthOfLIS(nums2);
    int ans2 = 4;
    assertEquals(res2, ans2);
  }
}
