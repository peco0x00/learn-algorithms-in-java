package org.vny.leetcode.problems.p1658;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void minOperations() {
    Main main = new Naive();
    int[] nums1 = {1, 1, 4, 2, 3};
    int x1 = 5;
    int res1 = main.minOperations(nums1, x1);
    int ans1 = 2;
    assertEquals(ans1, res1);
  }
}
