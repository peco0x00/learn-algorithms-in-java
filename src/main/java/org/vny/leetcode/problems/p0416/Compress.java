package org.vny.leetcode.problems.p0416;

public class Compress implements Main {

  @Override
  public boolean canPartition(int[] nums) {
    int W = 0;
    for (int i : nums) {
      W += i;
    }
    if ((W & 1) == 1) return false;
    W /= 2;
    int N = nums.length;
    boolean[] dp = new boolean[W + 1];
    dp[0] = true;
    for (int i = 1; i <= N; i++) {
      for (int w = W; w > 0; w--) {
        if (w - nums[i - 1] >= 0) {
          dp[w] = dp[w] || dp[w - nums[i - 1]];
        }
      }
    }
    return dp[W];
  }
}
