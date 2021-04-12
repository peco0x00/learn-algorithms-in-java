package org.vny.leetcode.problems.p0746;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void minCostClimbingStairs() {
    // Main main = new Naive();
    Main main = new Compress();
    int[] cost1 = {10, 15, 20};
    int res1 = main.minCostClimbingStairs(cost1);
    int ans1 = 15;
    assertEquals(ans1, res1);

    int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    int res2 = main.minCostClimbingStairs(cost2);
    int ans2 = 6;
    assertEquals(ans2, res2);
  }
}
