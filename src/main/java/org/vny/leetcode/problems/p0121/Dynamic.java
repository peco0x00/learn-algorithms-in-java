package org.vny.leetcode.problems.p0121;

public class Dynamic implements Main {

  /*
  * dp[i] -> max sub array sum, the sub array must ended with a[i]
  * */
  @Override
  public int maxProfit(int[] prices) {
    int n = prices.length;
    if (n == 0 || n == 1) return 0;
    for (int i = n - 1; i > 0; i--) {
      prices[i] -= prices[i - 1];
    }
    int[] dp = new int[n + 1];
    int res = dp[0] = prices[1];
    for (int i = 1; i < n - 1; i++) {
      dp[i] = Math.max(dp[i - 1] + prices[i + 1], prices[i + 1]);
      res = Math.max(res, dp[i]);
    }
    return Math.max(res, 0);
  }
}
