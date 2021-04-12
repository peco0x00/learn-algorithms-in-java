package org.vny.leetcode.problems.p0350;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {

  @Test
  public void intersect() {
    // Main main = new Naive();
    // Main main = new Solution01();
    Main main = new Naive01();
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] res1 = main.intersect(nums1, nums2);
    int[] ans1 = {2, 2};
    assertArrayEquals(ans1, res1);

    int[] nums3 = {4, 9, 5};
    int[] nums4 = {9, 4, 9, 8, 4};
    int[] res2 = main.intersect(nums3, nums4);
    int[] ans2 = {4, 9};
    assertArrayEquals(ans2, res2);
  }
}
