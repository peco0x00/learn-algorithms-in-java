package org.vny.leetcode.problems.p0712;

public class Naive implements Main {

  @Override
  public int minimumDeleteSum(String s1, String s2) {
    char[] s = s1.toCharArray(), t = s2.toCharArray();
    int m = s.length, n = t.length;
    return dp(s, t, m - 1, n - 1);
  }

  private int dp(char[] s, char[] t, int i, int j) {
    int res = 0;
    if (i == -1) {
      for (int k = 0; k <= j; k++) res += t[k];
      return res;
    }
    if (j == -1) {
      for (int k = 0; k <= i; k++) res += s[k];
      return res;
    }
    if (s[i] == t[j]) return dp(s, t, i - 1, j - 1);
    return Math.min(dp(s, t, i, j - 1) + t[j], dp(s, t, i - 1, j) + s[i]);
  }
}
