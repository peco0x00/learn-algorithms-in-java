package org.vny.leetcode.problems.p0746;

public class Solution01 implements Main {

  // dp[i]: a[1..i]'s min cost
  // dp[i] = min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2])
  @Override
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n + 1];
    dp[0] = dp[1] = 0;
    for (int i = 2; i <= n; i++) {
      dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
    }
    return dp[n];
  }
}
