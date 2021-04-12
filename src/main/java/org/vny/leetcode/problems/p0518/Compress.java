package org.vny.leetcode.problems.p0518;

public class Compress implements Main {

  @Override
  public int change(int amount, int[] coins) {
    int n = coins.length;
    if (n == 0) return amount == 0 ? 1 : 0;
    int[] dp = new int[amount + 1];
    dp[0] = 1;
    for (int coin : coins) {
      for (int w = 1; w <= amount; w++) {
        if (w - coin >= 0) {
          dp[w] = dp[w] + dp[w - coin];
        }
      }
    }
    return dp[amount];
  }
}
