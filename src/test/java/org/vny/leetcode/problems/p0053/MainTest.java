package org.vny.leetcode.problems.p0053;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void maxSubArray() {
    Main main = new Naive();
    int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int res1 = main.maxSubArray(nums1);
    int ans1 = 6;
    assertEquals(ans1, res1);

    int[] nums2 = {1};
    int res2 = main.maxSubArray(nums2);
    int ans2 = 1;
    assertEquals(ans2, res2);
  }
}
