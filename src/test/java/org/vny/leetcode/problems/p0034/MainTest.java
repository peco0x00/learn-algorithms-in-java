package org.vny.leetcode.problems.p0034;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void searchRange() {
    // Main main = new Naive();
    Main main = new Solution01();
    int[] nums1 = {5, 7, 7, 8, 8, 10};
    int target1 = 8;
    int[] res1 = main.searchRange(nums1, target1);
    int[] ans1 = {3, 4};
    assertArrayEquals(ans1, res1);

    int[] nums2 = {5, 7, 7, 8, 8, 10};
    int target2 = 6;
    int[] res2 = main.searchRange(nums2, target2);
    int[] ans2 = {-1, -1};
    assertArrayEquals(ans2, res2);

    int[] nums3 = {};
    int target3 = 0;
    int[] res3 = main.searchRange(nums3, target3);
    int[] ans3 = {-1, -1};
    assertArrayEquals(ans3, res3);
  }
}
