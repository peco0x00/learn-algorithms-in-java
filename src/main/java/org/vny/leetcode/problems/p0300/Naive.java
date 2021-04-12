package org.vny.leetcode.problems.p0300;

import java.util.Arrays;

public class Naive implements Main {

  // dp[i] -> 以A[i]结尾的A[1..i]序列的LIS
  // 不要想着dp[i]只与dp[i - 1]有关
  @Override
  public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n];
    Arrays.fill(dp, 1);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[j] < nums[i]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }
    int res = 0;
    for (int i : dp) res = Math.max(i, res);
    return res;
  }
}
