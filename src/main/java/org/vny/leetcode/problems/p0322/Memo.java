package org.vny.leetcode.problems.p0322;

public class Memo implements Main {

  @Override
  public int coinChange(int[] coins, int amount) {
    int[] dpt = new int[amount + 1];
    return helper(dpt, coins, amount);
  }

  private int helper(int[] dpt, int[] coins, int amount) {
    if (amount < 0) return -1;
    if (amount == 0) return 0;
    if (dpt[amount] > 0) return dpt[amount];
    int res = amount + 1;
    for (int coin : coins) {
      int sub = helper(dpt, coins, amount - coin);
      if (sub == -1) continue;
      res = Integer.min(res, sub + 1);
    }
    dpt[amount] = res;
    return res == amount + 1 ? -1 : res;
  }
}
