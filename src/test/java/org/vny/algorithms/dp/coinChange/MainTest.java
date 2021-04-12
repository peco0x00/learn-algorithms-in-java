package org.vny.algorithms.dp.coinChange;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void coinChange() {
    Main main = new Memo();
    int[] coins = {1, 2, 5};
    int amount = 11;
    int res = main.coinChange(coins, amount);
    int ans = 3;
    assertEquals(res, ans);
  }
}
