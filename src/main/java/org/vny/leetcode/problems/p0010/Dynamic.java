package org.vny.leetcode.problems.p0010;

public class Dynamic implements Main {

  /*
  * bottom-top dynamic programming
  * dp[i][j] represents if s[0..i] match p[0..j]
  *
  * def isMatch(s, p, i, j):
  *   if p[i] != '.' and p[i] != '*':
  *     if p[i] == s[i]:
  *       dp[i][j] = dp[i - 1][j - 1]
  *     else:
  *       dp[i][j] = false
  *   elif p[i] == '*':
  *     if s[i] == p[j - 1]:    # p[j] match multiple or zero s[i]
  *       dp[i][j] = dp[i - 1][j] or dp[i][j - 2]
  *     else:
  *       dp[i][j] = dp[i][j - 2]
  *   else:   # p[j] == '.'
  *     dp[i][j] = true
  * */
  @Override
  public boolean isMatch(String s, String p) {
    char[] as = s.toCharArray();
    char[] ap = p.toCharArray();
    int m = as.length, n = ap.length;
    boolean[][] dp = new boolean[m + 1][n + 1];
    dp[0][0] = true;
    for (int i = 0; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (ap[j - 1] == '*') {
          dp[i][j] = dp[i][j - 2];
          if (matches(as, i, ap, j - 1)) {
            dp[i][j] = dp[i][j] || dp[i - 1][j];
          }
        } else {
          if (matches(as, i, ap, j)) {
            dp[i][j] = dp[i - 1][j - 1];
          }
        }
      }
    }
    return dp[m][n];
  }

  // check if s[i] matches p[j]
  // only match if s[i] == p[j] or p[j] == '.'
  private boolean matches(char[] s, int i, char[] p, int j) {
    if (i == 0) return false;
    if (p[j - 1] == '.') return true;
    return s[i - 1] == p[j - 1];
  }
}
