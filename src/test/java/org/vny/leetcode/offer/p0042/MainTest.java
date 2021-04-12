package org.vny.leetcode.offer.p0042;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void maxSubArray() {
    // Main main = new Naive();
    Main main = new Compress();
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int res = main.maxSubArray(nums);
    int ans = 6;
    assertEquals(ans, res);
  }
}
