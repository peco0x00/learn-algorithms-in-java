package org.vny.leetcode.problems.p0583;

public class Naive implements Main {

  @Override
  public int minDistance(String word1, String word2) {
    char[] s = word1.toCharArray(), t = word2.toCharArray();
    int m = s.length, n = t.length;
    return dp(s, t, m - 1, n - 1);
  }

  private int dp(char[] s, char[] t, int i, int j) {
    if (i == -1) return j + 1;
    if (j == -1) return i + 1;
    if (s[i] == t[j]) return dp(s, t, i - 1, j - 1);
    return Math.min(Math.min(
      dp(s, t, i - 1, j), dp(s, t, i, j - 1)) + 1,
      dp(s, t, i - 1, j - 1) + 2);
  }
}
