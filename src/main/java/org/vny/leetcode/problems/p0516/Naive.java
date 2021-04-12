package org.vny.leetcode.problems.p0516;

public class Naive implements Main {

  /*
  * dp[i][j] -> A[i..j]'s longest ...
  * dp[i][i] = 1
  * if A[i] == A[j]:
  *   dp[i][j] = dp[i + 1][j - 1] + 2
  * else:
  *   dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1])
  * */
  @Override
  public int longestPalindromeSubseq(String s) {
    char[] a = s.toCharArray();
    int n = a.length;
    int[][] dp = new int[n + 1][n + 1];
    for (int i = 0; i < n; i++) {
      dp[i][i] = 1;
    }
    for (int i = n - 1; i >= 0; i--) {
      for (int j = i + 1; j < n; j++) {
        if (a[i] == a[j]) dp[i][j] = dp[i + 1][j - 1] + 2;
        else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
      }
    }
    return dp[0][n - 1];
  }

  public int func(String s) {
    char[] a = s.toCharArray();
    int n = a.length;
    int[][] dp = new int[n + 1][n + 1];
    for (int l = 1; l <= n; l++) {
      for (int i = 0; i + l <= n; i++) {
        int j = i + l - 1;
        if (l == 1) dp[i][j] = 1;
        else if (a[i] == a[j]) dp[i][j] = dp[i + 1][j - 1] + 2;
        else dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
      }
    }
    return dp[0][n - 1];
  }
}
