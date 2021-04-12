package org.vny.leetcode.interview.p1716;

public class Naive implements Main {

  /*
  * dp[i][0] -> max massage time without choosing a[i]
  * dp[i][1] -> max massage time choosing a[i]
  * then:
  * dp[i + 1][0] = max(dp[i][0], dp[i][1])
  * dp[i + 1][1] = dp[i][0] + a[i + 1]
  * */
  @Override
  public int massage(int[] nums) {
    int n = nums.length;
    if (n == 0) return 0;
    int[][] dp = new int[n][2];
    dp[0][0] = 0;
    dp[0][1] = nums[0];
    for (int i = 1; i < n; i++) {
      dp[i][0] = Integer.max(dp[i - 1][0], dp[i - 1][1]);
      dp[i][1] = dp[i - 1][0] + nums[i];
    }
    return Integer.max(dp[n - 1][0], dp[n - 1][1]);
  }
}
