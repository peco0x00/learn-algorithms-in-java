package org.vny.algorithms.dp.scrollingArray.fibonacci;

public class Compress01 implements Main {

  @Override
  public int fib(int n) {
    int[] dp = new int[3];
    if (n < 2) return n;
    dp[1] = 1;
    dp[2] = 1;
    for (int i = 3; i <= n; i++) {
      dp[i % 3] = dp[(i - 1) % 3] + dp[(i - 2) % 3];
    }
    return dp[2];
  }
}
