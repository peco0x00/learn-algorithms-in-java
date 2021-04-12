package org.vny.leetcode.problems.p0062;

public class Dynamic implements Main {

  // running time beat 100% of users
  // using space beat 68% of users
  // awesome!
  // dp[i][j] -> (i * j)'s path count
  public int uniquePaths(int m, int n) {
    int[][] dp = new int[m][n];
    for (int i = 0; i < m; i++) dp[i][0] = 1;
    for (int j = 0; j < n; j++) dp[0][j] = 1;
    for (int i = 0; i < m - 1; i++) {
      for (int j = 0; j < n - 1; j++) {
        dp[i + 1][j + 1] = dp[i + 1][j] + dp[i][j + 1];
      }
    }
    return dp[m - 1][n - 1];
  }
}
