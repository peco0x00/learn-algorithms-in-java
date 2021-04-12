package org.vny.leetcode.problems.p0322;

public class Naive implements Main {

  @Override
  public int coinChange(int[] coins, int amount) {
    // base case
    if (amount < 0) return -1;
    if (amount == 0) return 0;
    int res = amount + 1;
    // status transition
    for (int coin : coins) {
      int sub = coinChange(coins, amount - coin);
      if (sub == -1) continue;
      res = Integer.min(res, sub + 1);
    }
    return res;
  }
}
