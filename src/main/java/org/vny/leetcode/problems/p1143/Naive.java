package org.vny.leetcode.problems.p1143;

public class Naive implements Main {

  @Override
  public int longestCommonSubsequence(String text1, String text2) {
    return dp(text1.length() - 1, text2.length() - 1, text1, text2);
  }

  private int dp(int i, int j, String text1, String text2) {
    if (i == -1 || j == -1) return 0;
    if (text1.charAt(i) == text2.charAt(j)) {
      return dp(i - 1, j - 1, text1, text2) + 1;
    } else {
      return Integer.max(
          dp(i - 1, j, text1, text2),
          dp(i, j - 1, text1, text2));
    }
  }
}
