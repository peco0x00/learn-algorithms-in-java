package org.vny.algorithms.dp.editDistance;

public class Naive implements Main {

  /*
   * for i, j in range(s1, 0), range(s2, 0):
   *   if s1[i] == s2[j]:
   *     i--, j--
   *   else:
   *     j--      # insert
   *     i--      # delete
   *     i--, j-- # replace
   * */
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
        dp(s, t, i, j - 1) + 1, dp(s, t, i - 1, j) + 1),
        dp(s, t, i - 1, j - 1) + 1);
  }
}
