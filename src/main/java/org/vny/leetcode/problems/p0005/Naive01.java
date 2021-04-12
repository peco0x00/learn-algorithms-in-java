package org.vny.leetcode.problems.p0005;

public class Naive01 implements Main {

  /*
  * dp[i][j] -> if A[i..j] is a palindrome
  * if A[i..j] is, then A[i + 1..j - 1] too
  * dp[i]][j] = dp[i - 1][j + 1] && A[i] == A[j]
  * */
  @Override
  public String longestPalindrome(String s) {
    char[] a = s.toCharArray();
    int n = a.length;
    int start = 0, maxLen = 0;
    boolean[][] dp = new boolean[n + 1][n + 1];
    // l -> length of substring - 1
    // i -> left index of substring
    // j -> right index of substring
    for (int l = 0; l < n; l++) {
      for (int i = 0; i + l < n; i++) {
        int j = i + l;
        if (l == 0) {
          dp[i][j] = true;
        } else if (l == 1) {
          dp[i][j] = a[i] == a[j];
        } else {
          dp[i][j] = (a[i] == a[j] && dp[i + 1][j - 1]);
        }
        if (dp[i][j] && l + 1 > maxLen) {
          maxLen = l + 1;
          start = i;
        }
      }
    }
    return s.substring(start, maxLen + start);
  }
}
