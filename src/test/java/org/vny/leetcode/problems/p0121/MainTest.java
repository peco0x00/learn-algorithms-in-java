package org.vny.leetcode.problems.p0121;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void maxProfit() {
    // Main main = new Naive();
    // Main main = new Dynamic();
    Main main = new Compress();
    int[] prices1 = {7, 1, 5, 3, 6, 4};
    int res1 = main.maxProfit(prices1);
    int ans1 = 5;
    assertEquals(ans1, res1);

    int[] prices2 = {1, 2};
    int res2 = main.maxProfit(prices2);
    int ans2 = 1;
    assertEquals(ans2, res2);

    int[] prices3 = {7, 6, 4, 3, 1};
    int res3 = main.maxProfit(prices3);
    int ans3 = 0;
    assertEquals(ans3, res3);
  }
}
