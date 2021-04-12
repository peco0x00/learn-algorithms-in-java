package org.vny.leetcode.problems.p0712;

public class Dynamic01 implements Main {

  @Override
  public int minimumDeleteSum(String s1, String s2) {
    char[] s = s1.toCharArray(), t = s2.toCharArray();
    int m = s.length, n = t.length;
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) {
      dp[i][0] += dp[i - 1][0] + s[i - 1];
    }
    for (int j = 1; j <= n; j++) {
      dp[0][j] += dp[0][j - 1] + t[j - 1];
    }
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (s[i - 1] == t[j - 1]) dp[i][j] = dp[i - 1][j - 1];
        else dp[i][j] = Math.min(
            dp[i][j - 1] + t[j - 1],
            dp[i - 1][j] + s[i - 1]);
      }
    }
    return dp[m][n];
  }
}
