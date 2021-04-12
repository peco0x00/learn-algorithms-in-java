package org.vny.leetcode.problems.p0322;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void coinChange() {
    // Main main = new Naive();
    // Main main = new Recursive();
    Main main = new Dynamic();
    int[] coins = {1, 2, 5};
    int amount = 11;
    int res = main.coinChange(coins, amount);
    int ans = 3;
    assertEquals(ans, res);
  }
}
