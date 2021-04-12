package org.vny.leetcode.offer.p0042;

public class Naive implements Main {

  // dp[i] -> contains nums[i]'s max sub array sum
  @Override
  public int maxSubArray(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;
    int[] dp = new int[n + 1];
    int res = 0;
    dp[0] = nums[0];
    for (int i = 1; i < n; i++) {
      dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
      res = Math.max(res, dp[i]);
    }
    return res;
  }
}
