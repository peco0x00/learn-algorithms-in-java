package org.vny.leetcode.problems.p0300;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void lengthOfLIS() {
    // Main main = new Naive();
    Main main = new Solution02();
    int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
    int res1 = main.lengthOfLIS(nums1);
    int ans1 = 4;
    assertEquals(ans1, res1);

    int[] nums2 = {0, 1, 0, 3, 2, 3};
    int res2 = main.lengthOfLIS(nums2);
    int ans2 = 4;
    assertEquals(ans2, res2);

    int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
    int res3 = main.lengthOfLIS(nums3);
    int ans3 = 1;
    assertEquals(ans3, res3);
  }
}
