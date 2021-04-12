package org.vny.leetcode.problems.p0416;

public class Naive implements Main {

  @Override
  public boolean canPartition(int[] nums) {
    int W = 0;
    for (int i : nums) {
      W += i;
    }
    if ((W & 1) == 1) return false;
    W /= 2;
    int N = nums.length;
    boolean[][] dp = new boolean[N + 1][W + 1];
    for (int i = 1; i <= N; i++) dp[i][0] = true;
    for (int i = 1; i <= N; i++) {
      for (int w = 1; w <= W; w++) {
        if (w - nums[i - 1] < 0) {
          dp[i][w] = dp[i - 1][w];
        } else {
          dp[i][w] = dp[i - 1][w] || dp[i - 1][w - nums[i - 1]];
        }
      }
    }
    return dp[N][W];
  }
}
