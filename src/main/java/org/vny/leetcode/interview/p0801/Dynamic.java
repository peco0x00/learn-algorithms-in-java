package org.vny.leetcode.interview.p0801;

public class Dynamic implements Main {

  @Override
  public int waysToStep(int n) {
    int N = 1000000007;
    if (n == 0) return 0;
    int[] dp = new int[n + 2];
    dp[0] = 0;
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;
    for (int i = 4; i <= n; i++) {
      dp[i] = ((dp[i - 1] + dp[i - 2]) % N + dp[i - 3]) % N;
    }
    return dp[n];
  }
}
