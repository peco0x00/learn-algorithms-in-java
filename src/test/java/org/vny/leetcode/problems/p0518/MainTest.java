package org.vny.leetcode.problems.p0518;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void change() {
    // Main main = new Naive();
    Main main = new Compress();
    int amount = 5;
    int[] coins = {1, 2, 5};
    int res = main.change(amount, coins);
    int ans = 4;
    assertEquals(ans, res);
  }
}
