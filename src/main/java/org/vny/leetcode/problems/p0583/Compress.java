package org.vny.leetcode.problems.p0583;

public class Compress implements Main {

  @Override
  public int minDistance(String word1, String word2) {
    char[] s = word1.toCharArray(), t = word2.toCharArray();
    int m = s.length, n = t.length;
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) dp[i] = i;
    for (int i = 1; i <= m; i++) {
      dp[0] = i;
      int pre = i - 1;
      for (int j = 1; j <= n; j++) {
        int tmp = dp[j];
        if (s[i - 1] == t[j - 1]) dp[j] = pre;
        else dp[j] = Math.min(dp[j - 1], dp[j]) + 1;
        pre = tmp;
      }
    }
    return dp[n];
  }
}
