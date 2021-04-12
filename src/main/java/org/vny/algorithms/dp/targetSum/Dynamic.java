package org.vny.algorithms.dp.targetSum;

public class Dynamic implements Main {

  @Override
  public int findTargetSumWays(int[] nums, int S) {
    int n = nums.length;
    if (n == 0) return 0;
    int[][] dp = new int[n + 1][2];
    dp[0][0] = nums[0];
    dp[0][1] = -nums[0];
    return 0;
  }
}
