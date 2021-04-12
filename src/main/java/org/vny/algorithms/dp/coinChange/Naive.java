package org.vny.algorithms.dp.coinChange;

public class Naive implements Main {

  @Override
  public int coinChange(int[] coins, int amount) {
    // base case
    if (amount < 0) return -1;
    if (amount == 0) return 0;
    int res = Integer.MAX_VALUE;
    for (int coin : coins) {
      int sub = coinChange(coins, amount - coin);
      if (sub == -1) continue;
      res = Math.min(res, 1 + sub);
    }
    return res == Integer.MAX_VALUE ? -1 : res;
  }
}
