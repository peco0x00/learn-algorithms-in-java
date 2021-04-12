package org.vny.leetcode.problems.p0712;

public class Compress implements Main {

  @Override
  public int minimumDeleteSum(String s1, String s2) {
    char[] s = s1.toCharArray(), t = s2.toCharArray();
    int m = s.length, n = t.length;
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      dp[i] += dp[i - 1] + t[i - 1];
    }
    for (int i = 1; i <= m; i++) {
      int pre = dp[0];
      dp[0] += s[i - 1];
      for (int j = 1; j <= n; j++) {
        int tmp = dp[j];
        if (s[i - 1] == t[j - 1]) dp[j] = pre;
        else dp[j] = Math.min(dp[j] + s[i - 1], dp[j - 1] + t[j - 1]);
        pre = tmp;
      }
    }
    return dp[n];
  }
}
