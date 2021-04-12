package org.vny.leetcode.problems.p0072;

public class Compress implements Main {

  // awesome!
  // running time beat 100% of the users
  // using space beat 99.53% of the users!
  @Override
  public int minDistance(String word1, String word2) {
    char[] s = word1.toCharArray(), t = word2.toCharArray();
    int m = s.length, n = t.length;
    if (n == 0) return m;
    if (m == 0) return n;
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) dp[i] = i;
    for (int i = 1; i <= m; i++) {
      // pay attention:
      // dp[i - 1][j] -> dp[j]
      // so dp[0] = i - 1. not dp[0] = i
      dp[0] = i - 1;
      int pre = dp[0];
      for (int j = 1; j <= n; j++) {
        int tmp = dp[j];
        if (s[i - 1] == t[j - 1]) dp[j] = pre;
        else dp[j] = Math.min(Math.min(dp[j], dp[j - 1]), pre) + 1;
        pre = tmp;
      }
    }
    return dp[n];
  }
}
