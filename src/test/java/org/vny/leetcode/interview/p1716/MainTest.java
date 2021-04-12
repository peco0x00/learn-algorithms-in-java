package org.vny.leetcode.interview.p1716;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void massage() {
    // Main main = new Naive();
    Main main = new Compress();
    int[] nums = {1, 2, 3, 1};
    int res = main.massage(nums);
    int ans = 4;
    assertEquals(ans, res);
  }
}
