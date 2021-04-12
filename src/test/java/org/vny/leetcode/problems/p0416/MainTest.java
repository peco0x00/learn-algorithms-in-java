package org.vny.leetcode.problems.p0416;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void canPartition() {
    // Main main = new Naive();
    Main main = new Compress();
    int[] nums1 = {1, 5, 11, 5};
    boolean res1 = main.canPartition(nums1);
    boolean ans1 = true;
    assertEquals(ans1, res1);

    int[] nums2 = {1, 2, 3, 5};
    boolean res2 = main.canPartition(nums2);
    boolean ans2 = false;
    assertEquals(ans2, res2);

    int[] nums3 = {1, 2, 5};
    boolean res3 = main.canPartition(nums3);
    boolean ans3 = false;
    assertEquals(ans3, res3);
  }
}
