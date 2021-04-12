package org.vny.leetcode.problems.p0005;

public class Solution02 implements Main {

  /*
  * P[i] -> center i's length of arms
  * what we need:
  * 1. the start index of the longest palindrome
  * 2. the length of the longest palindrome
  *
  * how can we get the start index?
  *   start index = (i - P[i]) / 2
  *   because: P[i] is the length of arms of current palindrome
  *   for example: ^#c#b#c#$
  *                    ^
  *                 index = 4
  *                 P[i] = 3
  *   i - P[i] gets the start index in expanded string
  *   because the original string add '#'s, which expanded the length by 2
  *   so we need to (i - p[i]) / 2 to get the start index in original string
  * but how can we get the p[i]?
  *   C is the center of current palindrome, R is the right index of the arm
  *   so R = C + p[C]
  *   i_mirror is the mirror of i, C is the center
  *   so P[i] = P[i_mirror]
  * but there are three situations P[i] != P[i_mirror]:
  *   1. P[i_mirror] + i > R
  *     P[i] =
  * */
  @Override
  public String longestPalindrome(String s) {
    String T = preProcess(s);
    int n = T.length();
    int[] P = new int[n];
    int C = 0, R = 0;
    for (int i = 1; i < n - 1; i++) {
      int i_mirror = 2 * C - i;
      if (R > i) {
        P[i] = Math.min(R - i, P[i_mirror]);
      } else {
        P[i] = 0;
      }
      while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i])) {
        P[i]++;
      }
      if (i + P[i] > R) {
        C = i;
        R = i + P[i];
      }
    }
    int maxLen = 0;
    int centerIndex = 0;
    for (int i = 1; i < n - 1; i++) {
      if (P[i] > maxLen) {
        maxLen = P[i];
        centerIndex = i;
      }
    }
    int start = (centerIndex - maxLen) / 2;
    return s.substring(start, maxLen + start);
  }

  public String preProcess(String s) {
    int n = s.length();
    if (n == 0) return "^$";
    StringBuilder res = new StringBuilder("^");
    for (int i = 0; i < n; i++) {
      res.append("#").append(s.charAt(i));
    }
    return res.append("$").toString();
  }
}

