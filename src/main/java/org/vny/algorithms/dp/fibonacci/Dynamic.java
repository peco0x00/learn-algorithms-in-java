package org.vny.algorithms.dp.fibonacci;

public class Dynamic implements Main {

  @Override
  public int fib(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    int[] dp = new int[n + 1];
    // base case
    dp[1] = dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }
}
