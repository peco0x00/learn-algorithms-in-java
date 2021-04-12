package org.vny.algorithms.dp.targetSum;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void findTargetSumWays() {
    Main main = new Backtrack();
    int[] nums = {1, 1, 1, 1, 1};
    int S = 3;
    int res = main.findTargetSumWays(nums, S);
    int ans = 5;
    assertEquals(ans, res);
  }
}
