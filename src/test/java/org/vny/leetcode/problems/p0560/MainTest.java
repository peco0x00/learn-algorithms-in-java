package org.vny.leetcode.problems.p0560;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void subarraySum() {
    // Main main = new Naive();
    Main main = new Memo();
    int[] nums = {1, 1, 1};
    int k = 2;
    int res = main.subarraySum(nums, k);
    int ans = 2;
    assertEquals(ans, res);
  }
}
