package org.vny.algorithms.dp.coinChange;

public class Memo implements Main {

  @Override
  public int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    return dp(dp, coins, amount);
  }

  private int dp(int[] dp, int[] coins, int amount) {
    if (amount < 0)  return -1;
    if (amount == 0) return 0;
    if (dp[amount] > 0) return dp[amount];
    int res = Integer.MAX_VALUE;
    for (int coin : coins) {
      int sub = dp(dp, coins, amount - coin);
      if (sub == -1) continue;
      res = Integer.min(sub + 1, res);
    }
    return dp[amount] = res == Integer.MAX_VALUE ? -1  : res;
  }
}
