package org.vny.leetcode.problems.p1143;

public class Memo implements Main {

  @Override
  public int longestCommonSubsequence(String text1, String text2) {
    int n1 = text1.length(), n2 = text2.length();
    int[][] dp = new int[n1 + 1][n2 + 1];
    for (int i = 1; i <= n1; i++) {
      for (int j = 1; j <= n2; j++) {
        if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[n1][n2];
  }

  // faster
  private int func(String text1, String text2) {
    char[] a1 = text1.toCharArray();
    char[] a2 = text2.toCharArray();
    int n1 = a1.length, n2 = a2.length;
    int[][] dp = new int[n1 + 1][n2 + 1];
    for (int i = 1; i <= n1; i++) {
      for (int j = 1; j <= n2; j++) {
        if (a1[i - 1] == a2[j - 1]) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
        }
      }
    }
    return dp[n1][n2];
  }
}
