package org.vny.leetcode.problems.p0746;

public class Naive implements Main {

  // solve this by myself!
  // running time beat 99.64% of the users!
  // using space beat 52.26% of the users!
  // awesome!
  // can do the space compress!
  @Override
  public int minCostClimbingStairs(int[] cost) {
    int n = cost.length; // n >= 2
    int[][] dp = new int[n + 1][2];
    dp[1][0] = cost[0];
    dp[1][1] = cost[1];
    for (int i = 2; i < n; i++) {
      dp[i][0] = dp[i - 1][1];
      dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i];
    }
    return Math.min(dp[n - 1][0], dp[n - 1][1]);
  }
}
