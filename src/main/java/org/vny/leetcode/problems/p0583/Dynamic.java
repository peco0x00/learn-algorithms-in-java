package org.vny.leetcode.problems.p0583;

public class Dynamic implements Main {

  // dp[i][j] -> s[0..i] and t[0..j]'s min distance
  // dp[i][0] -> s[0..i] and ""'s min distance
  // dp[0][j] -> "" and t[0..j]'s min distance
  @Override
  public int minDistance(String word1, String word2) {
    char[] s = word1.toCharArray(), t = word2.toCharArray();
    int m = s.length, n = t.length;
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 1; i <= m; i++) dp[i][0] = i;
    for (int j = 1; j <= n; j++) dp[0][j] = j;
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (s[i - 1] == t[j - 1]) dp[i][j] = dp[i - 1][j - 1];
        else dp[i][j] = Math.min(Math.min(
            dp[i][j - 1], dp[i - 1][j]) + 1,
            dp[i - 1][j - 1] + 2);
      }
    }
    return dp[m][n];
  }
}
