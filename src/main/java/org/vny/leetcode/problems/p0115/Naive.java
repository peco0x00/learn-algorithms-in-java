package org.vny.leetcode.problems.p0115;

public class Naive implements Main {

  @Override
  public int numDistinct(String s, String t) {
    char[] s1 = s.toCharArray(), s2 = t.toCharArray();
    int m = s1.length, n = s2.length;
    int[][] dp = new int[m + 1][n + 1];
    for (int i = m - 1; i >= 0; i--) {
      for (int j = n - 1; j >= 0; j--) {
        if (s1[i] == s2[j]) dp[i][j] = dp[i + 1][j + 1];
        else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
      }
    }
    return dp[0][0];
  }
}
