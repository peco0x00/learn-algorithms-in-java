package org.vny.algorithms.dp.knapsack.zeroOne;

public class Naive implements Main {

  @Override
  public int maxValue(int W, int N, int[] wt, int[] val) {
    int[][] dp = new int[N + 1][W + 1];
    for (int i = 1; i <= N; i++) {
      for (int w = 1; w <= W; w++) {
        if (w - wt[i - 1] < 0) {
          // 此时只能不装入，因为空间不足
          dp[i][w] = dp[i - 1][w];
        } else {
          // 择优，装入或者不装入
          dp[i][w] = Math.max(
              dp[i - 1][w - wt[i - 1]] + val[i - 1],
              dp[i - 1][w]);
        }
      }
    }
    return dp[N][W];
  }
}

