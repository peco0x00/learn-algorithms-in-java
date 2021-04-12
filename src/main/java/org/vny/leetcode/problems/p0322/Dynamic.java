package org.vny.leetcode.problems.p0322;

import java.util.Arrays;

public class Dynamic implements Main {

  @Override
  public int coinChange(int[] coins, int amount) {
    int[] dpt = new int[amount + 1];
    Arrays.fill(dpt, amount + 1);
    dpt[0] = 0;
    for (int i = 0; i < dpt.length; i++) {
      for (int coin : coins) {
        if (i < coin) continue;
        dpt[i] = Integer.min(dpt[i], dpt[i - coin] + 1);
      }
    }
    return dpt[amount] == amount + 1 ? -1 : dpt[amount];
  }
}
