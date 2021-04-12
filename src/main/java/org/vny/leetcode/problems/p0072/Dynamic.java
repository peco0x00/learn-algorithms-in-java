package org.vny.leetcode.problems.p0072;

public class Dynamic implements Main {

  /*
  * dp[i][j] -> s[i..] and t[j..]'s min opt count
  * if s[i] == t[j]:
  *   dp[i][j] = dp[i - 1][j - 1]
  * else:
  *   dp[i][j] = min(dp[i][j - 1], dp[i - 1][j], dp[i - 1][j - 1] + 1
  * */
  @Override
  public int minDistance(String word1, String word2) {
    char[] s = word1.toCharArray(), t = word2.toCharArray();
    int m = s.length, n = t.length;
    int[][] dp = new int[m + 1][n + 1];
    // base case
    for (int i = 1; i <= m; i++) dp[i][0] = i;
    for (int i = 1; i <= n; i++) dp[0][i] = i;
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (s[i - 1] == t[j - 1]) dp[i][j] = dp[i - 1][j - 1];
        else dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]) + 1, dp[i - 1][j - 1] + 1);
      }
    }
    return dp[m][n];
  }
}
