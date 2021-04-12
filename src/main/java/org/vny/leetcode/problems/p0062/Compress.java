package org.vny.leetcode.problems.p0062;

import java.util.Arrays;

public class Compress implements Main {

  public int uniquePaths(int m, int n) {
    int[] dp = new int[n];
    Arrays.fill(dp, 1);
    for (int i = 0; i < m - 1; i++) {
      for (int j = 0; j < n - 1; j++) {
        dp[j + 1] = dp[j + 1] + dp[j];
      }
    }
    System.out.println(Arrays.toString(dp));
    return dp[n - 1];
  }
}
