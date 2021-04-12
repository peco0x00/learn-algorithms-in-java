package org.vny.leetcode.offer.p0053;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void missingNumber() {
    // Main main = new Naive();
    Main main = new Naive01();
    int[] nums1 = {0, 1, 3};
    int res1 = main.missingNumber(nums1);
    int ans1 = 2;
    assertEquals(ans1, res1);

    int[] nums2 = {0, 1, 2, 3, 4, 5, 6, 7, 9};
    int res2 = main.missingNumber(nums2);
    int ans2 = 8;
    assertEquals(ans2, res2);

    int[] nums3 = {0, 1};
    int res3 = main.missingNumber(nums3);
    int ans3 = 2;
    assertEquals(ans3, res3);

    int[] nums4 = {0};
    int res4 = main.missingNumber(nums4);
    int ans4 = 1;
    assertEquals(ans4, res4);
  }
}
