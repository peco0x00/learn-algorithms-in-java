package org.vny.leetcode.problems.p1143;

public class StatusCompress implements Main {

  @Override
  public int longestCommonSubsequence(String text1, String text2) {
    char[] a1 = text1.toCharArray();
    char[] a2 = text2.toCharArray();
    int n1 = a1.length, n2 = a2.length;
    int[] dp = new int[n2 + 1];
    for (int i = 1; i <= n1; i++) {
      int pre = 0;
      for (int j = 1; j <= n2; j++) {
        int tmp = dp[j];
        if (a1[i - 1] == a2[j - 1]) {
          dp[j] = pre + 1;
        } else {
          dp[j] = Integer.max(dp[j], dp[j - 1]);
        }
        pre = tmp;
      }
    }
    return dp[n2];
  }
}
